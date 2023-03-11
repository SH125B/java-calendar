package java_calendar;

import java.util.Scanner;

public class Calendar {
	
	public static int[] lastdayOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int getLastdayOfMonths(int a) {
		return lastdayOfMonths[a-1];
	}

	
	
	public static String[] calendarMonths = {"일   월   화   수  목   금   토", "------------------------------"
,"1   2    3   4   5   6   7", "8   9   10  11  12  13  14", "15 16   17  18  19  20  21"
, "22 23   24  25  26  27  28", "29 30", "29 30   31", "------------------------------"
	};

	public static void main(String[] args) {

		String prom = "Month> ";
		System.out.println("1월부터 12월까지 최대일수를 출력합니다.");
		System.out.println("출력횟수를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		
		
		for(int i=0; i<times;i++) {
			System.out.println("출력을 원하는 달을 숫자로 입력하시오. 중간에 종료하려면 -1를 입력하십시오.");
			System.out.print(prom);
			int inputValue = scanner.nextInt();
			
			if (inputValue == -1) {
				break;
			} 
			else {
			System.out.printf("%d월의 마지막날은 %d일입니다.%n", inputValue, getLastdayOfMonths(inputValue));
			System.out.println("-----------------------------");
			}
			
			if (getLastdayOfMonths(inputValue) == 31) {
				for(int j=0; j<6; j++) {
					System.out.println(calendarMonths[j]);
				}
				System.out.println(calendarMonths[7]);
				System.out.println(calendarMonths[8]);
			}
			else if (getLastdayOfMonths(inputValue) == 30) {
				for(int j=0; j<7; j++) {
					System.out.println(calendarMonths[j]);
				}
				System.out.println(calendarMonths[8]);
			}
			
			else {
				for(int j=0; j<6; j++) {
					System.out.println(calendarMonths[j]);
				}
				System.out.println(calendarMonths[8]);
			}
		}
		System.out.println("출력을 종료합니다.");
		scanner.close();
		
	}

}
