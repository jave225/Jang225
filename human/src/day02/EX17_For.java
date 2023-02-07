package day02;

public class EX17_For {
	
	public static void main(String[] atgs)  {
		// for( 1.초기식 ; 2조건식 ; 4증감식 ) { 3실행문; }
		// 실행 순서 : 1 => 반복 (2 => 3 => 4)
		// 1. 1~10 까지의 정수를 출력하세요.
		for (int i = 0; i <= 10; i++) {
			System.out.print("i +  ");
		}
		System.out.println();
		
		// 2. 50~100까지의 정수를 출력하세요.
		for (int i = 50; i <= 100; i++) {
			System.out.println(i + " ");
			
		}
		System.out.println();
		
		// 3. 1~20까지의 정수 중, 짝수만 출력하세요.
		// 2 4 6 ... 20
		for (int i = 2; i <= 20; i+=2) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		//
	}

}
