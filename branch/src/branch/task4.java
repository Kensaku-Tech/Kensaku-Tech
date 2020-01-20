package branch;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		int numB = sc2.nextInt();

		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);

		if(numA == 0){
			System.out.println("正の整数を入力してください。");
		}else if(numB == 0) {
			System.out.println("正の整数を入力してください。");
		}else if(numA % numB == 0) {
			System.out.println("numBはnumAの約数です。");
		}else {
			System.out.println("numBはnumAの約数ではありません。");
		}
			sc.close();
			sc2.close();

			}



			}
