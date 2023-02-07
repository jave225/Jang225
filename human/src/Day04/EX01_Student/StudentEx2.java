package Day04.EX01_Student;

public class StudentEx2 {
	
	public static void main(String[] atgs)  {
		// Student 객체 생성
	Student student = new Student();
	student.name = "김휴먼";
	student.age = 20;
	student.stdNo = "20230001";
	student.major = "컴퓨터공학과";
	
	// Student2 객체 생성
	Student student2 = new student("강재영", 20, "20230002", "경제학과");
	
	int[] scores = {10, 20, 30, 40, 50};
	int[] scores2 = {100, 200, 300, 400, 500};
	
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	System.out.println("##### 학생1 ##### ");
	}

}
