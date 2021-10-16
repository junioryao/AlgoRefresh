package org.example.basic.basic;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FootballCompetitionWinningGoalsApi {

  public static int getTotalGoals(
      int page,
      String winner,
      String competition,
      String year,
      int result,
      String type,
      String team)
      throws IOException, ParseException {
    URL url1 =
        new URL(
            "https://jsonmock.hackerrank.com/api/football_matches?competition="
                + competition
                + "&year="
                + year
                + "&"
                + team
                + "="
                + winner
                + "&page="
                + page);
    System.out.println(url1); // verify url
    HttpURLConnection httpURLConnect = (HttpURLConnection) (url1.openConnection());
    if (httpURLConnect.getResponseCode() != 200) throw new IOException("Can not process");

    InputStream inputStream = httpURLConnect.getInputStream();
    InputStreamReader inputReader = new InputStreamReader(inputStream);
    BufferedReader bufferReader = new BufferedReader(inputReader);
    StringBuilder sb = new StringBuilder();

    String p;
    while ((p = bufferReader.readLine()) != null) {
      sb.append(p);
    }

    // considere the object

    JSONParser parser = new JSONParser();
    Object objectdata = parser.parse(sb.toString());
    JSONObject object = (JSONObject) objectdata;
    int totalPages = Integer.parseInt(object.get("total_pages").toString());
    JSONArray dataArray = (JSONArray) object.get("data");
    for (Object o : dataArray) {
      JSONObject dd = (JSONObject) o;
      result += Integer.parseInt(dd.get(type).toString());
    }

    // System.out.println(result);
    if (page < totalPages) {
      // direct  recursion
      return result + getTotalGoals(++page, winner, competition, year, 0, type, team);
    }
    httpURLConnect.disconnect();
    return result;
  }

  public static String winner(URL url) throws IOException, ParseException {

    HttpURLConnection connect = (HttpURLConnection) url.openConnection();
    connect.setRequestMethod("GET");
    if (connect.getResponseCode() != 200) throw new IOException("Can not process");

    InputStream result = connect.getInputStream();
    // convert input stream to string
    InputStreamReader streamReader = new InputStreamReader(result);
    BufferedReader bufferedReader = new BufferedReader(streamReader);
    StringBuilder sb = new StringBuilder();
    String p;
    while ((p = bufferedReader.readLine()) != null) {
      sb.append(p);
    }

    // convert it into object
    // create a parser
    JSONParser parser = new JSONParser();
    // create an object
    Object object = parser.parse(sb.toString());
    JSONObject resultObject = (JSONObject) object;
    // get the data
    JSONArray data = (JSONArray) resultObject.get("data");
    // get an object
    JSONObject winner = (JSONObject) data.get(0);
    connect.disconnect();
    return winner.get("winner").toString();
  }

  public static int getFootballComp(String competition, String year)
      throws IOException, ParseException {
    // get the name of the team who won the competition preprocess the space
    competition = competition.trim();
    competition = competition.replace(" ", "%20");
    URL url =
        new URL(
            "https://jsonmock.hackerrank.com/api/football_competitions?name="
                + competition
                + "&year="
                + year);
    String winner = winner(url);
    winner = winner.trim();
    winner = winner.replace(" ", "%20");
    // get all goals from the winner
    int page = 1; // base page ;
    // type denote whether we should consider home or visiting score
    int home = getTotalGoals(page, winner, competition, year, 0, "team1goals", "team1");
    int visitor = getTotalGoals(page, winner, competition, year, 0, "team2goals", "team2");
    System.out.println(
        "===============================RESULT======================================");
    System.out.println(home);
    System.out.println(visitor);
    return home + visitor;
  }

  public static void main(String[] args) throws IOException, ParseException {

    int result = getFootballComp("La Liga", "2012");
    System.out.println(result);
  }
}
