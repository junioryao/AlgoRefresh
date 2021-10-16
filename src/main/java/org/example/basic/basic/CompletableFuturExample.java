package org.example.basic.basic;

import java.util.concurrent.CompletableFuture;

public class CompletableFuturExample {

  public static void main(String[] args) {

    // then apply  ==  transform , technically work as a map
    //  a consumer use an interface and return a void
    // we have supply  => supply return data
    // then run does not return any things it is a void methods (take a runnable object )

    CompletableFuture<Integer> futureElement = new CompletableFuture<>();
    futureElement
        .thenApply(data -> data * 2)
        .thenApply(data -> Math.pow(data, 3))
        .thenAccept(System.out::println);

    futureElement.complete(23);
  }
}
