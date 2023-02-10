package Day08.EX05_Text;

import java.text.SimpleDateFormat;
import java.util.Date;


public class SimpleDateFormatEX {
	
	public static void main(String[] args) {
		/*
		 * yyyy : 4자리 년도,  yy  : 2자리 년도
		 * MM  :  2자리 월,      M : 1자리 월
		 * dd  :  2자리 월,   d  : 1자리 일
		 *  D : 올해의 몇 번쨰 일   
		 *  W : 올해의 몇주차
		 *  W : 이번달의 몇주차
		 *  E : 요일
		 * a : 오전/ 오후 
		 * HH : 시
		 * mm : 분
		 * ss :  초
		 */
		
		Date now = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat();
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM뭘 dd일");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM뭘 dd일 a HH:mm:ss");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("yyyy년 MM뭘 dd(E)");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat(".올해 첫날부터 D번쨰 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("이번달 첫 날부터 d번쨰 날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("올해의 w주차 입니다");
		System.out.println(sdf.format(now));
		
		
		sdf = new SimpleDateFormat("이번 달의 w주차 입니다");
		System.out.println(sdf.format(now));
		
	}

}
