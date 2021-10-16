package org.example.margo_example.margo_thread;

import java.util.Random;
import java.util.concurrent.Callable;

public class CallSomeApi implements Callable<Integer> {

  @Override
  public Integer call() throws Exception {
    // does some task for 3 sec
    Thread.sleep(3000);
    return new Random().nextInt();
  }
}
