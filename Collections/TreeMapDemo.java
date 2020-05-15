import java.util.*;

public class TreeMapDemo{
	public static void main(String agrs[]){
		//Create a Hash Map
		TreeMap tm=new TreeMap();

		//Put elementss to the map
		tm.put("Aashu",new Double(3434.34));
		tm.put("Anmol",new Double(123.123));
		tm.put("Ayan",new Double(1345.76));
		tm.put("Animesh",new Double(-12.08));

		//Get a set of entries
		Set set=tm.entrySet();
		
		//Get an iterator
		Iterator i=set.iterator();

		//Display elements
		while(i.hasNext()){
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+" :");
			System.out.println(me.getValue());
		}
		
		System.out.println();
	}
}