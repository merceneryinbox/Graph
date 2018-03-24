package children;

import parents.ParentOne;

public class ChildTwo implements ParentOne {
	
	@Override
	public void printHello ( ) {
	
	}
	
	@Override
	public void printBye ( ) {
		System.out.println ("Good bye from child two");
	}
	
	@Override
	public int compareTo (Object o) {
		return 0;
	}
}
