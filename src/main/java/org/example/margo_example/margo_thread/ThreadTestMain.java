package org.example.margo_example.margo_thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadTestMain {

  public static void main(String arg[]) throws ExecutionException, InterruptedException {
    ExecutorService threadService = Executors.newFixedThreadPool(10); // run task async
    // to execute a thread
    Future<Integer> data = threadService.submit(new CallSomeApi());
    // get is a blocking function
    System.out.println(data.get());
  }
}
