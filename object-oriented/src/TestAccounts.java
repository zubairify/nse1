import com.nse.bank.AccountFactory;
import com.nse.bank.BalanceException;
import com.nse.bank.Bank;

public class TestAccounts {

	public static void main(String[] args) {
		
		Bank s = AccountFactory.createAccount("Jack","savings");
		
		try {
			s.withdraw(4000);
		} catch (BalanceException e) {
//			e.printStackTrace();	// Handy for developers for troubleshooting
//			System.out.println(e);	// toString() method, handy for logging for audit purpose
			System.out.println(e.getMessage());	// For end users
		}
		
	}
}
