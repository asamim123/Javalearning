package thisDemo;

public class ThisKeyword {// this is reference variable in java that refers
	// current object
   //If local variables(formal arguments) and instance variables are different, 
  //there is no need to use this keyword like in the following program:
	
	int x;// instance variable
	int y;

	void getvalue(int x, int y) {

		this.x = x;
		this.y = y;

	}

	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {

		ThisKeyword th = new ThisKeyword();
		th.getvalue(20, 30);
		th.display();
	}

}
