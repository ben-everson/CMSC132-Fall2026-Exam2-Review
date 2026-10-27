package polymorphicList;


public class NonEmptyList<T> implements List<T> {
    // note there's no head reference in a list represented by a NonEmptyList
    private T data;
    private List<T> next;
    
    //this is a basic constructor which creates a node with the given generic
    //value as well as a reference to the next node in the list 
    public NonEmptyList(T value, List next) {
        data= value;
        this.next= next;
    }
    //overloaded constructor, set next to null by default
    public NonEmptyList(T value) {
    		this(value, null);
    }
    
	@Override
	public T findElt(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<T> findNode(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] getArr() {
		// TODO Auto-generated method stub
		return null;
	}


}
