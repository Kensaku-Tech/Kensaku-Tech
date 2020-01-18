package array;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[]array = new int[7];

		int i = 7;
		int ar = 0;
		while(i > 0) {
			array[ar] = i;
			System.out.print(i);
			ar++;
			i--;
			if(i >= 1) {
				System.out.print(",");
						}
					}

			System.out.println("");

		ar = 1;
		while(ar <= 7) {
			array[i] = ar;
			System.out.print(ar);
			ar++;
			i++;
			if(i < 7) {
				System.out.print(",");
						}
					}


		}
	}
