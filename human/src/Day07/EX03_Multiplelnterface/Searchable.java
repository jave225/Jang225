package Day07.EX03_Multiplelnterface;

// 검색 인터페이스
public interface Searchable {
	
	// 검색
	// 검색어에 해당되는 채널번호를 반환
	int channelSearch(String keyword);
	
		// 컨텐츠 검색
	// 검색어에 해당되는 컨텐츠들을 반환
	String[] contentSearch(String keyword);
	
	

}
