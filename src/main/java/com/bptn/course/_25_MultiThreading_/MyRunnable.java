package com.bptn.course._25_MultiThreading_;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("Thead: " + Thread.currentThread().getName());

		}

	}
}
