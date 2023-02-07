package Day04.Cless;

public class pikachu {
	
	// 클래스        : 객체를 정의하는 설계도
	// 멤버         : 변수, 메소드
	
	// 변수
	public int energy;
	public String type;
	
	// 기본 생성자
	public pikachu() {
		
		//this(100, "전기");
		//energy = 100;
		//type = "전기";
	}
	
	       // 생성자 자동완성
	       // alt + shift + S -> O
	       // 매개변수가 있는 생성자
	       // 메소드(생성자) 오버로딩  - "메소드 중복정의"
	public pikachu(int energy, String type) {
		// this : 객체 자기 자신을 가리키는 레퍼런스
		this.energy = energy;
		this.type = type;
	}

	// 매개변수가 있는 생성자
	//public pikachu(int energy, String string) {
		// this : 객페 자기 자신을 가리카는 래퍼런스
		//this.energy = energy;
		//this.type = type;
		// TODO Auto-generated constructor stub
	// 메소드
	// 접근지정자 반환타입 메소드명 ( 매개변수 ) { }
	public  String aAttack()  {
		return "십만볼트";
		
		
	}
	public  String bAttack()  {
		return "전광석화";
	}
	

}
