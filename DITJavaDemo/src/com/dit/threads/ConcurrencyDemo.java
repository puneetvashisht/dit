package com.dit.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class MyNewTask implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		
	}
	
}


class MyNewCallable implements Callable<Integer>{

	

	@Override
	public Integer call() throws Exception {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		return 12;
	}
	
}

public class ConcurrencyDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		ExecutorService service = Executors.newFixedThreadPool(2);
//		new ThreadPoo
		ExecutorService service =  new ThreadPoolExecutor(2, 4,
                0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(10));
		
		List<Future> futures = new ArrayList<>();
		
		for(int i=0;i<10;i++){
//			service.submit(new MyNewTask());
			Future<Integer> f = service.submit(new MyNewCallable());
//			System.out.println(f.get());
			futures.add(f);
		}
		
		for(Future f : futures){
			System.out.println(f.get());
		}
		
		
		
		service.shutdown();
	}
	


}
