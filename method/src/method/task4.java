package method;

public class task4 {

	public static void main(String[] args) {

		System.out.println("---①文字列のみの場合---");
		overload("文字列1","文字列2");
		System.out.println("---②整数のみの場合---");
		overload(3,5);
		System.out.println("---③小数のみの場合---");
		overload(3.5,5.5);

	}

	public static void overload(String a , String b) {
		System.out.println(a + b);
	}

	public static void overload(int c , int d) {
		System.out.println(c + d);
	}

	public static void overload(double e , double f) {
		System.out.println(e + f);
	}
}
