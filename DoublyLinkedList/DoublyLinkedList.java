package DoublyLinkedList;

public class DoublyLinkedList {
	
    private static class Node {
    	
        private int data;
        private Node next;
        private Node prev;

        private Node(int data) {
            this.data= data;
            next = null;
            prev = null;
        }

    }
    
    private Node head;  // will refer to the first node
    private Node tail; //will refer to the last node
    
    private int size; //will track the number of nodes in the list
    
    public DoublyLinkedList() {
        head = null;
        tail = null;
    }
	
    // adds an element to the beginning of the list
    public void add(int data) {
        Node n= new Node(data);
        n.next= head;
        n.prev = null;
        
        head.prev = n;
        
        head= n;
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
    public DoublyLinkedList reversedCopy() {
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
    
    /*This method should return a new DoublyLinkedList which is a deep copy of the 
     * current object list, however it should only return the last n elements of
     * the current object list. If n is greater than or equal to the length of the 
     * current object list, then the copy should be exactly the same as the current
     * list. If n is less than or equal to 0 then an empty list should be returned
     * For example, if this method was called on a list containing the elements
     * 1,2,3,4,5,6 with n=4 then the new list 3,4,5,6 should be returned. This 
     * method should be efficient, meaning you should not iterate through any
     * elements of the list more than once! Recall that you previously wrote the 
     * size method which may be useful here. 
     */
    public DoublyLinkedList lastNelts(int n) {
		throw new UnsupportedOperationException("You must write this method.");
    }
    
    /*This method should operate on the current object list, deleting every other
     * element from the list. If the list is empty, or if it contains only one 
     * element, then nothing at all should happen. If the list contains 2 or more
     * elements then every element with an odd index in the original list should
     * be deleted. For example, if this method is called on a list containing the 
     * elements 0,1,2,3,4,5,6,7 then after this method is called the list should
     * contain the elements 0,2,4,6 in that order
     */
    public void EveryOther() {
		throw new UnsupportedOperationException("You must write this method.");
    }
    
    /*This method should perform the same operation on the current object list as
     * the previous method, but in doing so this method should also construct a new
     * list containing all of the deleted elements and return that list. If the 
     * current list contains 0 or 1 elements then the returned list will be empty 
     * for reasons described above, however if there are 2 or more elements in the
     * current object list then every 2nd element should be added to the return
     * list and removed from the current list. The new list should contain the 
     * elements in the order in which they were deleted. This method should be
     * efficient! This means you should not iterate over the current list more than
     * once. While you can reuse your code from the last method, calling it
     * directly would certainly require you to iterate over the list more than once
     * You should also not create any new nodes in this method. 
     */
    public DoublyLinkedList EveryOtherAndCopy() {
		throw new UnsupportedOperationException("You must write this method.");
    }
}
