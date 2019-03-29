package com.divijish.singleton;

public class SingletonTest {

	public static void main(String... args) {

		Singleton singleton = Singleton.factory();

		System.out.println("Singleton instance created");

		System.out.println("Total singleton Instances: " + Singleton.getCount());

		Singleton newSingleton = Singleton.factory();

		System.out.println("Total singleton Instances: " + Singleton.getCount());

	}

}
