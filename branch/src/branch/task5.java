package branch;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();

		Scanner sc2 = new Scanner(System.in);
		int numB = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		int numC = sc3.nextInt();

		System.out.println("numA:" + numA);
		System.out.println("numB:" + numB);
		System.out.println("numC:" + numC);

		if(numA >= numB & numA >= numC) {
			System.out.println("最大値:" + numA);
		}else if(numB >= numA & numB >= numC) {
			System.out.println("最大値:" + numB);
		}else{
			System.out.println("最大値:" + numC);
		}
		sc.close();
		sc2.close();
		sc3.close();



			}

			}

