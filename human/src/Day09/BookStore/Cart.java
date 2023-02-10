package Day09.BookStore;

/**
 * 장바구니
 * 
 */

public class Cart {
	
	// 책 id (ISBN)
	// 수량
	// 총 가격
	private String bookInfo;
	private String bookID;
	private String count;
	private int totalPrice;
	
	public Cart() {
		
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public void updateTotalPrice() {
		this.totalPrice = count * Integer.parseInt(booknfo[2]);
	}
}
	
