package overridingDemo;
//Overriding
//If subclass (child class) has the same method as declared in the parent class,
//it is known as method overriding in Java.

class Bank {
	double rateofInterst() {
		return(0);
	}
}
class Citi extends Bank{
	double rateofInterst() {
		return 10.5;
	}
}
class Bofa extends Bank{
	double rateofInterst()
	{
		return 5.5;
	}
	
}
class Cp1 extends Bank{
	
	double rateofInterst() {
		return 22.5;
	}
}



public class OverridingDemo1 {

	public static void main(String[] args) {
		
		Citi ci = new Citi();
		System.out.println(ci.rateofInterst());
		Bofa b  = new Bofa();
		System.out.println(b.rateofInterst());
		Cp1 cp = new Cp1();
		System.out.println(cp.rateofInterst());
		Bank bk = new Bank();
		System.out.println(bk.rateofInterst());
		
		

	}

}
