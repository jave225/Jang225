package Day07.EX04_TryCatch;

import java.util.Scanner;

public class DivideByZerd {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		
		System.out.print("a :");
		a = sc.nextInt();
		
		System.out.println("b : ");
		b = sc.nextInt();
		
		// 예외 메시지 : java.long.ArithmericException: / by zero
		System.out.println("a /b = " + a / b);
		// 예외 처리문 ㅣ try ~ catch
		try {
			// 예외 발생 가능성 있는 문장
			
		} 
		// catch( 예외타입 객체명) { }
		catch (ArithmericException e) {
			//예외 발생 시, 예외 처리 문장
			System.err.println("0으로 나누는 연산은 수학적으로 정의되지 않습니다.");
		}		
		finally {
			// 예외 발생과 무관하게 실행하는 문장
			// 예외 처리와 관련한 문장을 작성( 메모리를 해제하는 문장 등을 작성)
		
		sc.close();
			
		}
	}	
}


