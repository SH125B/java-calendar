package java_calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "Month> ";
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		System.out.println("달력을 출력합니다. 출력횟수를 입력하시오.");
		
		Scanner scanner = new Scanner(System.in);
		int times = scanner.nextInt();
		
		
		for(int i=0; i<times;i++) {
			System.out.println("출력을 원하는 년도를 숫자로 입력하시오.");
			System.out.print("Year> ");
			int year = scanner.nextInt();
			
			System.out.println("출력을 원하는 달을 숫자로 입력하시오. 중간에 종료하려면 -1를 입력하십시오.");
			System.out.print(PROMPT);
			int month = scanner.nextInt();
			
			if (month == -1) {
				break;
			} 
			else {
			System.out.printf("%d월의 마지막날은 %d일입니다.%n", month, cal.getLastdayOfMonths(year, month));
			System.out.println("-----------------------------");
			}
			
		cal.printCalendar(year, month);	
			
			/* 내 풀이
			if (cal.getLastdayOfMonths(inputValue) == 31) {
				for(int j=0; j<6; j++) {
					System.out.println(cal.calendarMonths[j]);
				}
				System.out.println(cal.calendarMonths[7]);
				System.out.println(cal.calendarMonths[8]);
			}
			else if (cal.getLastdayOfMonths(inputValue) == 30) {
				for(int j=0; j<7; j++) {
					System.out.println(cal.calendarMonths[j]);
				}
				System.out.println(cal.calendarMonths[8]);
			}
			
			else {
				for(int j=0; j<6; j++) {
					System.out.println(cal.calendarMonths[j]);
				}
				System.out.println(cal.calendarMonths[8]);
			} */
		}
		System.out.println("출력을 종료합니다.");
		scanner.close();
	}
	

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}

}
