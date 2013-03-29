import java.util.NoSuchElementException;
 
/** Singly-Linked List Stack Implementation */
public class Stack {
 
     /** Reference to the top element */
    private Node top;
	
    /** Singly-linked list data structure for holding a stack element */
    private  class Node {
        public Object data;
        public Node next;
		
        public Node( Object data, Node next ) {
            this.data = data;
            this.next = next;
        }
    }
 
 
    /** Pushes new element to the top of the stack. */
    public void push( Object data ) {
        if( isEmpty( ) ) {
            top = new Node( data, null );
        } else {
            top = new Node( data, top );
        }
    }
	
	
	    /** Returns and removes the top element from the stack. */
    public Object pop( ) throws NoSuchElementException {
        if( isEmpty( ) ) {
            throw new NoSuchElementException( );
        } else {
            // Get top element
            Object data = top.data;
            // Nullify reference to top element
            top = top.next;
            // Return top element
            return data;
        }
    }
 
    /** Returns the element from the top of the stack without removing it. */
    public Object peek( ) throws NoSuchElementException {
        if( isEmpty( ) ) {
            throw new NoSuchElementException( );
        } else {
            return top.data;
        }
    }
 
    /** Checks if the stack is empty. */
    public boolean isEmpty( ) {
        return top == null;
    }
 
    /** Test Method */
    public static void main( String[ ] args ) {
 
        Stack stack = new Stack( );
        for( int i = 0; i < 10; i++ ) {
            stack.push( i );
        }
 
        // Peek at the top element
        System.out.println( stack.peek( ) );  // return top elemnt
  
        // Pop all elements off the list
        while( ! stack.isEmpty( ) ) {
            System.out.print( stack.pop( ) + " " );
        }
 
                    
    }
}