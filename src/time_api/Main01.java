package time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main01 {
	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now(); //現在日時を取得
		LocalDate dateOnly = LocalDate.now(); //現在の日付情報だけを取得
		LocalTime timeOnly = LocalTime.now(); //現在の時刻情報だけを取得
		
		System.out.println("-------------補足-------------");
		//補足:Local系インスタンスのフォーマットについて
		DateTimeFormatter format01 = 
				DateTimeFormatter.ofPattern("yyyy月MM日dd日");
		System.out.println(dateOnly.format(format01));
		
		
		
		
		DateTimeFormatter format02 = 
	            DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime dateTime02 = 
	            LocalDateTime.parse("2023/12/31 12:34:56", format02);
		System.out.println(dateTime02.format(format02));
		
		System.out.println("--------------------------------");
		
		System.out.println("現在日時:" + dateTime);
		System.out.println("現在日付:" + dateOnly);
		System.out.println("現在時刻:" + timeOnly);
		
		System.out.println("---get○○系メソッドで「取得」していく！---");
		//LocalDateインスタンスから「年」「月」「日」の情報を別々に取得することができる
		int year = dateOnly.getYear();
		//Enum(イーナム)
		Month monthE = dateOnly.getMonth(); //getMonth()のみ1～12を表す列挙型の値が返ってくる
		int day = dateOnly.getDayOfMonth();
		
		System.out.println("出力テスト➀");
		System.out.println(year + "年" + monthE + "月" + day + "日");
		
		//月の情報を1～12のint型の値を返してくれるgetMonthValueメソッド
		int month = dateOnly.getMonthValue();
		System.out.println("出力テスト②");
		System.out.println(year + "年" + month + "月" + day + "日");

		System.out.println("---ofメソッドで「特定生成」していく！---");
		//整数で指定をするパターンでインスタンス化
		LocalDate date01 = LocalDate.of(2023, 12, 31); //月またぎ問題を考慮しなくていい！
		
		System.out.println("出力テスト③");
		System.out.println(date01);
		
		//月をMonth列挙型指定するパターンでインスタンス化
		LocalDate date02 = LocalDate.of(2023, Month.DECEMBER, 25);
		
		System.out.println("出力テスト④");
		System.out.println(date02);
		
		System.out.println("---加算・減算を用いる！---");
		LocalDate date03 = LocalDate.of(2023,10,24);
		System.out.println("訓練開始:" + date03);
		//6ヶ月を加算
		date03 = date03.plusMonths(6);
		System.out.println("訓練終了:" + date03);
		//3ヶ月を減算
		LocalDate date04 = date03.minusMonths(3);
		System.out.println("折り返し:" + date04);
		
		System.out.println("---前後関係の判定をする！---");
		LocalDate date05 = LocalDate.now(); //現在の日付情報だけを取得
		
		//date04(折り返し地点)よりもdate05（現在日付）が後日以降にあるならtrue
		if(date05.isAfter(date04)) {
			System.out.println("折り返し地点を通過しています。");
		} else {
			System.out.println("まだ折り返し地点ではありません。");
		}
		
		//同じ日付かどうかを調べる
		if(date05.isEqual(date04)) {
			System.out.println("ちょうど折り返し地点にいます。");
		}
	}
}
