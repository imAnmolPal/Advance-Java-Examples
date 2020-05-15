import java.util.*;

public class IdentityMapDemo{
	public static void main(String agrs[]){
		//Create a Hash Map
		IdentityHashMap ihm=new IdentityHashMap();

		//Put elementss to the map
		ihm.put("Aashu",new Double(3434.34));
		ihm.put("Anmol",new Double(123.123));
		ihm.put("Ayan",new Double(1345.76));
		ihm.put("Animesh",new Double(-12.08));

		//Get a set of entries
		Set set=ihm.entrySet();
		
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