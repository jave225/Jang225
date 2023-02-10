package Day09.BookStore;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Day05.Ex05_StaticMember.StaticMember;

public class Main {
	
	// 책의 개수, 책의 속성 개수
	static final int BOOK_COUNT = 3;
	static final int BOOK_ITEM = 7;
	
	private static final String Welcome = null;
	private static int cartCount;

	public static void main(String[] args, Person Person) {
		// 도서 목록을 저장할 2차원 배열 생성
		String[] [] bookList =new String[BOOK_COUNT][BOOK_ITEM];
		Scanner sc = new Scanner(System.in);
		
		// 이름과 연락처 입력
		System.out.print("이름:");
		String userName = sc.next();
		System.out.print("연락처:");
		String tel = sc.next();
		
		boolean end = false;       // 종료여부  - true(종료), false(종료안함)
		while(!end) {       // 조건식이 true -- > 반복
			
			// 메뉴 출력
			showMenu();
			
			int menuNo = sc.nextInt();
			System.out.println(menuNo + "번 메뉴를 선택!");
			
			// 유효한 메뉴번호 검사
			if(menuNo < 0 || menuNo > 7) {
				System.out.println(" (0~7) 사이의 숫자를 입력해주세요");
			}
		
		System.out.println("********************");
		System.out.println("\t" + Welcome);
		System.out.println("********************");
		System.out.println("1. 고객 정보 확인");
		System.out.println("2. 장바구니 목록 보기");
		System.out.println("3. 장바구니 비우기");
		System.out.println("4. 장바구니 항목 추가");
		System.out.println("5. 장바구니 수량 조절");
		System.out.println("6. 장바구니 항목 삭제");
		System.out.println("7. 영수증 표시");
		System.out.println("0. 프로그램 종료");
		System.out.println("********************");
		System.out.println(">> 메뉴번호 입력");
		int menuNo1 = sc.nextInt();
		System.out.println(menuNo1 + " 번 메뉴를 선택");
		
		// 유효한 메뉴번호 검사
		if(menuNo1 < 0 || menuNo1 > 7) {
			System.out.println("(0~7) 사이의 숫자를 입력해주세요");
			continue;
		}
		
		switch (menuNo1) {
		case 1:
			guestInfo(userName, tel);    // 고객 정보 확인
			break;
		case 2:
			System.out.println("장바구니 목록  ");
			cartList();
			break;
		case 3:
			System.out.println("장바구니 비우기  ");
			cartClear();
			break;
		case 4:
			System.out.println("장바구니 항목 추가  ");
			cartAdd(bookList);
		    break;
		case 5:
			System.out.println("장바구니 수량 조절  ");
			cartSetCount();
		    break;
		case 6:
			System.out.println("장바구니 항목 삭제  ");
			System.out.print(" 삭제할 장바구니 항목의 ISBN :  ");
			String bookId = sc.nextLine();
			cartRemove(bookId);
		    break;
		case 7:
			System.out.println("영수증 표시 ");
			printBill(Person);
		    break;
		case 0:
			System.out.println("프로그램 종료 ");
			 end = true;
		    break;
		
		
		} // switch 끝
		
			
		} // while 끝
		
								
	} // main 끝
	
	private static void cartRemove(String bookId) {
		// TODO Auto-generated method stub
		
	}

	private static void cartSetCount() {
		// TODO Auto-generated method stub
		
	}

	private static void showMenu() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * 고객 정보 확인
	 * @param userName
	 * @param tel
	 */

   private static void guestInfo(String userName, String tel) {
		System.out.println("현재 고객 정보 : ");
		System.out.println("이름 : " + userName + ", 연락처 :" + tel);
	}
   /**
    * 장바구니 목록
    */
   public static void  cartList() {
	   System.out.println("********  장바구니 목록************");
	   System.out.println("********************************");
	   System.out.println("번호\t|  ISBN \t| 개수\t| 합계\t |");
	   for (int i = 0; i < cartCount; i++) {
		   System.out.print((i+1) + "\t|");
		   System.out.print("cartList[i].getBookID() + \t|");
		  System.out.print("cartList[i].getCount() + \t|");
		System.out.print("cartList[i].getTotalPrice() + \t|");
				System.out.println();
	}
	   System.out.println("***************************************");
   }
   
   /**
    * 장바구니 비우기
 * @param cartList 
  *  @param cartCount 
 *      
 */
   
   public static  void  cartClear(Cart[] cartList) {
	   System.out.println("********  장바구니 비우기 ************");
	   
	   for (int i = 0; i < cartCount; i++) {
		   cartList[i] = null;
	   }
	   cartCount = 0;
	   System.out.println("장바구니 목록을 비웟습니다");
   }
   
   /**
    * 장바구니 항목추가
 * @param bookList 
    */
   public static void  cartAdd(String[][] bookList) {
	   System.out.println("********  장바구니 항목 추가************");
	   String[][] bookList = null;
	// 도서 목록 확인
	   bookList(bookList );
	   
	   // 장바구니에 지정된 도서항목을 추가
	   boolean end =false;
	   while(end) {
		   System.out.print("장바구니에 추가할 도서 ISBN 입력 : ");
		   Scanner sc = new Scanner(System.in);
		   
		   String input = sc.nextLine();
		   boolean flag =false;    // 일치하는 도서가 있는지 여부
		   int index = -1;
		   
		   for (int j = 0; j < bookList.length; j++) {
			// bookList[i][0] : i번쨰 책의 ISBN
		  	if(input.equals(bookList[i][0])) {
		  		index = i;
		  		flag = true; // 도서 찾기 성공
		  		break;
		  	}
		 }
		   if(flag) {
			   System.out.println(" 장바구니에 추가하시겟습니까? (y/n)");
			   input = sc.nextLine(); // y 또는 n을 입력
			   
			   if(input.toUpperCase().equals("Y"))  {
				   // 장바구니에 추가
				   //bookList[index] : [ISBN0001][이것이 자바다]...[...]
				   cartList[cartCount] = new Cart(bookList [index] ) ;
				   // 이미 장바구니에 담긴  책인가?
				   if ( ! isBookInCart(bookId)) {
					   cartList[cartClear] = new Cart( bookList[index] );
					   
					   
				   // 메시지 출력
				   String bookFormat = "\"{0}\"({1})-[{2}]";
				   String title = bookList[index][1];
				   int count = cartList[cartClear].getCount();
				   int totalPrice = cartList[cartClear].getTotalPrice();
				   
				   String bookMsg = messgeFormat.format(bookFormat, title, count, totalPrice);
			   System.out.println(bookList[index][1] + (" 책이 장바구니에 추가되었습니다");
			   System.out.println(bookmsg);
			   
			   cartClear++;  // 장바구니 개수 +1
			   }
			   
			   end = true; // 장바구니 항목 추가 완료
		   }
		   else {
			   System.out.println("존재하지 않는 ISBN 번호입니다.");
			   System.out.println("다시 입력해주세요.");
		   }
	   } // while 끝
   }
   /**
    * 장바구니 수량 조절
 * @param bookId 
    */
   public static void  cartSetCou(String bookId) {
	   System.out.println("********  장바구니 수량 조절************");
	   Scanner sc = new Scanner(System.in);
	   System.out.print("수량을 조정할 장바구니 번호 : ")
	   int no = sc.nextInt();
	   
	   if(no <= cartCount) {
		   System.out.print("장바구니 항목의 변경할 수량 :")
		   int count = sc.nextInt();
		   cartList[no-1].setCount(count);
		   System.out.println("수량을 변경했습니다");
		   System.out.println(cartList)[i].getBookInfo() [1] + "("+ count + ")");
	   }
	   else {
		   System.out.println("장바구니 번호가 존재하지 않습니다");
	   }
	   }
   
   /**
    * 장바구니 항목삭제
    */
   public static void  cartRemove() {
	   System.out.println("********  장바구니 항목 삭제************");
	   System.out.print("삭제할 장바구니 항목의 ISBN :");
	   Cart[] newCartlist = new Cart[BOOK_COUNT];
	   Scanner sc = new Scanner(System.in);
	   String bookId = sc.nextLine();
	   
	   Cart[] newCartList = new Cart [BOOK_COUNT];
	   int index = 0;
	   
	   for (int i = 0; i < cartCount; i++) {
			if(bookId.equals(cartList[i].getBookID() ));
			newCaytList[index] = cartList[i];
			index++;
	   } else {
			System.out.println(bookId + " 를 장바구니에서 삭제되었습니다");
		   }
   }
   cartCount = index;
   cartList =newCartlist;
   /**
    * 프로그램 종료
    */
   public static void  exit() {
	   System.out.println("********  프로그램 종료 ************");
   }
   
   /**
    * 도서 목록
    * @param book
    */
   public static void  bookList(String[] [] book) {
	   // ISBN, 제목, 가격, 저자, 간간소개, 카테고리, 발행일자
	   book[0] [0] = "ISBN0001";
	   book[0] [1] = "이것이 자바냐";
	   book[0] [2] = "35000";
	   book[0] [3] = "신용권";
	   book[0] [4] = "자바 프로그래밍에 모든 것";
	   book[0] [5] = "IT 전문서적";
	   book[0] [6] = "2018/01/01";
	   
	   book[1] [0] = "ISBN0002";
	   book[1] [1] = "모든 꽃이 봄에 피지는 않는다";
	   book[1] [2] = "16000";
	   book[1] [3] = "이다지";
	   book[1] [4] = "세상의 모든 슬로 스터디를 위한 응원";
	   book[1] [5] = "자기계발";
	   book[1] [6] = "2023/01/30";
	   
	   book[2] [0] = "ISBN0003";
	   book[2] [1] = "나는 주니어 개발자다";
	   book[2] [2] = "18000";
	   book[2] [3] = "지찬규";
	   book[2] [4] = "취준생에서 주니어 개발자까지";
	   book[2] [5] = "사람과 프로그래머";
	   book[2] [6] = "2021/09/10";
	   
	   for (int i = 0; i < book.length; i++) {
		   for (int j = 0; j < book.length; j++) {
			   System.out.println(book[i][j] + " |");
			
		}
		System.out.println();
	}
   }
   
   
/**
    *  메인 메뉴 입력
    */
   public static void showMenu() {
	   String Welcome = "휴먼서점에 오신걸 환영합니다!";
	   System.out.println("********************");
		System.out.println("\t" + Welcome);
		System.out.println("********************");
		System.out.println("1. 고객 정보 확인");
		System.out.println("2. 장바구니 목록 보기");
		System.out.println("3. 장바구니 비우기");
		System.out.println("4. 장바구니 항목 추가");
		System.out.println("5. 장바구니 수량 조절");
		System.out.println("6. 장바구니 항목 삭제");
		System.out.println("7. 영수증 표시");
		System.out.println("0. 프로그램 종료");
		System.out.println("********************");
		System.out.println(">> 메뉴번호 입력");
		
	}


 /**
  * 장바구니에 책이 들어있는지 확인
  * - 이미 담겨져 있으면, 수량을 1개 증가시키고 true 를 반환
  * - 장바구니에 없으면 false 를 반환
  * @param bookId
 * @param cartList 
  * @return
  */
       public static boolean isBookInCart(String bookId, Object cartList) {
    	   boolean flag = false;
    	   
    	   		for (int i = 0; i < cartList.length; i++) {
    		   if(bookId.equals(cartList[i].getBookID() ) ) {
    			   // 현재 담기 책의 개수
    			   int nowCount = cartList[i].getCount();
    			   // 장바구니에서 해당 책의 수량을 +1 증가
    			   cartList[i].setCount(nowCount + 1);
    			   flag = true;   // 장바구니에 있음
    		   }
    		   
    	   }
    	   		// 이미 장바구니에 책이 있는지 여부
			return flag;
		}
}

 /**
  * 장바구니ㅇ 항목의 index 를 반환하는 메소드
 * @param cartCount 
 * @param cartList 
  * @patam bookId
  * @return
  */
    public static int getCartIndex(String bookId, int cartCount, Object[] cartList) {
    	for (int i = 0; i < cartCount; i++) {
    		if(bookId.equals(( ( cartList[i]).getBookID()) {
    			return -1;
    		}
			
		}
    	// bookId(ISBN)이 없으면 -1 반환
    	return -1;
    }
    
    public static void printBill(Person person) {
    	Date date = new Date();
    	SimpleDateFormat sdfDateFormat = new SimpleDateFormat("yyyy/MM/dd");
    	String day = sdf.format(date);
    	System.out.println();
    	System.out.println("--------------- 주문한 고객 정보 ----------------");
    	System.out.println(" 고객명 :" + person.getName());
    	System.out.println("연락처 : " +  person.getTel());
    	System.out.println("주소 : " +  person.getAddress());
    	System.out.println("주문일자 : " + day);
    	System.out.println("------------------------ 주문 정보 ----------------------");
    	cartList();
    	
    	int sum = 0;
    			for (int i = 0; i < cartClear; i++) {
    				sum += cartList[i].getTotalPrice();
					
				}
    	System.out.println("\t\t 총 주문 금액 : \\u00A4" + sum + "원");
    	System.out.println("-----------------------------------");
    	System.out.println();
    }
    }
