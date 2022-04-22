package D_220225;

public class class82 {
	public static void main(String[] args) {
		int[][] list1 = new int[][] { { 1, 2, 3, 4 }, { 2, 3, 4, 5 }, { 3, 3, 3, 3 } };
		int[][] list2 = new int[][] { { 3, 4, 5, 6 }, { 5, 6, 7, 8 }, { 4, 4, 4, 4 } };
		int[][] result = new int[list1.length][list1[0].length];

		for (int i = 0; i < list1.length; i++) {
			for (int j = 0; j < list1[0].length; j++) {
				result[i][j] = (list1[i][j] + list2[i][j]);
			}
		}
		System.out.print("result = {");
		for (int i = 0; i < list1.length; i++) {
			System.out.print("{");
			for (int j = 0; j < list1[0].length; j++) {
				System.out.print(result[i][j]);
				if (j < list1[0].length - 1) {
					System.out.print(",");
				}
			}
			System.out.print("}");
			if (i < list1.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("}");
	}
}