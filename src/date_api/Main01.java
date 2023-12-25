package date_api;

import java.util.Date;

public class Main01 {
	public static void main(String[] args) {
		// 実行時の現在日時情報をlong型で返す
//		System.currentTimeMillis(); 
		System.out.printf("%,d エポックタイム\n", System.currentTimeMillis());
		System.out.println("上記をDateインスタンスで変換すると・・・・");
		System.out.println(new Date(1703482540423L));

		// Dateインスタンスを使ってみる！
		Date d = new Date();
		System.out.println("現在の日時情報は・・・" + d);

//		long start = System.currentTimeMillis();
		Date startDate = new Date();
		System.out.println("開始時間：" + startDate);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000000; i++) {
			sb.append("A");
		}
//		long end = System.currentTimeMillis();
		Date endDate = new Date();
		System.out.println("終了時間：" + endDate);

//		System.out.println("処理にかかった時間は" + (end - start) + "ミリ秒でした");

		// 1970年1月1日0時から現在までのミリ数秒を取得する .getTime() 戻り値：long型
		System.out.println("処理にかかった時間は" + (endDate.getTime() - startDate.getTime()) + "ミリ秒でした");
	}
}
