package com.dit.threads;

public class ThreadResult {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new Runnable(){
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			}
	
		});
		
		t.start();
	
		t.join();
		
		System.out.println("Print final amount ");

	}

}
