
public class Person implements Cloneable {

	private String name;
	private int age;
	
	public Person() {
		this("Anonymous", -1);	// Calling another constructor on the same object
	}
	
	public Person(String pname, int page) {
		name = pname;
		age = page;
	}
	
	public void print() {
		System.out.println("Name: "  + name + "\tAge: " + age);
	}
	
	@Override
	public String toString() {
		return "Name: "  + name + "\tAge: " + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person) obj;
			if(this.age == p.age && this.name.equals(p.name))
				return true;
		}
		return false;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p = new Person();
		
		Person clone = (Person) p.clone();
		
		System.out.println(clone);
	}
}
