package stack.structure;

public interface MyStringStack{
	//
	String push(String element); 	
	String pop(); 					// EmptyStackException
	String peek(); 					// EmptyStackException 
	boolean empty(); 
	int size(); 
	int search(String element); 	// -1 if empty
}
