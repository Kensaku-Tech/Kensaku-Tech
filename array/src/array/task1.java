package array;

public class task1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int[]array = new int[11];
		array[0] = 4;
		array[1] = 9;
		array[2] = 19;
		array[3] = 5;
		array[4] = 8;
		array[5] = 21;
		array[6] = 42;
		array[7] = 64;
		array[8] = 73;
		array[9] = 18;
		array[10] = 2;

		System.out.print("配列:[");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if(i < array.length-1) {
				System.out.print(",");
			}
		}
		System.out.print("]");

		System.out.println("");

		System.out.print("合計:");

		int a = 0;
		for(int num : array) {
			a += num;
		}
		System.out.print(a);
	}

}
