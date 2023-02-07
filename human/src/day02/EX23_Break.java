package day02;

import java.util.Scanner;

public class EX23_Break {
	
	public static void main(String[] atgs)  {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("STOP 을 입력하면 종룔바니다.");
		
		// 무한루프
		// : 반드시 종료조건을 추가해주어야한다.  (break)
		while(true) {
			System.out.print("입력 :");
			String str = sc.nextLine();
			
			// 문자열. equals("비교문자열")
			// : 문자열이 비교문자열과 일치하는지 여부를 알려주는 메소드
			if( str.equals('STOP'))
		}
	}

}
