package Day04;

import java.util.Scanner;

public class EX06_Meploer {
	// 메소드 : 특정 기능을 하는 코드의 모음
	public static int plus(int a, int b) {
		int result = a + b;
		return result;
	}
	
	// 접근지정자 (static) 반환타입 메소드명(매개변수1, 매개변수2, ...) { 실행문; }
	// - 접근지정자   :  public, protected, default, private
	// - static    : 생략, static
	// - 변환타입    : 기본타입, 참조타입 (int,  double, String ...)
	//               return (값); - 반환하는 (값)의 자료형을 지정
	// - 메소드명     : 직접 이름을 지정, 관례적으로 카멜케이스로 지정
	//  -          : ex) simpleExample()
	// - 미개변수     : 메소드 호출 시, 전달한 인자를 순서대로 가져오는 변수
	// - (parameter)
	public static int minus(int a, int b) {
		int result = a - b;
		// resurn (값);
		// 1. 메소드 종료
		// 2. 메소드해체
		// 3. (값)을 메소드 호출한 자리로 변환
		return result;

	}
	public static void main(String[] atgs)  {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		
		System.out.print("b : ");
		int b = sc.nextInt();
		
		// 메소드 호출: 메소드명(인자1, 인자2 );    - 전달인자 (argument)
		System.out.println( plus(a,b) );
		System.out.println(minus(a, b) );
	}

}
