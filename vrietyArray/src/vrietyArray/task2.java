package vrietyArray;

import java.util.ArrayList;

public abstract class task2 {

	public static void main(String[] args) {

		ArrayList <Integer> num = new ArrayList<>();

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

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for(int i = 0; i <= 13; i++) {
			int q = num.get(i);
			if(q % 2 == 0) {
				even.add(q);
			}else {
				odd.add(q);
			}
		}
		System.out.println("偶数:" + even);
		System.out.println("奇数:" + odd);


	}

}
