package oops;

public class ConstructorParameter {

	int x;
	int y;

	ConstructorParameter(int i, int j) {

		x = i;
		y = j;

	}

	void show() {
		System.out.println("x*y="+x * y);
	}

	public static void main(String[] args) {

		ConstructorParameter cp = new ConstructorParameter(33, 2);
		cp.show();

	}

}
