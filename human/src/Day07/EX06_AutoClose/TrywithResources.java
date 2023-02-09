package Day07.EX06_AutoClose;

public class TrywithResources {
	
	public static void main(String[] args) {
		
		// try-with-resources 문
		// : try( 자동으로 자원해제할 객체 생성 ) { }
		// autoClossabie 인터페이스를 구현한 클래스이어야 자동으로 지원해제 가능
		try {FilelnputStream fis = new FilelnputStream("test.txt") ) {
			int read;
			
			while ((read = fis.read() != -1) {
				System.out.print((char) read);
				
				
			}
		}
			
		} catch (Exception e) {
			
		}
		
	}

}
