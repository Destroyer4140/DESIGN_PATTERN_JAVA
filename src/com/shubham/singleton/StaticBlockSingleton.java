package com.shubham.singleton;

public class StaticBlockSingleton {
	
	private static StaticBlockSingleton singObj = null;
	
	static {
		System.out.println("Static Block is getting executed.");
		try {
			singObj = new StaticBlockSingleton();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private StaticBlockSingleton() {
		System.out.println("Object is getting created by static block method");
	}
	
	public static StaticBlockSingleton getSingObject() {
		return singObj;
	}

}
