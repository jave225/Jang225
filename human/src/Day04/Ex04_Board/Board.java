package Day04.Ex04_Board;

import java.util.Date;

/**
	 * 
	 * 게시판
	 * - 게시글 번호
	 * - 제목
	 * - 내용
	 * - 작성자
	 * - 등록일자
	 * - 수정일자
	 * 
	 */
	public class Board {
		
		private int boardNo;
		private String title;
		private String content;
		private String writer;
		// Date : 날짜/시간을 다루는 클래스
		private Date regDate;
		private Date updDate;
		public Board(int boardNo, String title, String content, String writer, Date regDate, Date updDate) {
			
		}
		@Override
		public String toString() {
			return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
					+ "]";
			// Board [boardNo=1 title=제목, ...]
		}
		
		// 생성자
		public  Board() {
		
		// getter(), setter()
			public
		// toString()
	
}
}