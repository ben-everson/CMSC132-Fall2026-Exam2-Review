package polymorphicList;


public interface List<T> {

	/*
	 * add whatever methods you need to implement your stack here
	 * then implement them in both the emptyList and NonEmptyList classes
	 */
	
	
	/*This method should find and return the data stored at index i of the list. 
	 * assume indices start at 0. If i is outside the bounds of the list then null
	 * should just be returned. For example, if this method was called with i=2
	 * on the list 2,5,4,3,1,E (where E represents the empty list at the end) 
	 * then 4 should be returned
	 * 
	 */
	public T findElt(int i);
	
	/*
	 * This method is very similar, in fact identical, to the previous one. Except
	 * you should return a reference to the ith node or the empty list if i is 
	 * outside the bounds of the list. 
	 */
	public List<T> findNode(int i);
	
	/* This method should turn its current list into an array of objects and return
	 * the array. Note that it returns an array of Objects, due to the way generic
	 * types work in java, you are unable to create an array of T objects. 
	 * However if the caller of this method desires, they can cast the result of
	 * this method to T[]. You cannot (and dont need to) create any new T objects 
	 * for this method. This method uses the same principles as other polymorphic
	 * linked lists but is more difficult. Hint: this method will be
	 * inefficient, specifically O(n^2) 
	 * Unlike most methods on this list you are allowed to use loops, but you may 
	 * not use any java library classes
	 */
	public Object[] getArr();
	
}
