package standardClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task6 {

	public static void main(String[] args) {

		Date now = new Date();

		SimpleDateFormat today = new SimpleDateFormat("yyyy年MM月dd日");
		SimpleDateFormat today_with_time = new SimpleDateFormat("yyyy年MM月dd日HH時mm分");

		System.out.println(today.format(now));
		System.out.println(today_with_time.format(now));

	}

}
