package method;

import java.util.ArrayList;

public class task5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		ArrayList<String> N = new ArrayList<>();

		System.out.println("---配列にnullがない場合---");
		trueorfalse(N);

		N.add(0,null);
		System.out.println("---配列にnullがある場合---");
		trueorfalse(N);

	}

	public static boolean trueorfalse(ArrayList a) {

		boolean TorF;
		if(a.contains(null)) {
			TorF = true;
		}else{
			TorF = false;
				}

		System.out.println(TorF);

		return TorF;

	}

}
