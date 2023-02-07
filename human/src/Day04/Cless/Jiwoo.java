package Day04.Cless;

public class Jiwoo {
	
	public static void main(String[] atgs)  {
		// 객체생성
		// 클래스타입 객체명 = new 클래스명();
		pikachu Pikachu = new pikachu();
		
		// (.) 접근 연산자 : 객체의 변수,메소드에 접근하는 연산자
		
		System.out.print("########## 피카츄 ########## ");
		System.out.print("에너지 : " + pikachu20.energy );
		System.out.print("타입 : " + pikachu20.type );
		System.out.print("공격 A : " + pikachu20.aAttack() );
		System.out.print("공격 B : " + pikachu20.aAttack() );
		
		pikachu pikachu20 = new pikachu(150, "진화");
		
		System.out.print("########## 라이츄 ########## ");
		System.out.print("에너지 : " + pikachu20.energy );
		System.out.print("타입 : " + pikachu20.type );
		System.out.print("공격 A : " + pikachu20.aAttack() );
		System.out.print("공격 B : " + pikachu20.aAttack() );
		
		
		System.out.print("########## 피카츄 LV20 ########## ");
		System.out.print("에너지 : " + pikachu20.energy );
		System.out.print("타입 : " + pikachu20.type );
		System.out.print("공격 A : " + pikachu20.aAttack() );
		System.out.print("공격 B : " + pikachu20.aAttack() );
		
		Raichu raichu40 = new Raichu(400, "메가전기");
		
		System.out.print("########## 라이츄 LV40 ########## ");
		System.out.print("에너지 : " + pikachu20.energy );
		System.out.print("타입 : " + pikachu20.type );
		System.out.print("공격 A : " + pikachu20.aAttack() );
		System.out.print("공격 B : " + pikachu20.aAttack() );
		
	}
	}


