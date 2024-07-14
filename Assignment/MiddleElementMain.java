package Assignment;

public class MiddleElementMain {
	public static void main (String[] args) {
	Stack stk= new Stack();
	int size=5;
	stk.create_stack(size);
	stk.push(1);
	stk.push(2);
	stk.push(3);
	stk.push(4);
	stk.push(5);
	
	
	stk.print_stack();
	System.out.println();
	removemideleement (stk,size);
	stk.print_stack();
	
	
	}

	private static void removemideleement(Stack stk, int size) {
		
		if(stk.getstack()==size/2+1) {
			stk.pop();
			return;
		}
		int temp=stk.pop();
		removemideleement(stk,size);
		stk.push(temp);
		return;
	}

}
