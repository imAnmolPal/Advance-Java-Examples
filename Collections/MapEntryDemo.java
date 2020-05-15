import java.util.*;

public class MapEntryDemo{
	public static void main(String[] args){
		
		HashMap m1=new HashMap();
		
		m1.put("1","Aashu");
		m1.put("2","Anmol");
		m1.put("3","Animesh");
		
		//Get a set of entries
		Set set=m1.entrySet();

		//get an iterator
		Iterator i=set.iterator();

		//Display elements
		while(i.hasNext()){
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());	
		}
		//Change Roll No. 2's Name
		String name=((String)m1.get("1")).toString();
		m1.put("3",new String(name+"Pal"));
		System.out.println("Roll No 2's new name: "+m1.get("3"));
		
		
				
	}
}