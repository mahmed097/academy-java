package com.bptn.course.hello;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread from MyRunnable class: " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
