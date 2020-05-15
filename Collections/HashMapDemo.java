import java.util.*;

public class HashMapDemo{
	public static void main(String agrs[]){
		//Create a Hash Map
		HashMap hm=new HashMap();

		//Put elementss to the map
		hm.put("Aashu",new Double(3434.34));
		hm.put("Anmol",new Double(123.123));
		hm.put("Ayan",new Double(1345.76));
		hm.put("Animesh",new Double(-12.08));

		//Get a set of entries
		Set set=hm.entrySet();
		
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