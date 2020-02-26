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

		double threeP = 3.0;
		int three = (int) threeP;

		System.out.println("平均(3で割った時:)" + sum / three);
		System.out.println("平均(3.0で割った時:)" + sum / threeP);

		sc.close();



	}

}
