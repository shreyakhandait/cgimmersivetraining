package com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
public class ExecutorExample {

    public static void main(String args[]){
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Runnable task1=new ImplementRunnableChild("task1");
        Runnable task2=new ImplementRunnableChild("task2");
        Runnable task3=new ImplementRunnableChild("task3");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        System.out.println("*******shutting down called");
        executorService.shutdown();

    }
}

**/

/**
public class ExecutorExample {

    public static void main(String args[]){
      //  ExecutorService executorService= Executors.newFixedThreadPool(2);
        ExecutorService executorService= Executors.newCachedThreadPool();
        Runnable task1=new ImplementRunnableChild("task1");
        Runnable task2=new ImplementRunnableChild("task2");
        Runnable task3=new ImplementRunnableChild("task3");
        Runnable task4=new ImplementRunnableChild("task4");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        
        System.out.println("*******shutting down called");
        executorService.shutdown();

    }
}

**/


public class ExecutorExample {

    public static void main(String args[]){
       //ExecutorService executorService= Executors.newFixedThreadPool(1);
       // ExecutorService executorService= Executors.newCachedThreadPool();
       // ExecutorService executorService=Executors.newSingleThreadExecutor();
        ScheduledExecutorService executorService= Executors.newScheduledThreadPool(2);
        Runnable task1=new ImplementRunnableChild("task1");
        Runnable task2=new ImplementRunnableChild("task2");
        Runnable task3=new ImplementRunnableChild("task3");
        Runnable task4=new ImplementRunnableChild("task4");
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.schedule(task1,20, TimeUnit.SECONDS);//scheduled task to execute after 20 seconds
        System.out.println("*******shutting down called");
        executorService.shutdown();

    }
}
