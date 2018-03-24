package children;

import parents.ParentOne;
import parents.ParentTwo;

public class ChildOne implements ParentOne, ParentTwo {
	@Override
	public void printHello( ) {
		System.out.println("Hello from Child One");
	}
	
	@Override
	public void printBye( ) {
		System.out.println("Good Bye from Child One");
	}
	
	@Override
	public int compareTo(Object o) {
		return 0;
	}
}
