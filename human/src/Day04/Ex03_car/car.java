package Day04.Ex03_car;

public class car {
	
	// 멤버변수 == 필드(field)
	String mode1;
	int speed;
	
	// 생성자
	car() {
		
	}

	car(String mode1 ) {
		this.mode1 = mode1;
	}
	
	car(String mode1, int speed ) {
		this.mode1 = mode1;
		this.speed = speed;
	}
	// getter : 변수의 값을 가져오는 메소드
		// setter : 변수의 값을 지정하는 메소드
		// 게터/세터 이름 :  getName(), setName()
		// - get/set 뒤에 변수명을 첫글자를 대문자로해서 메소드의정의
		
	
	
	

	public String getMode1() {
		return mode1;
	}

	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			speed = 0;
		}
		if(speed >=300) {
			speed = 300;
		}
		this.speed = speed;
	}
	
	

	

	
	
}


