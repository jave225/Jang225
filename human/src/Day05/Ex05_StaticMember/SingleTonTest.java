package Day05.Ex05_StaticMember;

public class SingleTonTest {
	
	public static void main(String[] args) {
		SingleTon st01 = SingleTon.getinstance();
		SingleTon st02 = SingleTon.getinstance();
		
		// 인스턴스가 메모리 공간에 아나만 할당되어 있다.
		System.out.println(st01 == st02);
	}

}
