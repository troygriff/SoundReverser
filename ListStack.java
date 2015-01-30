//ListStack serves the purpose of storing values in a way similar to a stack.
//ListStack can push, peek, and pop values

import java.util.EmptyStackException;

public class ListStack implements DStack{
	private ListStackNode result;

	//constructs a new ListNode
	public ListStack() {
		result = null;
	}
	
	//isEmpty checks to see if the array's size is empty, returns true if it is
    public boolean isEmpty() {
    	return (result == null);
    }
    
    //throws an empyStackException if the "stack" is empty
    private void check() {
    	if (isEmpty()) {
    		throw new EmptyStackException();
    	}
    }
    
    //push places the double value given as a parameter at the end of the "stack".
	public void push(double d) {
		result = new ListStackNode(d, result);
	}
	
	 //Throws an emptyStackException if "stack" is empty
     //removes and returns last value placed on "stack"
	 public double pop() {//starts off one too far
	    check();
	    double tempData = result.data;
		result = result.next;
		return tempData;
	}
	 
	//Throws an emptyStackException if "stack" is empty
	//returns last value placed on "stack" without removing it
    public double peek() {
    	check();
    	return result.next.data;
	}
}