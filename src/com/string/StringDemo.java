package com.string;

public class StringDemo {

	public static void main(String[] args) {

		// string is collection of characters
		//

		String a = "samim";
		String b = "khan ";
		String c = "kaka ";
		System.out.println(b.concat(c));// Concat we use for joining to string
		System.out.println(a.length());
		System.out.println(a);

		String x[] = { "samm,jan,samf,ahmad" };

		for (String i : x) {
			System.out.println(i.length());
			System.out.println(i);
		}
	}

}
