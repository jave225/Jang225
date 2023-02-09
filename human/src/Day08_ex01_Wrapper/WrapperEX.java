package Day08_ex01_Wrapper;

public class WrapperEX {
	
	public static void main(String[] args) {
		
		// Charater
		// Char -> Charater
		// : 문자타입인 Char 기본타입을 객체화한 클래스
		
		// 대소문자 변환
		char a = 'a';
		char A = 'A';
		
		System.out.println(Character.toLowerCase(A)); // 소문자로 변환
		System.out.println(Character.toUpperCase(a)); //  대문자로 변환
		
		char c1 = '7', c2 = 'k';
		
		// 해당 문자가 숫자인지 확인
		if(Character.isAlphabetic(c2)) {
			System.out.println(c2 + "(은/는) 영문자");
		}
		 
		
		// Integer
		// int -> Integer
		// : 정수타입인 int 기본타입을 객채화한 클래스
		System.out.println(Integer.parseInt("28"));    // 문자열 -> 정수
		System.out.println(Integer.toString(28) + 2);  // 정수 -> 문자열
		System.out.println(Integer.toBinaryString(28)); // 2진수 문자열로 변환
		System.out.println(Integer.bitCount(28)); // 2진수의 1개 개수
		
		// deprecated ?
		// : 더 이상 사용되지 않는 문법
		//Integer i = new Integer(28);
		Integer i = 28;
		System.out.println(i.doubleValue());  // double 타입으로 변환
		
		// Double
		// double -> Double
		// : 실수 타입인 Double 기본타입을 객체화한 클래스
		Double d = 3.14;
		System.out.println(d.toString() + 0.06);      // 실수형 -> 문자열
		System.out.println(Double.parseDouble("3.14") + 0.06 ); // 문자열 -> 실수형
		
		// Boolean
		// boolean ->Boolean
		// : 불타입인 Boolean 기본타입을 객체화된 클래스
		Boolean b = ( i < 40);
		System.out.println(Boolean.toString(b));  // "true"
		System.out.println(Boolean.parseBoolean("false"));   //False ->false
	}

}
