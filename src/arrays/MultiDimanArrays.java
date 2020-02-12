package arrays;

public class MultiDimanArrays {

	public static void main(String[] args) {
// ehhanced for loop
		int a[][] = { { 100, 200 }, { 300, 400 }, { 500, 600 } };
		for (int k[] : a) {
			for (int i : k) {
				System.out.println("" + i);
			}
			System.out.println();
		}

	}

}
