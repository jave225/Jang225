package Day03_Array;

public class EX04_Foreach {
	
	public  static void main(String[] args) {
		String [] week = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일",};
		
		for (int i = 0; i < week.length; i++) {
			System.out.print(week[i] + "");
			
			
		}
		System.out.println();
		
		// Foreach : cth1 + space
		// Foreach 문
		// - 배열 또는 컬랙션의 모든 요소를 순서대로 반복되는 반복문
		// for( 요소타입 요소명 : 배열 ) {  }
		for (int i = 0; i <week.length; i++) {
			System.out.println(week[i] + " ");
		}
	}
		

}
