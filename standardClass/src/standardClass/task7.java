package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class task7 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		SimpleDateFormat today = new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("現在日時:" + today.format(now.getTime()));

		//一週間後
		now.add(Calendar.DAY_OF_MONTH, 7);
		System.out.println("1週間後:" + today.format(now.getTime()));

		//一年後と曜日
		now.set(now.get(Calendar.YEAR)+1,now.get(Calendar.MONTH),now.get(Calendar.DAY_OF_MONTH));

		String[] DOW =new String[7];
		DOW[0] = "日";
		DOW[1] = "月";
		DOW[2] = "火";
		DOW[3] = "水";
		DOW[4] = "木";
		DOW[5] = "金";
		DOW[6] = "土";

		System.out.println("1年後:" + today.format(now.getTime()) + "(" + DOW[now.get(Calendar.DAY_OF_WEEK)-1] + ")");
	}

}
