class PriorityLevel extends Object implements Runnable {
   private Q85 var;
   public PriorityLevel(Q85 v) {
      this.var = v;
   } 
   public void run() {
      try {
         print("var getQ85 =" + var.getQ85());
         Thread.sleep(2000);
         print("var getQ85 =" + var.getQ85());
      } catch (InterruptedException x) {}
   } 
   private static void print(String msg) {
      String name = Thread.currentThread().getName();
      System.out.println(name + ": " + msg);
   } 
   public static void PriorityLevel(String[] args) {
      Q85 tid = new Q85();
      PriorityLevel shared = new PriorityLevel(tid);
      try {
         Thread threadA = new Thread(shared, "threadA");
         threadA.start();
         Thread.sleep(500);
         
         Thread threadB = new Thread(shared, "threadB");
         threadB.start();
         Thread.sleep(500);
         
         Thread threadC = new Thread(shared, "threadC");
         threadC.start();
      } catch (InterruptedException x) {}
   }
}
class Q85 extends ThreadLocal {
   private int nextID;
   public Q85() {
      nextID = 10001;
   } 
   private synchronized Integer getNewID() {
      Integer id = new Integer(nextID);
      nextID++;
      return id;
   } 
   protected Object initialValue() {
      print("in initialValue()");
      return getNewID();
   } 
   public int getQ85() {
      Integer id = (Integer) get();
      return id.intValue();
   } 
   private static void print(String msg) {
      String name = Thread.currentThread().getName();
      System.out.println(name + ": " + msg);
   }
}