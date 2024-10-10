package com.bptn.course._25_MultiThreading_;

public class MultiThreadingDemo {

	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();

		Thread runnableThread = new Thread(new MyRunnable());

		myThread.join();
		runnableThread.start();
	}

}
