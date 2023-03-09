package java_calendar;

import java.util.*;

public class Sum {
	public static void main(String[] args) {
		
		//숫자 출력
		int a, b;
		
		//숫자 입력
		
		System.out.println("두 수를 입력하시오");
		Scanner scanner = new Scanner(System.in);
		String s1 = "";
		String s2 = "";
		s1 = scanner.next();
		s2 = scanner.next();
		
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);


		System.out.printf("두 수의 합은 %d입니다", a+b);
		scanner.close();
		
	}
}
