package Day04.Cless;

// 상속
// - 키워드 : 자식클래스 extends 부모클래스 { }

public class Raichu  extends pikachu {

	// 생성자 자동완성
	// alt + shift + S -> C
	public Raichu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Raichu(int energy, String type) {
		super(energy, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String aAttack() {
		return " 백만볼트";
	}

	@Override
	public String bAttack() {
		// TODO Auto-generated method stub
		return "볼트체인지";
	}
	
	
	// 메소드 오라이딩 : 메소드 재정의
	// 오버라이딩 자동 완성 :  alt + shift + S -> V
	
	
	

}

