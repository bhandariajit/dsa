package com.ab.practice.java;

import java.io.UncheckedIOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(5);
		Callable<String> c1 = () -> {
			Thread.sleep(1000);
			throw new Exception("my exception");
		};
		Callable<String> c2 = () -> "2";
		Callable<String> c3 = () -> "3";
		List<Callable<String>> asList = Arrays.asList(c1, c2, c3);
		List<Future<String>> futures = newFixedThreadPool.invokeAll(asList);
		
		for (Future<String> f : futures) {
			System.err.println(f.get());
		}
		newFixedThreadPool.shutdown();
	}
}

class Process implements Callable<String> {

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "hello";
	}

}

class Process1 implements Runnable {

	@Override
	public void run() throws UncheckedIOException {
		// TODO Auto-generated method stub

	}

}
