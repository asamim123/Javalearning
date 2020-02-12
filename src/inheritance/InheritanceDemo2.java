package inheritance;

class A1{
	int x;
	void display() {
		System.out.println(x);
	}
}
class B1 extends A1{
	
	int b;
	void show() {
		
		System.out.println(b);
	}
	
}
class C extends B1{
	int a;
	
	void print() {
		System.out.println(a);
	}
	
}

public class InheritanceDemo2 {

	public static void main(String[] args) {

		C obj = new C();
		
		obj.x=200;
        obj.b=100;
        obj.a=300;
		obj.show();
		obj.display();
		obj.print();
	

	}

}
