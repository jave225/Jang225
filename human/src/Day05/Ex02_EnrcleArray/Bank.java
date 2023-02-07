package Day05.Ex02_EnrcleArray;

public class Bank {
	
	public static void main(String[] args) {
		Encapsulation ec 
		= new Encapsulation(0, "국민은행", "282401-04- 109955", "한성호");
		
		ec.setDeposit(10000000);
		
		int money = ec.getDeposit();
		System.out.println(ec);
		System.out.println();
		
	}

}
