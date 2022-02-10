import com.nse.ex.CurrencyConverter;
import com.nse.ex.Dirham;
import com.nse.ex.Dollar;
import com.nse.ex.Rupee;

public class TestCurrency {

	public static void main(String[] args) {
		Dollar usd = new Dollar();
		Rupee inr = new Rupee();
		CurrencyConverter cc = new CurrencyConverter();
		
		System.out.println(cc.convert(usd, inr, 100));
		System.out.println(cc.convert(inr, usd, 5000));
		
		Dirham aed = new Dirham();
		
		System.out.println(cc.convert(aed, inr, 100));
		System.out.println(cc.convert(usd, aed, 100));
	}
}
