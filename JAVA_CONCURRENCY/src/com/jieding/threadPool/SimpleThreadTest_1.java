package com.jieding.threadPool;
/**
 * 
 * @ClassName: SimpleThreadTest.java 
 * @author JieDing dingjwilliams@gmail.com
 *
 * @Description:
 * 在Java中，如果要使用多线程有两种方法：
 * 一种是继承一个Thread类，并重写run方法
 * 另一种是实现Runnable接口，并重写run方法
 * 
 * 在声明了一个新的线程之后，使用start()方法来让该线程开始工作，注意不是run方法
 * 
 * 但是值得注意的是Java并不保证先start的线程就会先被执行
 * 
 * 因此在下面的程序中，我们创建了10个线程并且输出每个线程的名字，尽管start的顺序是从thread 0-9
 * 但是实际上输出的线程名字并不一定是这个顺序，线程被执行的顺序取决于JVM和操作系统共同决定
 * 因此这个程序的输出很有可能每一次都不一样.
 */
public class SimpleThreadTest_1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++){
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName());
				}
			},"thread "+i).start();
		}
	}

}
