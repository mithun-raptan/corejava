package com.thread;

class Instagram extends Thread{
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println("instagram"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

class WhatsApp extends Thread{
	public void run() {
		for(int i = 0; i <10; i++) {
			System.out.println("whatsapp"+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class LearnThread {
	
	
	public static void main(String[] args) {
//			Thread t = Thread.currentThread();
//			System.out.println(t.getClass());
//		Thread t = new Thread();
//		System.out.println(t.getClass());
		WhatsApp w =  new WhatsApp();
		Thread t1 =  new Thread(w);
		Instagram i =  new Instagram();
		Thread t2 =  new Thread(i);
		t1.start();
		t2.start();
		
		
			
	}

}
