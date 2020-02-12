package multidimantionarray;

public class MultiDimanArrays {

	public static void main(String[] args) {

		int a[][] = new int[3][2];
		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		System.out.println("Number of rows=" + a.length);
		System.out.println("Number of colums=" + a[0].length);

		// for (int x = 0; x < 3; x++) {
		// for (int j = 0; j < a[x].length; j++) {

		// System.out.println(a[x][j]);
		// }
		// System.out.println();
		// }

		for (int k[] : a) {
			for (int i : k) {
				System.out.println("" + i);
			}
			System.out.println();
		}

	}

}
