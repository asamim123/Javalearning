package methodoverloading;

public class OverLoadMainMethod {
	
	public void main(int x) {
		
		System.out.println(x);
	}
public void main(int x,int y) {
		
		System.out.println(x+y);
	}


	

	public static void main(String[] args) {
		
		OverLoadMainMethod om = new OverLoadMainMethod();
		om.main(3);
		om.main(3, 2);
		
		
		
		

	}

}
