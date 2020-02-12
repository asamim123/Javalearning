package methodoverloading;
// method overloading is futures  that allows a class
//to have more than one method  have the same  name 
public class MethodOverLoading {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, double b) {
		System.out.println(a + b);
	}

	void add(double a, double b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		MethodOverLoading ov = new MethodOverLoading();
		ov.add(3, 4);
		ov.add(3, 5.6);
		ov.add(5.9, 4.1);
		ov.add(2, 3, 4);

	}

}
