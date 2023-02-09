package Day07.EX08_UserException;

public class AccountEX {

	public static void main(String[] args) {
		Account account = new Account();
		// 10000 입금
		account.deposit(10000);
		
		// 20000입금
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
		e.printStackTrace();
		}
		
	}
}
