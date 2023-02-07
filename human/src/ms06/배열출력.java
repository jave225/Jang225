package ms06;

import java.util.Iterator;
import java.util.Scanner;

public class 배열출력 {
	
	public static void main(String[] args) {
		System.out.print("몇 게임?");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < args.length; i++) {
			System.out.print("[" + (i+1) +" 게임] : ");
			int arr [] = new int[6];
			
		}
		
		int arr[] = new int [6];
		
		for (int i = 0; i < arr.length; i++) {
			int rendem = (int)(Math.random() * 45 ) + 1;
			arr[i] = rendem;
			System.out.print(arr[i] + "  ");
			}
		System.out.println();
		}
		
	}


