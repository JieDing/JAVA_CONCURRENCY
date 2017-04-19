package com.jieding.threadPool;
/**
 * 
 * @ClassName: SimpleThreadTest.java 
 * @author JieDing dingjwilliams@gmail.com
 *
 * @Description:
 * ��Java�У����Ҫʹ�ö��߳������ַ�����
 * һ���Ǽ̳�һ��Thread�࣬����дrun����
 * ��һ����ʵ��Runnable�ӿڣ�����дrun����
 * 
 * ��������һ���µ��߳�֮��ʹ��start()�������ø��߳̿�ʼ������ע�ⲻ��run����
 * 
 * ����ֵ��ע�����Java������֤��start���߳̾ͻ��ȱ�ִ��
 * 
 * ���������ĳ����У����Ǵ�����10���̲߳������ÿ���̵߳����֣�����start��˳���Ǵ�thread 0-9
 * ����ʵ����������߳����ֲ���һ�������˳���̱߳�ִ�е�˳��ȡ����JVM�Ͳ���ϵͳ��ͬ����
 * �����������������п���ÿһ�ζ���һ��.
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
