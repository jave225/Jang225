package ms06;

import java.util.Scanner;

public class Lotto2 {
	
	public static void main(String[] args) {
		
		System.out.print("몇 게임?");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int x = 0; x < N; x++) {
			System.out.print("[" + (x+1) + " 게임] ");
			int[] lotto = new int[6];
			for (int i = 0; i < lotto.length; i++) {
				int rendom = (int)(Math.random() * 45 ) + 1;
				
				// 중복제거?
				// 2. 현재 게임의 수들을 반복한다.
				    // 구한 랜덤 수와 현재 게임의 수들 중 일치하는 값이 있으면,
				    // 다시 랜덤 수를 구한다.
				//lotto[i] = rendom;
				
			}
			
			// 오름차순 정렬?
			
			// 출력
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + "  ");
				
							}
			System.out.println();
					}
		
		
	}

}
