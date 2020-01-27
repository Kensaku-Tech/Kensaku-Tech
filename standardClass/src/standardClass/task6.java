package standardClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Date now = new Date();

		SimpleDateFormat today = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat today2 = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");

		System.out.println(today.format(now));
		System.out.println(today2.format(now));

	}

}
