package polymorphicList;

/*For this class you must implement a basic stack which stores
 * elements of type T. To do this you must use the polymorphic
 * linked list code provided to you. 
 * 
 */
public class Stack<T>{
	
	
	//implement the no-arg constructor to initialize whatever fields
	//your class needs
	public Stack() {
		
	}
	
	/*creates a shallow copy of the current stack, each List node should be 
	 * independent from the List nodes in the parameter stack. Since data is a
	 * generic type, the data of each node will have to be a reference copy of the 
	 * data in the parameter stack. 
	 */
	public Stack(Stack<T> toCopy){
		throw new UnsupportedOperationException("You must write this method.");

	}
	
	//adds the specified element to the top of the stack
	public void push(T elt) {
		throw new UnsupportedOperationException("You must write this method.");
	}
	
	//removes and returns the element on top of the stack
	public T pop() {
		throw new UnsupportedOperationException("You must write this method.");
	}
	
	//returns the element on top of the stack without removing it
	public T peek() {
		throw new UnsupportedOperationException("You must write this method.");
	}
	
	public boolean isEmpty() {
		throw new UnsupportedOperationException("You must write this method.");
	}

    

}
