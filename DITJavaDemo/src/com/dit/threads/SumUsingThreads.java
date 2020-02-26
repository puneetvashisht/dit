package com.dit.threads;

class SumTask implements Runnable{
	
	static int total=0;
	int value;
	public SumTask(int value){
		this.value = value;
	}
	@Override
	public void run() {
		synchronized(this){
			this.total += this.value;
		}	
		System.out.println(total);
	}	
}

public class SumUsingThreads {
	public static void main(String[] args) {
		for(int i=0;i<10;i++){
			Thread t = new Thread(new SumTask(i));
			t.start();
		}		
	}

}
