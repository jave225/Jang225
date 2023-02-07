package Day05.Ex06_UpDownCasting;

class ItPerson{}
class planner extends ItPerson{}
class Designer  extends ItPerson{}
class Developer extends ItPerson{}

public class Instanceof {
	
	public static void checkInstance(ItPerson itPerson) {
		
		if(itPerson instanceof planner)
			System.out.println("기획자입니다!");
		if(itPerson instanceof Designer)
			System.out.println("디자이너입니다!");
		if(itPerson instanceof Developer)
			System.out.println("개발자입니다!");
			
	}

	public static void main(String[] args) {
		System.out.println("어떤 직무를 하고 계신가요?");
		checkInstance(new planner());
		checkInstance(new Designer());
		checkInstance(new Developer());
	}
}
