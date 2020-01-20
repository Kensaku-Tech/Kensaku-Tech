package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList <Integer> G = new ArrayList<>();
		G.add(0,32);
		G.add(1,6);
		G.add(2,72);
		G.add(3,78);
		G.add(4,26);
		G.add(5,48);
		G.add(6,60);
		G.add(7,46);
		G.add(8,74);
		G.add(9,14);

		ArrayList <Integer> K = new ArrayList<>();
		K.add(0,21);
		K.add(1,3);
		K.add(2,99);
		K.add(3,51);
		K.add(4,1);
		K.add(5,87);
		K.add(6,11);
		K.add(7,29);
		K.add(8,5);
		K.add(9,193);
		K.add(10,215);
		K.add(11,83);


		HashMap<String,ArrayList<Integer>> number = new HashMap<>();

		number.put("偶数", G);
		number.put("奇数", K);

		System.out.print(number);


	}

}
