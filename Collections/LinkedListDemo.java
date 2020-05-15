import java.util.*;

public class LinkedListDemo{
	public static void main(String[] args){
		
		//create a linkedlist
		
		LinkedList l1=new LinkedList();

		//add elements to the linked list
		l1.add("103");
		l1.add("105");
		l1.add("102");
		l1.add("101");
		l1.add("104");

		l1.addLast("999");
		
		l1.addFirst("000");
		
		System.out.println("Original contents of l1: "+l1);
		
		//Remove elements from the linkedlist

		l1.remove("101");
		l1.remove(2);

		System.out.println("Contents of li after deletion: "+l1);

		//Remove first and last elements
		l1.removeFirst();
		l1.removeLast();			
	
		System.out.println("l1 after deleting first and last: "+l1);
			
		//Get and set a value
		Object val=l1.get(2);
		l1.set(2, (String)val + " Changed");
		System.out.println("l1 after change "+l1);			
	}
}