package linkedList;

//In addition to these linkedList problems I HIGHLY encourage you to complete
//problems 2-4 from HW 4. These problems are closer to what you may see on an exam
// and are a higher priority than these problems

public class MyLinkedList {

    private static class Node {

        // I'm private!  But my outer class can see things inside me,
        // even though they're private too!

        private double data;
        private Node next;

        private Node(double data) {
            this.data= data;
            next= null;
        }

    }
    private Node head;  // will refer to the first node
    private int size; //will track the number of nodes in the list
    
    public MyLinkedList() {
        head= null;
    }
    
    /*
     * this method should return the data of the node at index i. Nodes are 
     * 0-indexed. If the index is outside the bounds of the list- which will always 
     * be the case if the list is empty- then an illegal argument exception should
     * be thrown
     */
    public int get(int index) {
		throw new UnsupportedOperationException("You must write this method.");
    }
    
    /*
     * this method should return the number of nodes in the current object list
     */
    public int size() {
		throw new UnsupportedOperationException("You must write this method.");
    }
    
    /*
     * this method should create a copy of the current object list, but with all 
     * of its elements in reversed order from the current object list. If the 
     * current list is empty, the method should of course return an empty list. 
     * For example, if this method was called on a list containing elements
     *  5,2,1,7,9 in that order, then this method would return a new list
     *  containing 9,7,1,2,5 in that order. The returned list should be entirely 
     *  separate from the original list, and your method should not modify the 
     *  original list in any way. This method should be efficient, this means you 
     *  should not iterate through the list more than once.
     */
    public MyLinkedList reversedCopy() {
		throw new UnsupportedOperationException("You must write this method.");
    }
    
    /*
     * this method should reverse the order of the current linked list. You should
     * not create any new nodes or a new list. If the current list is empty, then
     * nothing should be done. Note that this method should also be efficient! 
     * You should not iterate through the list more than once. For example, if this
     * method was called on a list containing the elements 5,2,1,7,9 in that order 
     * then after this method executes, the list should contain 9,7,1,2,5
     */
    public void reverseInPlace() {
		throw new UnsupportedOperationException("You must write this method.");
    }
    
    /*
     * this method should return a reference to the node before the node with 
     * the minimum data value. For the purpose of this method, assume the list it
     * is being called on contains a dummy head node with the data value of NaN. If
     * this is not the case, and the head is null, the method should simply return 
     * without doing any unnecessary work. 
     * The list should not be modified in any way.
     * Note that this method should be efficient! You should not iterate through 
     * the list more than once. For example, if the method was called on the list
     * 0,3,5,7,2 then a reference to the node containing 7 should be returned. 
     */
    public Node beforeMin() {
		throw new UnsupportedOperationException("You must write this method.");
    }
    

    // adds an element to the beginning of the list
    public void add(int data) {
        Node n= new Node(data);
        n.next= head;
        head= n;
    }

    //appends an element to the end of the list
    public void append(double data) {
    		head = append(data, head);
    }
    
    //private helper method to keep track of the current node through
    //recursive calls
    private Node append(double data, Node curr) {
    	
	    	//if we are at the end of the list, make a new node
	    	if (curr == null) { 
	    		curr =  new Node(data);
	    		
	    	//if not at the end of the list, 
	    	} else {
	    		curr.next = append(data, curr.next);
	    	}
	    	return curr;
    }
    
    
    // prints all the elements in the current object list, ending with
    // a newline
    public void printList() {
        Node current= head;

        // note this prints an extra blank space after the last element- we
        // don't care about that here, but how could it be avoided if
        // desired (without calling any String class methods)?
        while (current != null) {
            System.out.print(current.data + " ");
            current= current.next;
        }

        System.out.println();
    }
    
    

}
