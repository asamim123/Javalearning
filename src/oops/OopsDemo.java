package oops;

class Emp {
	int Em_id;
	int salary;
	String name;
	String job;

	public void display() {
		System.out.println(Em_id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(job);
	}

}

public class OopsDemo {

	public static void main(String[] args) {

		Emp em = new Emp();
		em.Em_id = 1;
		em.name = "samim";
		em.salary = 400;
		em.job = "manager";
		em.display();

	}

}
