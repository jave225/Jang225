package day02;

import java.util.Scanner;

public class EX11_Grade {
	
	public static void main(String[] atgs)  {
		// 학점을 입력받아,  점수대를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.print("학점 : ");
		// sc.next();         --> (String)
		// toUpperCase()      --> 대문자로 변환
		// charAt(0)          --> 문자열에서 해당 index(순서번호)의 문자를 추출
		
		// 입력받은 문자열을 대문자로 변환하고, 첫번째 (0) 문자를 가져온다.
		char grade = sc.next().toUpperCase().charAt(0);
		
		switch (grade) {
		case 'A' :
			System.out.println("70점~80점입니다.");
			break;
		case 'B' :
			System.out.println("70점~80점입니다.");
			break;
		case 'C' :
			System.out.println("70점~80점입니다.");
			break;
		case 'D' :
			System.out.println("60점~70점입니다.");
			break;
		}
	}

}
