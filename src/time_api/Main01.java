package time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main01 {
	public static void main(String[] args) {
		// LocalDateTimeメソッドを呼び出すことで現在日時を取得することが出来る
		LocalDateTime dateTime = LocalDateTime.now(); // 現在日時を取得
		LocalDate dateOnly = LocalDate.now(); // 現在の日付情報だけを取得
		LocalTime timeOnly = LocalTime.now(); // 現在の時刻情報を取得

		System.out.println("現在日時：" + dateTime);
		System.out.println("現在の日付情報：" + dateOnly);
		System.out.println("現在時刻：" + timeOnly);

		System.out.println("-----get○○系メソッドで「取得」していく-----");

		// LocalDateインスタンスから「年」「月」「日」の情報を別々に取得することが出来る
		int year = dateOnly.getYear();
		// getMonth()のみ１～１２を表す列挙型の値が返ってくる
		// 列挙型（enum型）の変数名には慣習として「E」がつけられる
		Month monthE = dateOnly.getMonth();
		int day = dateOnly.getDayOfMonth();
	}
}
