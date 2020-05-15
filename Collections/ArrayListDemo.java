import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args){
		
		//create a ArrayList
		
		ArrayList a1=new ArrayList();
		System.out.println("Initial Size of a1: "+a1.size());

		//add elements to the array list
		a1.add("P");
		a1.add("R");
		a1.add("N");
		a1.add("K");
		a1.add("F");
		
		a1.add(1,"G");
		System.out.println("Size of a1 after  addition: "+a1.size());
		
		//Display the arraylist
		
		System.out.println("Content of a1: "+a1);
		
		//Remove elements from the linkedlist

		a1.remove("F");
		a1.remove(2);

		System.out.println("Contents of ai after deletion: "+a1);
	
		System.out.println("Size of a1 after deletion: "+a1.size());
		
		System.out.println("Contents of a1"+a1);			
	}
}