//ArrayStack serves the purpose of storing values in a way similar to a stack.
//ArrayStack can push, peek, and pop values

import java.util.EmptyStackException;

public class ArrayStack  implements DStack{
	private double[] soundStack;
	private int size;
	
	//constructs an ArrayStack object
	public ArrayStack() {
		soundStack = new double[10];
		size = 0;
	}
	
	//isEmpty checks to see if the array's size is empty, returns true if it is
    public boolean isEmpty() {
    	return size == 0;//
    }
    
    //Throws an emptyStackException if "stack" is empty
    //push places the double value given as a parameter at the end of the "stack".
    public void push(double d) {
        if (size >= soundStack.length) {//=?
        	resize(new double[soundStack.length * 2]);
        }
        soundStack[size] = d;
        size++; 
    }
        
    //Throws an emptyStackException if "stack" is empty
    //removes and returns last value placed on "stack"
    public double pop() {
    	check();
    	double tempPop = soundStack[size - 1];//zero based indexing
    	size--;
    	return tempPop;
    }

    //Throws an emptyStackException if "stack" is empty
    //returns last value placed on "stack" without removing it
    public double peek() {
    	check();
    	return soundStack[size];//zero based indexing
    }
    
    //throws an empyStackException if the "stack" is empty
    public void check() {
    	if (isEmpty()) {
    		throw new EmptyStackException();
    	}
    }
    //takes a and array twiceSize as an array and appends values into a new array size
	private void resize(double[] twiceSize) {
		for (int i = 0; i < soundStack.length; i++) {//??
			twiceSize[i] = soundStack[i];
		}
		soundStack = twiceSize;
	}
}
