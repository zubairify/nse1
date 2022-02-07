import com.nse.lib.Book;
import com.nse.lib.Member;

public class TestLibrary {

	public static void main(String[] args) {
		Book b1 = new Book("The Alchemist");
		Book b2 = new Book("Jungle Book");
		
		Member m1 = new Member("George");
		Member m2 = new Member("Brian");
		
		b1.status();
		
		m1.status();
		
		b1.issueBook(m1);
		
		b1.status();
		
		m1.status();
		
		b1.issueBook(m2);
		
		b2.issueBook(m1);
		
	}
}
