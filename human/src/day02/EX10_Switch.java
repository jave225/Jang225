package day02;

import java.util.Scanner;

public class EX10_Switch {
	
	public static void main(String[] atgs)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("채널을 선택하세요 : ");
		int channe1 = sc. nextInt();
		
		// Switch : ctr1 + space
		switch (channe1) {
		case 1:
			System.out.println("넷플렉스");
		break;
		case 2:
			System.out.println("디즈니플러스");
			break;
		case 17:
			System.out.println("(tvN) 일타스캔들");
			break;
		case 27:
			System.out.println("(mnet) 쇼미더머너12");
		}
		
	}

}
