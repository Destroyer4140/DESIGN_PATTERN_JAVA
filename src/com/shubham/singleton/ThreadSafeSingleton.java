package com.shubham.singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton singObj = null;
	
	private ThreadSafeSingleton() {
		System.out.println("Object is getting created using Thread Safe method");
	}
	
//	public synchronized static ThreadSafeSingleton getSingObject() {
//		if(singObj == null) {
//			singObj = new ThreadSafeSingleton();
//		}
//		return singObj;
//	}
	
	
	public static ThreadSafeSingleton getSingObject() {
		if(singObj == null) {
			synchronized (ThreadSafeSingleton.class) {
				singObj = new ThreadSafeSingleton();
			}
		}
		return singObj;
	}

}
