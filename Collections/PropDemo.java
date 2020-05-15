import java.util.*;

public class PropDemo{
	public static void main(String args[]){
		Properties capitals = new Properties();
		Set states;
		String str;

		capitals.put("MP","Indore");		
		capitals.put("MH","Mumbai");
		capitals.put("UP","Kanpur");
		capitals.put("CH","Raipur");

		// Show all states and capitals in hashtable.
		states=capitals.keySet();//get set-view of keys
		Iterator itr=states.iterator();
		
		while(itr.hasNext()){
			str=(String)itr.next();
			System.out.println("The capital of "+ str+ " is "+capitals.getProperty(str)+".");
		}
		System.out.println();
		
		//Look for state not in list-- specify default
		str=capitals.getProperty("HP","Not Found");
		System.out.println("The capital of HP is " + str + ".");
	}
}