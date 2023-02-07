package Day06_EX03_Interface;

// implements : 인터페이스를 구현하는 키워드

public class Speaker implements RemoteControl {
	
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다...");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다...");
		
	}
	
	
	// 메소드
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스피커 볼룸 ..." + this.volume);
		
	}


}
