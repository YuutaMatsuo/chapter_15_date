package date_api;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main03 {
	public static void main(String[] args) throws Exception {
		// 日時情報の文字列操作を行う
		// simpleDateFormatクラスは、日時情報のフォーマット（書式）を扱うためのクラス
		SimpleDateFormat f1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		// SimpleDateFormatクラスのparseメソッドは、
		// 文字列から解析してDateインスタンスを生成する
		Date d = f1.parse("2023/12/25 16:50:00");
		System.out.println(d);

		// 好きなフォーマットで試してみる
		SimpleDateFormat f2 = new SimpleDateFormat("yyyy年MM月dd日(E) HH時mm分ss秒");
		SimpleDateFormat f3 = new SimpleDateFormat("MM月dd日");

		// SimpleDateFormatクラスのformatメソッドは、
		// 指定されたDateを日付文字列にフォーマットする
		Date now = new Date(); // 現在日時を取得
		System.out.println(now);

		String todaysFormat = f2.format(now);
		System.out.println(todaysFormat);
		System.out.println("指定時間：" + f2.format(d));
		System.out.println(f3.format(now));

		System.out.println(f2.format(f3.parse("12月26日")));
	}
}
