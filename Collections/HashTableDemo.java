import java.util.*;

public class HashTableDemo{
	public static void main(String args[]){
		// Create a hash map
		Hashtable balance= new Hashtable();
		Enumeration names;
		String str;
		double bal;

		balance.put("Aashu", new Double(3434.34));
		balance.put("Anmol", new Double(1234.24));
		balance.put("Animesh", new Double(-19));
		balance.put("Sanya", new Double(99.22));

		// Show all balances in hash table
		names= balance.keys();

		while(names.hasMoreElements()){
			str=(String)names.nextElement();
			System.out.println(str + ": "+ balance.get(str));
		}
		System.out.println();	
	}
}