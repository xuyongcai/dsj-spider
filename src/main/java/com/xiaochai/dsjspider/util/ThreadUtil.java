package com.xiaochai.dsjspider.util;

/**
 * 线程工具类
 *
 */
public class ThreadUtil {

	@SuppressWarnings("static-access")
	public static void sleep(long millions){
		try {
			Thread.currentThread().sleep(millions);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		while(true){
			System.out.println((long)(Math.random() *5000));
		}
		
	}
}
