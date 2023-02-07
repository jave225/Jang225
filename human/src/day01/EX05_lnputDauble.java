package day01;

import java.util.Scanner;

public class EX05_lnputDauble {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x : ");
		int x = sc.nextInt();
		
		System.out.print("y : ");
		int y = sc.nextInt();
		
		System.out.print("Z : ");
		int z = sc.nextInt();
		
		int sum = x + y + Z;
		// 강제형변환 : 
		double avg = sum / 3;       // double 실수형
		// 자동 형변환
		// -작은타입을 큰타입에 대입할 때, 자동으로 큰 타입으로 변환되는 것
		// sum(int) + 3(int)
		// (int) + (int) =(int)
		//  10 /  3  = 3.3333...
		//  10 /  3  = 3 (정수타입이라서 소수점 표현 불가)
		// int 타입끼리 연산하면 결과도 int
		
		//(정수) 
	}
	
	   
	   
	   
	   

}
