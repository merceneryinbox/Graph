import java.util.Stack;

public class Main {
	public static void main (String[] args) {
		Stack objectStack = new Stack<Integer> ();
		
		objectStack.push (2);
		objectStack.push (Integer.parseInt ("3"));
		objectStack.push ((int)4L);
		objectStack.push (92);
		
		for (Object o : objectStack) {
			System.out.println (o);
		}
	}
}
