package loop;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {

		System.out.print("正の整数を入力してください:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print(num + "の約数:");

		int i = num;
		while(i >= 1) {
			int a = num / i;
			if(num % i == 0) {
				System.out.print(a);
				if(i > 1) {
					System.out.print(",");
				}
			}
			i--;
		}

		sc.close();

	}

}
