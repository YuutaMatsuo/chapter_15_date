package date_api;

import java.util.Calendar;
import java.util.Date;

public class Main02 {
	public static void main(String[] args) {
		// Calendarクラスは「抽象クラス」なのでnew演算子ではなく
		// getInstanceメソッドを呼ぶことにより、Calendarインスタンスを生成する
		Calendar c = Calendar.getInstance();

		// Calendarクラスのsetメソッドを経由したほうが
		// 人間は「この日時でセットする」と指定しやすい
		c.set(2023, 11, 25, 10, 10, 00); // まとめてセットする方法①
		System.out.println("setメソッド使用法①" + c.getTime());

		c.set(Calendar.MONTH, 5); // 指定位置をセットする方法②
		System.out.println("setメソッド使用法②" + c.getTime());

		// getメソッドでCalendarインスタンスが持つ日時情報から、年月日時分秒をそれぞれ取得できる
		int year = c.get(Calendar.YEAR); // 年情報を取得
		int month = c.get(Calendar.MONTH) + 1;	// 月情報を取得(月またぎの問題上、0が1月で認識されている
		int day = c.get(Calendar.DAY_OF_MONTH);	// 月単位でみた日数を取得
		int hour = c.get(Calendar.HOUR);		// 時取得
		int minute = c.get(Calendar.MINUTE);	// 分取得
		int second = c.get(Calendar.SECOND);	// 秒取得
		
		System.out.println(year + "年" + month + "月" + day + "日");
		System.out.println(hour + ":" + minute + ":" + second);
		
		// CalendarからDateへの変換
		Date d = c.getTime();
		System.out.println("CalendarからDateへの変換：" + d);
		
		// Dateインスタンスを生成して格納
		d = new Date();
		
		// DateからCalendarへの変換
		// setTimeメソッドの引数にDate型の変数を指定すれば、Calendarに変換することが出来る
		c.setTime(d);
		System.out.println("DateからCalendarへの変換:" + c.getTime());
		
	}
}
