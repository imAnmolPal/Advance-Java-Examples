import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 

public class Q58 implements Comparable<Q58>

{

private int value;

 

public Q58()

{

}

 

public Q58(int value)

{

setValue(value);

}

 

public int getValue()

{

return value;

}

 

public void setValue(int value)

{

this.value = value;

}

 

public int compareTo(Q58 other)

{

return value - other.value;

}

 

public String toString()

{

return Integer.toString(value);

}

 

public static void main(String[] args)

{

List<Q58> listOfQ58s = new ArrayList<Q58>();

listOfQ58s.add(new Q58(5));

listOfQ58s.add(new Q58(1));

listOfQ58s.add(new Q58(4));

 

Collections.<Q58>sort(listOfQ58s);

 
System.out.println(listOfQ58s);

}

}
