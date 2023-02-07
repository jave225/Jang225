package ms06;

public class Lotto3 {
	
	public static void main(String[] args) {
		
		int arr [] = new int [6];
		
		// 랜덤 1~45
		for (int i = 0; i < arr.length; i++) {
			int rendom = (int)(Math.random() * 45 ) + 1;
			arr[i] = rendom;
			
			// 중복제거
			for (int j = 0; j < arr.length; j++) {
				// 중복된 값이 있으면, arr[i] 에 다시 랜덤 구해서 대입
				if(i == j ) continue;
				if(arr[j] == rendom ) {
					i --;
					break;
				}
			}
			// 오름차순 정렬
			for (int I = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if(arr[i] > arr[j]) {
						// 교환
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
				
			}
		}
		for(int i : arr) {
			System.out.println(i + " ");
		}
		
	}

}
