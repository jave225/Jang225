package ms06;

public class Lotto {
	
	public static void main(String[] args) {
		
		// Math.random()                 : 0.xxxx
		// Math.random() * 10            : x.xxxx  (0~9)
		// (int) (Math.random () * 10)   : 0~9
		 // (int) (Math.random() * 100)  : xx.xxxx (0~99)
		// (int) (Math.random () * 10) + 1  : 1~10
		 // (int) (Math.random() * 100) + 1 : 1 ~100
		
		// 공식 : (int) (Math.random() * 개수) + 시작숫자
		System.out.println(Math.random() );     // 0.xxxx
		System.out.println((int) (Math.random()* 10) ); // x.xxxx  (0~9)
		System.out.println((int) (Math.random()* 100) );
		
		// 1~45
		int random = (int)(Math.random() * 45 ) + 1;
		System.out.println(random);
		
	}

}
