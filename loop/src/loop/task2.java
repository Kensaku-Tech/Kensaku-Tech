package loop;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("数字を入力してください:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 0;
		int i = 1;
		while(i <= num) {
			sum += i;
			System.out.print(i);
			i++;

			if(i <= num) {
				System.out.print(" + ");
			}

		}
		System.out.print(" = " + sum);
		sc.close();
	}

}
