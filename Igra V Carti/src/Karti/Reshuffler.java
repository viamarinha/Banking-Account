package Karti;

import java.util.Date;
import java.util.Random;

public class Reshuffler {
    
    public Reshuffler() {
    }
    
   
    public static void reshuffle(int[] pack) {
        if(pack != null) {
            int length = pack.length;
          
            Random generator = new Random(new Date().getTime());
            
            for(int i = 0; i < length; i++) {
                
                int newPos =  generator.nextInt(length);
               
                int curCard = pack[i];
                pack[i] = pack[newPos];
                pack[newPos] = curCard;
              
                if(i%(length/4) == 0) {
                    int pause = generator.nextInt(20);
                    try {
                       
                        Thread.currentThread().sleep(pause);
                    }
                    catch (InterruptedException ex) {}
                  
                    generator.setSeed(new Date().getTime());
                }
            }
        }
    }
}

