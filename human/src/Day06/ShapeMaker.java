package Day06;

import java.util.List;
import java.util.Scanner;

public class ShapeMaker {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape shape = null;
		double width = 0.0;
		double height = 0.0;
		double raidus = 0.0;
		// 총합
		double roundSum =0.0;
		double areaSum = 0.0;
		
		// 리스트 : 동적 자료구조, 컬렉션
		// 여기서는 Shape 객체들을 담는 목록이다/
		List<Shape> list = new LinkedList<Shape>();
	
		while(true) {
			System.out.print("가로>>");
			width = sc.nextDouble();
			System.out.print("높이>>");
			height = sc.nextDouble();
			shape = new Triangle(width,height);
			list.add(shape);   // 도형 목록에 사각형을 추가
			break;
			
	        System.out.print("반지름>>");
	        radius = sc.nextDouble();
	        shape  = new Circle(radius);
	        list.add(shape);  // 도형 목록에 원형을 추가
	        break;
		}
		
	 // - whlie 끝
	
	for (Shape s : list) {
		if( s instanceof Triangle )
			System.out.print("[삼각형]");
		if( s instanceof Rectangle )
			System.out.print("[삼각형]");
		if( s instanceof Circle )
			System.out.print("[원형]");
		
		roundSum = roundSum + round;
		areaSum = areaSum + area;
		
		 System.out.println("넌ㅂ이>>");
	}
	

	}
