package inheritance;

class Parent {
	int y;
	int x;
	int z;

	void display() {
		System.out.println(x);
	}

}

class Child1 extends Parent {
	void print() {
		System.out.println(y);
	}
}

class Child2 extends Parent {

	void show() {
		System.out.println(z);
	}

}

public class InheritanceDemo3 {

	public static void main(String[] args) {

		Child2 c2 = new Child2();

		Child1 c1 = new Child1();
		c2.x = 100;

		c2.z = 200;

		c1.y = 300;

		c1.print();
		c2.show();
		c2.display();

	}

}
