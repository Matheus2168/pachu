package Lab4;

import java.util.ArrayList;

public class Stack {
	private ArrayList<String> stack;
	
	public Stack() {
		this.stack = new ArrayList<String>();
	}
	
	public void put(String s) {
		stack.add(s);
	}
	public String get() {
		String s = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return s;
	}
	
	public String showLast() {
		if (showSize() == 0) return "";
		return stack.get(stack.size()-1);
	}
	
	public int showSize() {
		return stack.size();
	}
	
	
}
