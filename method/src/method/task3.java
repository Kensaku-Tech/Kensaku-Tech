package method;


public class task3 {

	public static void main(String[] args) {


		System.out.println("三角形の面積");
		double ans = areas(10,27);
		System.out.println(ans);

	}

	public static double areas(double bottom, double height) {
		double area = (Math.round(bottom) * Math.round(height)) / 2;
		return area;
	}

}
