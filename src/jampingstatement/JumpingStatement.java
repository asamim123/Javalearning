package jampingstatement;

public class JumpingStatement {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i == 7) {
				break;
				// also we can use continue; it will just skip the than continue the loop
			}
			System.out.println(i);
		}

	}

}
