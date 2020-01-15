package loop;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.print("数字を入力してください:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int sum = 1;
		for(int i = 1; i < num; i++) {
			sum += i+1;

		}
		System.out.println("1～" + num + "までの合計:" + sum);
		sc.close();

	}

}
