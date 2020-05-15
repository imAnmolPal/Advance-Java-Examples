
import java.net.InetAddress;

public class Main6 {
   public static void main(String[] argv) throws Exception {
      InetAddress addr = InetAddress.getByName("74.125.67.100");
      System.out.println("Host name is: "+addr.getHostName());
      System.out.println("Ip address is: "+ addr.getHostAddress());
   }
}