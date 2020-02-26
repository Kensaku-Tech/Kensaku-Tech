package vrietyArray;

import java.util.HashMap;

public class task3 {

	public static void main(String[] args) {

		HashMap<String,Integer> fruit = new HashMap<>(4);

		fruit.put("りんご" , 130);
		fruit.put("みかん" , 120);
		fruit.put("バナナ" , 98);
		fruit.put("メロン" , 6000);

		System.out.println("りんご:" + fruit.get("りんご") + "円");
		System.out.println("メロン:" + fruit.get("メロン") + "円");
		System.out.println("みかん:" + fruit.get("みかん") + "円");
		System.out.println("バナナ:" + fruit.get("バナナ") + "円");

	}

}
