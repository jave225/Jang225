package day02;

public class EX21_Star2 {
	
	public static void main(String[] atgs)  {
		// 입력 : 5
		// *****
		// ****
		// ***
		// **
		// *
		
		// i : 1, j : 1 2 3 4 5
		// i : 1, j : 1 2 3 4
		// i : 1, j : 1 2 3 
		// i : 1, j : 1 2 
		// i : 1, j : 1 
		
		//  1 2 3 4 5 : i
		//  5 4 3 2 1 : 6 - i
		Scanne
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}


       