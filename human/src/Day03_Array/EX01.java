package Day03_Array;

public class EX01 {
	
	public  static void main(String[] args) {
		// 배열 선언
	    int arr [];
	    // 배열 생성
	    arr  = new  int [5];
	    
	    // 배열 요소에 접근 : index(0부터 시작하는 순서번호)로 접근하다.
	    arr[0] = 1;
	    arr[0] = 2;
	    arr[0] = 3;
	    arr[0] = 4;
	    arr[0] = 5;
	    
	    // 배열의 길이: 배열요소의 개수: 배열. length
	    int N = arr.length;
	    System.out.println("배열의 길이 :" + arr.length);
	    
	    // for : ctr1 + space 2번쨰 옵션
	    for (int i = 0; i <arr.length; i++) {
	    	System.out.println(arr[i] + " ");
	    }
	    		
	    System.out.println();
	    
	   
	    

	    
	    
	}

}
