package Day05.Ex02_EnrcleArray;
/**
 * 통장계좌
 * - 예금액
 * - 은행명
 * - 계좌번호
 * - 예금주
 * 
 *
 */
public class Encapsulation {
	
	private int deposit;
	private String bank;
	private String depoNumber;
	private String depositor;
	
		
					
	public int getDeposit() {
		return deposit;
	}
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getDepoNumber() {
		return depoNumber;
	}
	public void setDepoNumber(String depoNumber) {
		this.depoNumber = depoNumber;
	}
	public String getDepositor() {
		return depositor;
	}
	public void setDepositor(String depositor) {
		this.depositor = depositor;
	}
	@Override
	public String toString() {
		return "Encapsulation [deposit=" + deposit + ", bank=" + bank + ", depoNumber=" + depoNumber + ", depositor="
				+ depositor + "]";
	}
	// 기본 생성자
	public Encapsulation() {
	}
	
	
	// 모든 필드를 매개변수로 갖는 생성자
	public Encapsulation(int deposit, String bank, String depoNumber, String depositor) {
		this.deposit = deposit;
		this.bank = bank;
		this.depoNumber = depoNumber;
		this.depositor = depositor;
	}
	// getter & setter
	
	// toString()
	
	
	

}
