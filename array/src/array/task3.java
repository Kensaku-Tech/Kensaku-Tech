package array;

import java.util.Random;

public class task3 {

	public static void main(String[] args) {

		int[]array = new int[6];

		System.out.print("[");

		for(int i = 0; i <= 5; i++) {
			Random random = new Random();
			int num = random.nextInt(10);
			array[i] = num;
			System.out.print(num);
			if(i < 5) {
				System.out.print(",");
			}
		}
		System.out.print("]");
		System.out.println("");

		System.out.print("最大値:");

		int max = 0;

		for(int big = 0; big < array.length; big++) {
			if(max < array[big]) {
				max = array[big];
			}
		}

		System.out.print(max);

		System.out.println("");
		System.out.print("最小値:");

		int min = 9;

		for(int small = 0; small < array.length; small++) {
			if(min > array[small]) {
				min = array[small];
			}
		}
		System.out.print(min);

	}
}

