package com.example.ecommerce.dates;

interface A {
	
}

class B implements A {
	static void doMe(){
		System.out.println("do b");
	}
}

class C extends B {
	static void doMe(){
		System.out.println("do c");
	}
}

public class D extends C {
	public static void main(String[] args) {
		C x = new C();
		// insert code here
//		C a = ;
		((B)(C)x).doMe();
		C m = null;
		System.out.println);
	}
}
