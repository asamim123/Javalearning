package arrays;

public class Arraysdemo {

	public static void main(String[] args) {
		// array: arrays is collection of elements the same data type
		// 2 type of arrays
		// single dimensional
		// two/multi dimensional
		// ----------------------------------
		// Single dimensional Arrays
		// 1-Declare an array
		// 2- Insert values into
		// 3-Find size of an arrays
		// 4-Read values from an arrays

		// 1-Declare an array
		int a[] = new int[5];// declared array with size 5,starting index is 0

		// 2- Insert values into
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		// 3-Find size of an arrays

		System.out.println("length of an arrays=" + a.length);// print length/size of an arrays

		// 4-Read values from an arrays
		System.out.println("2array"+a[2]);
		
		for(int i=0;i<=a.length-1;i++) {// if array size more than we should -1
			System.out.println(a[i]);
		}
	}

}
