package day01;

import java.util.Scanner;

public class EX13_Boolean {
	
	public static void main(String[] atgs)  {
		Scanner sc = new Scanner(System. in);
		// boolean : true(참), false(거짓) 논리값만 가지는 자료형
		boolean on = sc. nextBoolean();     // 논리값(teue, false)를 립력받는 메소드
		
		System.out.println("on :" + on);
		
		if( on ) {System.out.println("전원 ON");
		} else {
			System.out.println("전원 OFF" );
		}
		
	}

}
