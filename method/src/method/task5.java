package method;

import java.util.ArrayList;

public class task5 {

	public static void main(String[] args) {

		ArrayList<String> N = new ArrayList<>();

		System.out.println("---配列にnullがない場合---");
		trueorfalse(N);

		N.add(0,null);
		System.out.println("---配列にnullがある場合---");
		trueorfalse(N);

	}

	public static boolean trueorfalse(ArrayList a) {

		boolean true_false;
		if(a.contains(null)) {
			true_false = true;
		}else{
			true_false = false;
		}

		System.out.println(true_false);

		return true_false;

	}

}
