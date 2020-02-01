package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList <Integer>num = new ArrayList<>();

		num.add(0,21);
		num.add(1,3);
		num.add(2,32);
		num.add(3,6);
		num.add(4,99);
		num.add(5,72);
		num.add(6,78);
		num.add(7,51);
		num.add(8,1);
		num.add(9,26);
		num.add(10,87);
		num.add(11,11);
		num.add(12,48);
		num.add(13,60);
		num.add(14,29);
		num.add(15,5);
		num.add(16,46);
		num.add(17,74);
		num.add(18,14);
		num.add(19,193);
		num.add(20,215);
		num.add(21,83);

		ArrayList <Integer> G = new ArrayList<>();
		ArrayList <Integer> K = new ArrayList<>();
		HashMap<String,ArrayList<Integer>> number = new HashMap<>();

		for(int i = 0; i <= 21; i++) {
			int q = num.get(i);
			if(q % 2 == 0) {
				G.add(q);
				number.put("偶数", G);
			}else {
				K.add(q);
				number.put("奇数", K);
			}
		}

		System.out.print(number);


	}

}
