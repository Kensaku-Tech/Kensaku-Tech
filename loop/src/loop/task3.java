package loop;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		System.out.print("数字を入力してください:");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		int i = 0;

		while(num >= 1) {
			num /= 10;
			i++;

		}

		System.out.println("桁数:" + i);
		sc.close();
	}

}
