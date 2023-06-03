package com.example.ecommerce.dates;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class runme {
	public static void a(int a) {
	}

	public static void a(Integer a) {
	}

	public static void a(Long a) {
	}

	public static void b(long a) {
	}

	public static void b(Double a) {
	}

	public static void main(String[] args) {
		ArrayList<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		System.out.println("unsorted " + stuff);
		Collections.sort(stuff,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		}); // #2
		Collection c = new ArrayList<String>();
		System.out.println("sorted " + stuff);
	}
}
