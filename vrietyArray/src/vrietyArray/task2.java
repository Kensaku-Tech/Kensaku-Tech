package vrietyArray;

import java.util.ArrayList;

public abstract class task2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList <Integer> G = new ArrayList<>();
		ArrayList <Integer> K = new ArrayList<>();

		K.add(0,21);
		K.add(1,3);
		K.add(2,99);
		K.add(3,51);
		K.add(4,1);
		K.add(5,87);
		K.add(6,11);

		G.add(0,32);
		G.add(1,6);
		G.add(2,72);
		G.add(3,78);
		G.add(4,26);
		G.add(5,48);
		G.add(6,60);

		System.out.println("奇数:" + K);
		System.out.println("偶数:" + G);


	}

}
