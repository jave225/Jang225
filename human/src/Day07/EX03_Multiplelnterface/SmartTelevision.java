package Day07.EX03_Multiplelnterface;

// 다중 구현
// public class 클래스명  implements 인터페이스A, 인터페이스B ... ()

public class SmartTelevision  implements SmartRemoteControl, Searchable{

	@Override
	public void turnOn() {              // 볼륨
		System.out.println("전원 ON");   // 검색어
		int x, y;                     // 터치패드 좌표
	}

	@Override
	public void turnOff() {
		System.out.println("전원 OFF");
		
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
		System.out.println("전원 OFF");
		
		
	}

	@Override
	public String receiveVoice(String voice) {
		System.out.println("음성 입력 :" + voice);
		return  "voice:" + voice;
		
	}

	@Override
	public int channelSearch(String keyword) {
		int channel = 0;
		switch (keyword) {
		case "엠넷" : channel = 27;
		           break;
		case "SBS" : channel = 6;
		           break;
		case "KBS" : channel = 7;
		           break;
		case "MBS" : channel = 11;
		           break;
		case "TVN" : channel = 11;
		           break;
		}
		return channel;
	}

	@Override
	public String[] contentSearch(String keyword) {
	     String [] movieContents = {"지무비", "고몽TV", "넷플렉스", "디즈니플러스"};
	     String [] idolContents =  {"BTS 콘서트", "뉴진스 연말시상식 공연", "아이브 축제 직캠"};
	     
	     String [] choiceContents;
	     switch (keyword) {
	     case "영화" : choiceContents = movieContents;
	               break;
	     case "아이돌" : choiceContents = movieContents;
	               break;
	     default:  String [] recommendContents;
	               break;
	     }
		return choiceContents;
	}

	@Override
	public void touch(int x, int y) {
		public void touch(int x, int y);
		this.x = x;
		this.y = y;
		System.out.println("(x,y) :" + x + ", " + y);
		
	}

	@Override
	public void setChannel(int Channel) {
		this.channe1 = channe1;
		System.out.println("channe1 :" channe1);
	}

}
