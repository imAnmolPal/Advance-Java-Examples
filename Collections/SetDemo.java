import java.util.*;

public class SetDemo{
	public static void main(String[] args){
		int count[]= {34,22,10,60,30,22};
		
		Set<Integer> set= new HashSet<Integer>();
		try{
			for(int i=0;i<5;i++){
				set.add(count[i]);
			}
			System.out.println(set);
			
			TreeSet sortedset=new TreeSet<Integer>(set);

			System.out.println(sortedset);
			
			System.out.println("First element: "+(Integer)sortedset.first());

			System.out.println("Last element: "+(Integer)sortedset.last());
		}catch(Exception e){}
		
	}
}