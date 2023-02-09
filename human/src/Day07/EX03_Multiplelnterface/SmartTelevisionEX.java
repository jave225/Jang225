package Day07.EX03_Multiplelnterface;

import java.util.Iterator;

public class SmartTelevisionEX {
	
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolume(20);
		int channel = tv.channelSearch("SBS");
		tv.setChannel(channel);
		
		String[] idolContents = tv.contentSearch("아이돌");
		for (String content : idolContents ) {
			System.out.println("========= 검색된 컨텐츠 =======");
			System.out.print(content + "");
			}
		System.out.println();
		
		tv.receiveVoice("오늘 날씨 어떄?");
		
		tv.turnOff();
	}

}
