import com.nse.emp.Employee;
import com.nse.emp.Executive;
import com.nse.emp.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		
		Executive ex1 = new Executive("Jack", 5000, 3000);
		
		Manager mgr = new Manager("Neil", 6000, 4000);
		
		showSalary(ex1);
		showSalary(mgr);
	}

	private static void showSalary(Employee emp) {
		if(emp instanceof Manager)
			System.out.println("Manager Salary: " + emp.getSalary());
		else
			System.out.println("Executive Salary: " + emp.getSalary());
	}
	
//	private static void showSalary(Manager mgr) {
//		System.out.println("Manager Salary: " + mgr.getSalary());
//	}
//
//	private static void showSalary(Executive ex1) {
//		System.out.println("Executive Salary: " + ex1.getSalary());
//	}
}
