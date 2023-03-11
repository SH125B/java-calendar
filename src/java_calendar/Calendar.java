package java_calendar;

public class Calendar {
	
	public static int[] lastdayOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] leapYearLastday = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static String[] weekdays = {"su", "mo", "tu", "we", "th", "fr", "sa"};

	public boolean isLeapYear(int year) {
		
		if ((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			return true;
		}
		return false;
	}
	
	public int getLastdayOfMonths(int year, int month) {
		if (isLeapYear(year) == true) {
			return leapYearLastday[month-1];
		}
		
		return lastdayOfMonths[month-1];
	}
	
	
	public int getIndexOfFirstday(String weekday) {
		int indexOfFirstday = 0;
		
		for(int i=0; i<weekdays.length; i++) {
			if(weekday.equals(weekdays[i])) {
				indexOfFirstday = i;
			}
		}
		return indexOfFirstday;
	}
	

	public void printCalendar(int year, int month) {
		
		System.out.printf("     <%d년%2d월> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		
		// get indexOfFirstday automatically
		int indexOfFirstday = getWeekdayIndex(year, month);
		
		for(int i=0;i<indexOfFirstday;i++) {
			System.out.print("   ");
		}
		
		// 달력 첫째줄
		for (int i=1; i<=7-indexOfFirstday; i++) {
			System.out.printf("%3d", i);			
		}
		System.out.println();
		
		//달력 둘째줄부터
		int lastDay = getLastdayOfMonths(year, month);
		int secondLineFirstNum = 8-indexOfFirstday;
		int secondLineBlankCount = 0;
		
		for (int i=secondLineFirstNum; i<= lastDay; i++) {
			System.out.printf("%3d", i);			
			secondLineBlankCount++;
			
			if(secondLineBlankCount==7) {
				System.out.println();
				secondLineBlankCount=0;
			}
		}
		System.out.println();
		
	}

	// 몇 번째 요일인지 구하기
	private int getWeekdayIndex(int year, int month) {
		int syear = 1970;
		final int WEEKDAYINDDEX = 4; // 1970.01.1st = Thursday
		
		int count = 0;
		
		// 입력받은 달의 1일까지 몇 년 지났는지
		for (int i=syear;i<year;i++) {
			int totalDaysOfAYear = isLeapYear(i) ? 366 : 365 ;
			count += totalDaysOfAYear;
		}
		
		// 입력받은 달의 1일까지 몇 달 지났는지
		for (int i =0; i < month-1; i++) {
			int delta = getLastdayOfMonths(year, i+1);
			count +=delta;
		}
		// 며칠 지났는지
		
		int weekdayIndex = (WEEKDAYINDDEX+count) %7;
		return weekdayIndex;
	}
	
	
	
	
	/* 내 풀이
	public  String[] calendarMonths = {"일   월   화   수  목   금   토", "------------------------------"
,"1   2    3   4   5   6   7", "8   9   10  11  12  13  14", "15 16   17  18  19  20  21"
, "22 23   24  25  26  27  28", "29 30", "29 30   31", "------------------------------"
	}; */ 


}
