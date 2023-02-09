package Day07.EX06_AutoClose;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FilelnputTxt {
	
	public static void main(String[] args) {
		
		// 스트림
		// : 실제 입력이나 출력이 표현된 데이터 흐름
		
		// 입력받을 수 있는 데이터
		// : 키보드로부터 입력한 키, 파일 등
		
		// [프로그램] <-- [스트림] <----(키보드), (파일)
		
		// 입력 스트림 클래스   :InputStream
		// 파일 입력 스트림 클래스  : FileInputStream
		FilelnputStream fis = null;
		
		try {
			fis = new FilelnputStream("test.txt"); // test.txt 파일을 입력할수 있도록 연결
			
			int read = 0;
			// fis.read()  : .txt 파일을 한글자씩 데이터를 읽어오는 메소드
			//                - 더이상 읽어올 데이터가 없으면 -1 을 변환
			// 가져올 글자가 없을 떄까지 반복한다.
			while( (read = fis.read () )  != -1) {
				System.err.println("파일을 찾을 수 없습니다");
			}
		} 
		
		catch (FileNotFoundException e) {
			// FileNotFoundException : 파일이 없을 떄 발생하는 예외
			// 예외 발생 원인을 찾아 단계별로 예외 메시지를 출력
			e.printStackTrace();
			System.err.println("파일을 찾을 수 없습니다");
		}
		
		catch (IOException e) {
			// IOException : 입출력 과정에서 문제 시 발생하는 예외
			e.printStackTrace();
			System.err.println("입출력 관련 예외 발생");
	}
  finally {
	  if(fis != null) {
		  try {
			  fis.close(); // FilelnputStream 객체 지원 해체
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}
	  }
  }
}
