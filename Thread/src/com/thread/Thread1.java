package com.thread;

public class Thread1 extends Thread{
			public void run() {
					for(int i=0;i<5;i++) {
						System.out.println(i+"+"+ Thread.currentThread().getName());
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
			}
			

				public static void main(String[] args) {
						Thread1 thrd1 = new Thread1();
						thrd1.start();
						Thread1 thrd2 = new Thread1();
						thrd2.start();
						
					}
			
}


	


