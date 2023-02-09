package Day07.EX03_Multiplelnterface;

// 인터페이스 다중 상속
// public interface 인터페이스 extends 인터페이스A, 인테페이스B ...

public interface SmartRemoteControl extends RemoteControl, Microphone {
	
	// 터치패드 가능
	// - x y 좌표 위치에 터치패드를 클릭
	void touch(int x, int y);

}
