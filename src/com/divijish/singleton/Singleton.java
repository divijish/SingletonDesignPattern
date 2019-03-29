package com.divijish.singleton;

public class Singleton {


	private static Singleton singletonBean;
	private static int count = 0;
	
	private Singleton() {
		count++;
	}

	static {
		singletonBean = new Singleton();
	}

	public static Singleton factory() {
		return singletonBean;
	}
	
	public int getTotalInstances() {
		return count;
	}
	
	public static int getCount() {
		return count;
	}

}
