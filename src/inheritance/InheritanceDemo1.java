package inheritance;

class A { // parent class

	int x;

	void display() {
		System.out.println(x);

	}

}

class B extends A { // B is child class of the class A

	int y;

	void show() {

		System.out.println(y);
	}

}

public class InheritanceDemo1 {

	public static void main(String[] args) {

		B obj = new B();
		obj.x = 100;
		obj.y = 200;
		obj.display();
		obj.show();

	}

}
