import java.util.*;

class SayHello extends TimerTask {
    public void run() {
      for(int i=0;i<10;i++)
      {
         System.out.println(i);
      }
    }
    public static void main(String[] args)
    {
        Timer timer = new Timer();
 timer.schedule(new SayHello(), 0, 1000);
    }
 }

 
 