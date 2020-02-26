package calc;

import java.util.Scanner;

public abstract class task5 {

	public static void main(String[] args) {

		String note = "ノートPCの値段: ";
		int price = 89800;
		char yen = '円';

		System.out.println(note + price + yen);
		//ノートPCの値段89800円　の出力

		Scanner sc1 = new Scanner(System.in);
		String str1 = sc1.nextLine();
		String str2 = sc1.nextLine();

		//文字列2つを受け取る

		System.out.println(str1 + str2);

		//文字列を出力する

		sc1.close();



	}

}
