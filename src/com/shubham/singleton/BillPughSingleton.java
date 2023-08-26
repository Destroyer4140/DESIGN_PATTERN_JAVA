package com.shubham.singleton;

public class BillPughSingleton {
	
	private BillPughSingleton() {
		System.out.println("Creating Object using Bill Pugh method.");
	}
	
	private static class SingletonHelper {
		
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getSingObject() {
		System.out.println("Inside getter method of Bill Pugh method.");
		
		return SingletonHelper.INSTANCE;
	}
}
