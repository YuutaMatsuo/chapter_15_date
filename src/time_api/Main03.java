package time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Main03 {
	public static void main(String[] args) {
		// フォーマットを指定
		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
		DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 hh時mm分ss秒");
		// 日付を取得
		LocalDate date1 = LocalDate.now();
		LocalDateTime dateTime1 = LocalDateTime.now();
		LocalDate date2 = LocalDate.of(2023, 10, 24);
		LocalDate date3 = LocalDate.of(2024, 4, 22);
		// 出力
		System.out.printf("%-7s：%12s\n", "入校日", date2.format(f1));
		System.out.printf("%-5s：%12s\n", "卒業予定日", date3.format(f1));
		System.out.println();

		System.out.println("-----入校からの期間を表示-----\n");
		Period p1 = Period.between(date2, date1);
//		System.out.println(p1);
		int months = p1.getMonths();
		int days = p1.getDays();
		System.out.println("入校から" + months + "ヵ月と" + days + "日経過しました\n");

		System.out.println("-----卒業までの期間を表示-----\n");
		Period p2 = Period.between(date1, date3);
		System.out.println(p2);
		int months2 = p2.getMonths();
		int days2 = p2.getDays();
		System.out.println("卒業まで残り" + months2 + "ヵ月と" + days2 + "日です");

		int totaldays = (months2 * 30) + days2;
		System.out.println("卒業までおよそ" + totaldays + "日です\n");
	}
}
