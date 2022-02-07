
class EventImpl implements Event {

	@Override
	public void perform() {
		System.out.println("Class level implementation");
	}
}

public class EventDemo {
	
	class InnerEventImpl implements Event {
		@Override
		public void perform() {
			System.out.println("Inner class implementation");
		}
	}
	
	static class StaticInnerEventImpl implements Event {
		@Override
		public void perform() {
			System.out.println("Static Inner class implementation");
		}
	}
	
	public void nestedEvent() {
		class NestedEventImpl implements Event {
			@Override
			public void perform() {
				System.out.println("Nested class implementation");
			}
		};
		new NestedEventImpl().perform();
	}
	
	public void oneMoreEvent() {
		Event e = new Event () {
			@Override
			public void perform() {
				System.out.println("Anonymous class implementation");
			}
		};
		e.perform();
	}
	
	public void oneLastEvent() {
		Event e = () -> System.out.println("Lambda Expression implementation");
		e.perform();
	}

	public static void main(String[] args) {
		EventImpl ei = new EventImpl();
		ei.perform();
	
		EventDemo ed = new EventDemo();
		InnerEventImpl ie = ed.new InnerEventImpl();
		ie.perform();
		
		EventDemo.StaticInnerEventImpl si = new EventDemo.StaticInnerEventImpl();
		si.perform();
		
		ed.nestedEvent();
		ed.oneMoreEvent();
		ed.oneLastEvent();
		
	}
}
