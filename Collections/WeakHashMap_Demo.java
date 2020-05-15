import java.util.*;

public class WeakHashMap_Demo{

	private static Map map;
	public static void main(String agrs[]){
		
		map = new WeakHashMap();
		map.put(new String("Anmol"), "Pal");

		Runnable runner=new Runnable(){
			public void run(){
				while(map.containsKey("Pal"))				{
				try{
				Thread.sleep(500);
				}catch(InterruptedException ignored){}
			System.out.println("Thread waiting");
			System.gc();
				}
			}
		};
		Thread t=new Thread(runner);
		t.start();
		System.out.println("Main waiting");
		try{
			t.join();
		}catch(InterruptedException ignored){}
	}
}