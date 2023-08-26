package com.shubham.singleton;

public class Test {

	public static void main(String[] args) {
		
//		EagerInitialization singObj1 = EagerInitialization.getSingObj();
//		System.out.println(singObj1.hashCode());
//		
//		EagerInitialization singObj2 = EagerInitialization.getSingObj();
//		System.out.println(singObj2.hashCode());
		
//		LazyInitialization singObj1 = LazyInitialization.getSingObject();
//		System.out.println(singObj1.hashCode());
//		
//		LazyInitialization singObj2 = LazyInitialization.getSingObject();
//		System.out.println(singObj2.hashCode());
		
//		StaticBlockSingleton singObj1 = StaticBlockSingleton.getSingObject();
//		System.out.println(singObj1.hashCode());
//		
//		StaticBlockSingleton singObj2 = StaticBlockSingleton.getSingObject();
//		System.out.println(singObj2.hashCode());
		
//		ThreadSafeSingleton singObj1 = ThreadSafeSingleton.getSingObject();
//		System.out.println(singObj1.hashCode());
//		
//		ThreadSafeSingleton singObj2 = ThreadSafeSingleton.getSingObject();
//		System.out.println(singObj2.hashCode());
		
		BillPughSingleton singObj1 = BillPughSingleton.getSingObject();
		System.out.println(singObj1.hashCode());
		
		BillPughSingleton singObj2 = BillPughSingleton.getSingObject();
		System.out.println(singObj2.hashCode());
		
	}

}
