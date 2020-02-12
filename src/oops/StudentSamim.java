package oops;

public class StudentSamim {

	int s_id;
	String s_name;
	int r_no;

	void getValue(int id, String name, int rollno) {

		s_id = id;
		s_name = name;
		r_no = rollno;

	}
	void display() {
		System.out.println(s_id +" "+s_name +" "+r_no);
	}

}
