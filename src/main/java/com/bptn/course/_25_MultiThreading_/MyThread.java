package com.bptn.course._25_MultiThreading_;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thead: " + Thread.currentThread().getName());

		}
	}

}
