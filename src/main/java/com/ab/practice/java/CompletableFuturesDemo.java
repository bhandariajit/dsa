package com.ab.practice.java;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//thenComposeDemo();

		//thenRunDemo();

		System.out.println("-------------------");
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
		System.out.println("not blocked1");

		CompletableFuture<String> future = completableFuture.thenApplyAsync(s -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return s + " World";
		});

		System.out.println("not blocked2");
		 System.out.println(future.get());
	}

	static void thenRunDemo() throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");

		CompletableFuture<Void> future = completableFuture.thenRun(() -> {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Computation finished.");
		});
		System.out.println("not blocked3");
		future.get();
	}

	static void thenComposeDemo() throws InterruptedException, ExecutionException {
		System.out.println("then compose demo");

		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
				.thenCompose(s -> CompletableFuture.supplyAsync(() -> {
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return s + " World";
				}));

		System.out.println("not blocked4");

		System.out.println(completableFuture.get());
	}
}
