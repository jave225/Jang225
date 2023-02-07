package day02;

import java.util.Scanner;

public class EX22_Continue {
	
	public static void main(String[] atgs)  {
		// 5개의 정수를 입력받아,
		// 입력받은 수 중 양수(+)만 함계를 구하여 출력하세요.
		Scanner sc = new Scanner(System.in);
		int sum = 0;     // 합계
		
		for (int i = 0; i < 5; i++) {
			int N = sc.nextInt();
			
			// 음수일 떄만, 합계에 누적하지 않고 넘어가려면?
			if( n < 0)
				continue;
			// 남은 실행문을 무시하고, 다음 반복으로 점프
			
			sum += n;
			
				
			
		}
		System.out.println();
	}

}
