import java.util.*;

public class LinkedMapDemo{
	public static void main(String agrs[]){
		//Create a Hash Map
		LinkedHashMap lhm=new LinkedHashMap();

		//Put elementss to the map
		lhm.put("Aashu",new Double(3434.34));
		lhm.put("Anmol",new Double(123.123));
		lhm.put("Ayan",new Double(1345.76));
		lhm.put("Animesh",new Double(-12.08));

		//Get a set of entries
		Set set=lhm.entrySet();
		
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