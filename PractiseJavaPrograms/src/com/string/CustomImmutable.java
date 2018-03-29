package com.string;

public final class CustomImmutable {

	private final String name;
	private final int age;
	
	public CustomImmutable(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
