package oops;

public class ConstructorDemo1 {
	int x;
	int y;
	 ConstructorDemo1() 
	{
		x=10;
		y=20;
		
	}
	
	void display() {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		ConstructorDemo1 cd = new ConstructorDemo1();
		cd.display();
		

	}

}
