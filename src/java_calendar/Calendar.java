package java_calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		System.out.println("hello calendar");
		System.out.println("일   월   화   수  목   금   토");
		System.out.println("------------------------------");
		System.out.println("1   2    3   4   5   6   7");
		System.out.println("8   9   10  11  12  13  14");
		System.out.println("15 16   17  18  19  20  21");
		System.out.println("22 23   24  25  26  27  28");
		System.out.println("------------------------------");

		System.out.println("1월부터 12월까지 최대일수를 출력합니다.");
		System.out.println("1부터 12까지 숫자중 하나를 입력하십시오.");
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		if (inputValue%2 != 0 || inputValue == 8) {
			System.out.printf("%d월의 최대일수는 %d일입니다.%n", inputValue, 31);
		} 
		else if(inputValue == 2){
			System.out.printf("%d월의 최대일수는 %d일입니다.%n", inputValue, 28);
		}
		else {
			System.out.printf("%d월의 최대일수는 %d일입니다.%n", inputValue, 30);
		}
		
		
		
		scanner.close();
		
	}

}
