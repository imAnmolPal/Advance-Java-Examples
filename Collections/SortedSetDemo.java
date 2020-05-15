import java.util.*;

public class SortedSetDemo{
	public static void main(String[] args){
		// Create the sorted set
		SortedSet set=new TreeSet();
		
		//Add elements to the set
		set.add("c");
		set.add("b");
		set.add("a");
		
		//Iterating over the elemtns in the set
		
		Iterator it=set.iterator();

		while(it.hasNext()){
			//get elements
			Object obj=it.next();
			System.out.println(obj);
		}
				
	}
}