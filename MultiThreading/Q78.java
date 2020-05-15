public class Q78 extends Thread {
   private int countDown = 5;
   private volatile double d = 0; 
   public Q78(int priority) {
      setPriority(priority);
      start();
   }
   public String toString() {
      return super.toString() + ": " + countDown;
   }
   public void run() {
      while(true) {
         for(int i = 1; i < 100000; i++) d = d + (Math.PI + Math.E) / (double)i;
         System.out.println(this);
         if(--countDown == 0) return;
      }
   }
   public static void main(String[] args) {
      new Q78(Thread.MAX_PRIORITY);
      for(int i = 0; i < 5; i++)
      new Q78(Thread.MIN_PRIORITY);
   }
} 