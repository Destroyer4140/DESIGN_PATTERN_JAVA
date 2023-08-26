package com.shubham.singleton;

public class EagerInitialization {
	
	private static final EagerInitialization singObj 
						= new EagerInitialization();
	
	private EagerInitialization(){
		System.out.println("Object getting created egarely.");
	}
	
	public static EagerInitialization getSingObj() {
		return singObj;
	}

}
