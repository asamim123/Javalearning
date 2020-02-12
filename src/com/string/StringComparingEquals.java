package com.string;

public class StringComparingEquals {

	public static void main(String[] args) {
	
		String s="welcome";
		System.out.println(s.equals("welcome"));
		System.out.println(s.equals("we  lcome"));
		System.out.println(s.equals("wel come"));
		System.out.println(s.equalsIgnoreCase("Welcome"));

	}

}
