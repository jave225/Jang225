package day02;

import java.util.Scanner;

public class EX16_DoWhile {
	
	public static void main(String[] atgs)  {
		
		// 변수 선언 : 메뉴번호, 메뉴 이름
		int menuNo = 0;
		String menuNane = "";
		Scanner sc = new Scanner(System.in);
		
		// do~while문
		// : 무조건 1회는 실행 후, 조건 검사하여 반복하여 반복문
		do {
			System.out.println("1. 참치마요덮밥");
			     
			System.out.println("2. 잔치국수");
			System.out.println("3. 카레");
			System.out.println("4. 맥도날드");
			System.out.println("5.바나나우유");
			System.out.println("0. 종료");
			
			menuNo = sc.nextInt(menuNo)
			
		}
		while (menuNo != 0 )
			
			
		
		
	}

}
