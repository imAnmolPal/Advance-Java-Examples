public class Q43<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Q43<Integer> integerQ43 = new Q43<Integer>();
      Q43<String> stringQ43 = new Q43<String>();
    
      integerQ43.add(new Integer(10));
      stringQ43.add(new String("Hello World"));

      System.out.printf("Integer Value :%d\n\n", integerQ43.get());
      System.out.printf("String Value :%s\n", stringQ43.get());
   }
}
