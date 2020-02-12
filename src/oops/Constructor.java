package oops;

public class Constructor {
	
	int sid;
	String sname;
	char grad;
	
	public Constructor(int id,String name,char g) {
		
		sid=id;
		sname=name;
		grad=g;
		
	}
	void show() {
		System.out.println(sid+" "+sname+" "+grad);
	}

}
