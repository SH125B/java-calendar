package java_calendar;

import java.util.Scanner;

public class Calendar {
	
	public static int[] lastdayOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int getLastdayOfMonths(int a) {
		return lastdayOfMonths[a-1];
	}
	
	public void printSampleCalendar() {
		System.out.println("hello calendar");
		System.out.println("일   월   화   수  목   금   토");
		System.out.println("------------------------------");
		System.out.println("1   2    3   4   5   6   7");
		System.out.println("8   9   10  11  12  13  14");
		System.out.println("15 16   17  18  19  20  21");
		System.out.println("22 23   24  25  26  27  28");
		System.out.println("------------------------------");
	}
	
	public static void main(String[] args) {

		
		System.out.println("1월부터 12월까지 최대일수를 출력합니다.");
		System.out.println("출력횟수를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		
		
		for(int i=0; i<times;i++) {
		System.out.println("1부터 12까지 숫자중 하나를 입력하십시오.");
		
		int inputValue = scanner.nextInt();
		System.out.printf("%d월의 마지막날은 %d일입니다.%n", inputValue, getLastdayOfMonths(inputValue));
		System.out.println("-----------------------------");
		
		/* typing한 달력출력
		Calendar cal = new Calendar();
		cal.printSampleCalendar();
		*/ 
		}
		System.out.println("출력을 종료합니다.");
		scanner.close();
		
	}

}
