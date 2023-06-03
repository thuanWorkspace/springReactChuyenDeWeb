package com.example.ecommerce.dates;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class Date2 {
	public static void main(String[] args) {
		Date d1 = new Date(1000000000000L);
		System.out.println("1st date " + d1.toString());
		Calendar c = Calendar.getInstance();
		c.setTime(d1); // #1
		System.out.println("What is the first day of the week: " + c.getFirstDayOfWeek());
		if (Calendar.SUNDAY == c.getFirstDayOfWeek()) // #2
			System.out.println("Sunday is the first day of the week");
		if (Calendar.MONDAY == c.getFirstDayOfWeek()) // #2
			System.out.println("Monday is the first day of the week");
		System.out.println("trillionth milli day of week is " + c.get(Calendar.DAY_OF_WEEK)); // #3
		c.add(Calendar.MONTH, 1); // #4
		Date d2 = c.getTime(); // #5
		System.out.println("new date " + d2.toString());
//		//more example of add in Calendar.
//		c.add(Calendar.HOUR, -4); // subtract 4 hours from c's value
//		c.add(Calendar.YEAR, 2); // add 2 years to c's value
//		c.add(Calendar.DAY_OF_WEEK, -2); // subtract two days from
		// c's value
//		System.out.println("new date " + d2.toString());
		// assume c is October 8, 2001
		c.roll(Calendar.MONTH, 9); // notice the year in the output
		Date d4 = c.getTime();
		System.out.println("new date " + d4.toString());
//		DateFormat df = DateFormat.getDateInstance(new Object());
//		int[] i = { 7, 3, 6 };
		Integer[] i2 = { 8, 6 };
//		List l = Arrays.asList(i);
//		i(i);
		if (!false)
			System.out.print("c ");
		Scanner s2 = new Scanner(System.in);
//		s2.
		boolean b2, b;
		String s, hits = " ";
		while (b = s2.hasNext()) {
			if (s2.hasNextInt()) {
				int i = s2.nextInt();
				System.out.println("i: "+i);
				hits += "i";
			} else if (s2.hasNextBoolean()) {
				b2 = s2.nextBoolean();
				System.out.println("boolean: "+b2);
				hits += "b";
			} else {
				System.out.println("s2: "+		s2.next());
				hits += "s2";
			}
		}
//		System.out.println(l.size());
	}

	public static void i(int... is) {
		System.out.println(is.length);
	}
	interface a{
		void method1();
	}
	abstract class b implements a{
		abstract void method2();
	}
	
}
