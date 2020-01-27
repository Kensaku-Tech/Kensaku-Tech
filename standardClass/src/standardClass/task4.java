package standardClass;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String ALP = "ABCDGOPQRSYZ";

		System.out.print("探したい文字:");

		Scanner sc = new Scanner(System.in);
		String code = sc.nextLine();

		if(ALP.indexOf(code) >= 0) {
			System.out.print(ALP + "は" + code + "を含む");
		}else{
			System.out.print(ALP + "は" + code + "を含まない");
		}
		sc.close();
	}

}
