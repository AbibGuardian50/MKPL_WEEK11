import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Count:" + counter.getCount());
                
                counter.increaseBy(6);
		
		System.out.println("Count:" + counter.getCount());
                
                counter.multipleBy(8);
		
		System.out.println("Count:" + counter.getCount());
                
                counter.decreaseBy(4);
		
		System.out.println("Count:" + counter.getCount());
		
	}

}
