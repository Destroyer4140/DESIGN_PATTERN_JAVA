package com.shubham.singleton;

public class LazyInitialization {
	
	private static LazyInitialization singObj = null;
	
	private LazyInitialization() {
		System.out.println("Lazy Object creation.");
	}
	
	public static LazyInitialization getSingObject() {
		System.out.println("Method getting called first.");
		if(null == singObj) {
			singObj = new LazyInitialization();
		}
		return singObj;
	}

}
