package day02;

public class EX14_WhileSum {
	
	public static void main(String[] atgs)  {
		// 1부터 100까지의 합계를 구하시오.
		// 1+2+3+4+ ... + 100 =5050
		int sum;
		int a = 1;
		
		while( a <= 100) {
			// 복합 대입 연산자
			sum = sum + a;
			a++;
		}
		System.out.println("합계 :" + sum);
	}

}
