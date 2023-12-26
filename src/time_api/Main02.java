package time_api;

import java.time.LocalDate;
import java.time.Period;

public class Main02 {
	public static void main(String[] args) {
		LocalDate date01 = LocalDate.of(2023, 10, 24); // 訓練開始日（日付特定生成）
		LocalDate date02 = date01.plusMonths(6); // 訓練開始６ヵ月（訓練終了日）
		LocalDate date03 = date02.minusMonths(3); // 折り返し地点
		LocalDate date04 = LocalDate.now(); // 現在日付情報のみを取得

		// Periodクラス 2つの異なる時刻や日付の期間を保持する
		// 訓練開始日～訓練終了日の期間をp1で管理する
		Period p1 = Period.between(date01, date02);
		System.out.println(p1);

		// 現在日付～折り返し地点の期間をp2で管理する
		Period p2 = Period.between(date04, date03);
		System.out.println(p2);

		// date04(現在日付）の「ｐ２」日後を計算する
		// 現在日付 + 折り返しまでの期間 = 折り返し地点
		LocalDate date05 = date04.plus(p2);
		System.out.println("折り返し地点は" + date05 + "です");

		Period p = Period.between(date04, date02);
		System.out.println(p);

	}
}
