package calc;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);

		int sum = num + num2 + num3;
		System.out.println("合計:" + sum );

		double TaskOne = 3.0;
		int TaskTwo = (int) TaskOne;

		System.out.println("平均(3で割った時:)" + sum / TaskTwo);
		System.out.println("平均(3.0で割った時:)" + sum / TaskOne);

		sc.close();



	}

}
