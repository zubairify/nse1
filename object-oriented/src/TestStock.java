import com.nse.stock.Broker;
import com.nse.stock.Exchange;
import com.nse.stock.Holder;
import com.nse.stock.StockSingleton;

public class TestStock {

	public static void main(String[] args) {
		
		Holder h = StockSingleton.getStock();
		h.view();
		
		Broker b = StockSingleton.getStock();
		b.get();
		b.view();
		
		Exchange x = StockSingleton.getStock();
		x.set();
		
		System.out.println(h == b);
		System.out.println(b == x);
	}
}
