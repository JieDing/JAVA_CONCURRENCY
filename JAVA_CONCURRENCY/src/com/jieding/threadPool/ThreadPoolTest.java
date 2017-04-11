package com.jieding.threadPool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolTest {
    public static void main(String[] args) {
    	ExecutorService singleExecutor = null;
    	//singleExecutor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));
    	singleExecutor = Executors.newCachedThreadPool();
    	
    	for(int i=0; i<16; i++){
    		MyTask task = new MyTask(i);
    		singleExecutor.execute(task);
    		// System.out.println("线程池中线程数目："+singleExecutor.getPoolSize()+"，队列中等待执行的任务数目："+
    		//		 singleExecutor.getQueue().size()+"，已执行完的任务数目："+singleExecutor.getCompletedTaskCount());
    	}
    	singleExecutor.shutdown();
    }
}


class MyTask implements Runnable {
	private int num;
	 
	public MyTask(int num) {

		this.num = num;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("正在执行 task： "+ num);
		 try {
	            Thread.sleep(8000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        System.out.println("task "+num+"执行完毕");
	}
	
}