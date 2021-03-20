package com.test.com;

public class Employee {

		public static void main(String[] args) {
			String a1 = "Shivagopal";
			String a2 = null;
			String a3 = "";
			String a4 = "Chandrashekar";
			String a5 = "Rajkala";
			if(a1.contains("Shiva")) {
				System.out.print("Found Shiva in "+ a1 );
			}
			else {
				System.out.print("Shiva doesn't contain in " + a1 );
			}
			if(a3.isEmpty()) {
				System.out.print("String is Empty ");
			}
			else {
				System.out.print('\n'+"String is not empty and it contains: " + a3 );
			}
		}
	}

