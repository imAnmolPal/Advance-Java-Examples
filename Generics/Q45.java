class Test<T, U> 
{ 
    T obj1;  // An object of type T 
    U obj2;  // An object of type U 
  
    // constructor 
    Test(T obj1, U obj2) 
    { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
  
    // To print objects of T and U 
    public void print() 
    { 
        System.out.println(obj1); 
        System.out.println(obj2); 
    } 
} 
  
// Driver class to test above 
class Q45 
{ 
    public static void main (String[] args) 
    { 
        Test <String, Integer> obj = 
            new Test<String, Integer>("AP", 15); 
  
        obj.print(); 
    } 
}