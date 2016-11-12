package com.practice;

class Thread1 extends CustomThread {

	public Thread1() throws Exception {
		// throw new Exception("Exception");
	}

	@Override
	public void run() {
		super.run();
		System.out.println("Thread1 run");
	}
}

//class Thread3 extends Thread1 {
//
//	public Thread3() throws Exception {
//		// throw new Exception("Exception");
//	}
//
//	@Override
//	public void run() {
//		super.run();
//		System.out.println("Thread1 run");
//	}
//}

class Thread2 implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread2 run");
	}
}

public class ThreadTest {
	public static void main(String[] args) throws Exception {
		CustomThread thread1 = new Thread1();
		thread1.start();
		Thread2 runnableThread = new Thread2();
		Thread thread2 = new Thread(runnableThread);
		thread2.start();
	}
}
