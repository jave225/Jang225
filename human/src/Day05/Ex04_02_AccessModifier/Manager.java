package Day05.Ex04_02_AccessModifier;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		 student.defaultSetting();
		 System.out.println("name :" + student.name);
		 System.out.println(" height:" + student.getHeight());
		 System.out.println(" age:" + student.getage());
		 System.out.println(" weight:" + student.getweight());
		 
		 System.out.println();
		 
		 Person  person = new Person("김휴먼", 175, 20, 60);
		 System.out.println("name :" + person.name);
		 System.out.println("name :" +  person.getheight());
		 System.out.println("name :" +  person.getage());
		 System.out.println("name :" +  person.getweight());
		 
		 System.out.println();
		 
		
	}

}
