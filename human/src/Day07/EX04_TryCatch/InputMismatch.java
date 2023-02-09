package Day07.EX04_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuName = "";
		int menuNo = 0;
		
		do {
			System.out.println("1. Java");
			System.out.println("2. HTML");
			System.out.println("3. Css");
			System.out.println("4. JavaScript");
			System.out.println("0. 종료");
			
			System.out.println("메뉴 입력 :");
			
			// try-catch 예외처리문 작성
			try {
				menuNo = sc.nextInt(); // 예외발생 가증성 있는 문장
			} catch (InputMismatchException e) {
				sc.next();          // 입력 스트림에 남아있는 (엔터) 비움
				System.out.println("(0~4) 사이의 정수를 입력하시오");
				continue;
				
			}
			
			// 종료 조건
			if(menuNo == 0) break;
			
			switch(menuNo) {
			case 1 : menuNo = "Java";
			        break;
			case 2 : menuNo = " HTML"; 
			        break;
			case 3 : menuNo = " CSS"; 
			        break;
			case 4 : menuNo = "JavaScript";
			         break;
			case 5 : menuNo = "종료";
			         break;
			}
		
		}
		
	}

}
