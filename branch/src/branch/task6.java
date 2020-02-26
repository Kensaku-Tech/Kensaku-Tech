package branch;

import java.util.Scanner;

public abstract class task6 {

	public static void main(String[] args) {

		System.out.println("1から5までの数字を入力してください");
		String b = "0";
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		switch(num) {
		case 1 :
			b = "Ⅰ";
			break;
		case 2 :
			b = "Ⅱ";
			break;
		case 3 :
			b = "Ⅲ";
			break;
		case 4 :
			b = "Ⅳ";
			break;
		case 5 :
			b = "Ⅴ";
			break;
		default :
			b = "unknown";
		}

		System.out.print(num + " -> " + b);
		sc.close();

	}
}

