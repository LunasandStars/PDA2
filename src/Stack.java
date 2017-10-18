//CS 5040 � Assignment #4 � Linda Vu

public class Stack {
	private Node top;
	//head, tail;
	private int size; 
	//private int topofStack;
	
	public Stack(){ //Constructor
		top = null;
		size = 0; 
	}
	
	//This function isEmpty checks when the stack if empty 
	public boolean isEmpty(){ 
		//returns true when top is null, false otherwise.
		return top == null; 
	}
	
	//This function size gets the size of the Stack
	public int size(){
		//returns size of the stack/linkedlist
		return size; 
	}
	
	//This function push adds strings into the Stack
	public void push(String input){
		//Creates and puts data into the node
		Node first = new Node(input);
		if(isEmpty()){ //If the Stack is empty
			top = first; //Set head as the top
		}else{
			first.next = top; //The memory address of 'head' is now top
			top = first; //top is set as 'head'
		}
		size++;
	}
	
	//The function pop removes the last item on the stack
	public String pop(){
		Node last = null; 
		if(isEmpty()){		//if empty do nothing
			//do nothing
		}else{
			last = top;		//
			top = last.next;
			size--;	
		}
		return last.data;
	}
	
	//The function top lets you see the top String of the list
	public String top(){ 
		if(isEmpty()){
			//do nothing
		}
		return top.data;
	}
	
	//This function displays the stack
	public void PrintList() 
	{
	    Node temp;
	    temp = top;
	    while (temp != null)
	    {
	       System.out.print(temp.data + "");
	       temp = temp.next;
	    }
	}
	
	   //class to create nodes as objects
	private class Node
	{
		private String data;  //data field
	    private Node next; //link field
	       
	    public Node(String input) //constructor method
	    {
	       data = input;
	       next = null;
	    }
	}

}
