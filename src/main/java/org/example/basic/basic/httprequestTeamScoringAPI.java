package org.example.basic.basic;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/*
 * Method1 java.net.HttpURLConnection
 * */

public class httprequestTeamScoringAPI {

  public static int getAllData(
      URL url, String year, String teamName, int page, int data, String type)
      throws IOException, ParseException {
    HttpURLConnection connect = (HttpURLConnection) url.openConnection();
    connect.setRequestMethod("GET");
    connect.setConnectTimeout(5000);
    connect.addRequestProperty("Content-Type", "application/json");
    if(connect.getResponseCode()!=200) throw new IOException("Can not process") ;
    BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
    String inputLine;
    StringBuilder content = new StringBuilder();
    while ((inputLine = in.readLine()) != null) {
      content.append(inputLine);
    }
    JSONParser parser = new JSONParser();
    Object obj = parser.parse(content.toString());
    JSONObject result = new JSONObject((Map) obj);
    int totalPages = Integer.parseInt(result.get("total_pages").toString());
    JSONArray arraydata = (JSONArray) result.get("data");

    for(int i = 0  ; i<arraydata.size() ; i++){
      JSONObject subresult = (JSONObject) arraydata.get(i);
      int goal = Integer.parseInt(subresult.get(type).toString());
      data +=((goal));
    }
    if (page < totalPages) {
      page++;
      return    getAllData(url, year, teamName, page, data, type); // direct recursion
    }
    connect.disconnect();
    return data;
  }

  public static void main(String[] args) throws IOException, ParseException {
    // set up the connection
    String teamName = "Barcelona"; // take what ever comes to the input
    String year = "2011"; //take the year input data as well
    int page = 1;
    // building the base page
    URL url =
        new URL(
            "https://jsonmock.hackerrank.com/api/football_matches?year="
                + year
                + "&team1="
                + teamName
                + "&page="
                + page);
    URL url2 =
        new URL(
            "https://jsonmock.hackerrank.com/api/football_matches?year="
                + year
                + "&team2="
                + teamName
                + "&page="
                + page);

    int resultData =  getAllData(url, year, teamName, page, 0, "team1goals");
    int resultData2 = getAllData(url2, year, teamName, page, 0, "team2goals");


    System.out.println(resultData+resultData2);
    // JsonObject object  =  new Json
  }
}
