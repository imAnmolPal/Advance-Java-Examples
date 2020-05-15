import java.util.*;

public class CollectionDemo{
	public static void main(String[] args){
		//ArrayList
		List a1=new ArrayList();
		a1.add("Anmol");
		a1.add("Aashu");
		a1.add("Aayan");
		System.out.println("ArrayList Elements");
		System.out.println(a1);

		//LinkedList
		List l1=new LinkedList();
		l1.add("Anmol");
		l1.add("Aashu");
		l1.add("Aayan");

		System.out.println("LinkedList Elements");
		System.out.println(l1);

		//HashSet
		Set s1=new HashSet();
		s1.add("Ronaldo");
		s1.add("Dhoni");
		s1.add("07");
	
		System.out.println("Set Elements");
		System.out.println(s1);

		//HashMap
		Map m1=new HashMap();
		m1.put("Aashu","1");
		m1.put("Anmol","2");
		m1.put("Animesh","3");
		m1.put("Sanya","4");

		System.out.println("Map Elements");
		System.out.println(m1);
	}
}