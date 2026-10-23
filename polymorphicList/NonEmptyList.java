package polymorphicList;

// (c) Larry Herman, 2026.  You are allowed to use this code yourself, but
// not to provide it to anyone else.

/* For examples of how the methods work, see the driver in main() below, as
 * well as the JUnit tests in Tests.java.
 */

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


}
