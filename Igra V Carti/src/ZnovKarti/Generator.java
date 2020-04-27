package ZnovKarti;

import java.util.Date;
import java.util.Random;




public class Generator {

	public static void pomishatKarti(int[] koloda) {
		
		Random r = new Random(new Date().getTime());
		
		int size = koloda.length;
		
		for(int i = 0; i < size; i++ ) {
			
			int newnumber = r.nextInt(size);
			
			int currentNumber = koloda[i];
			koloda[i] = koloda[newnumber];
			koloda[newnumber] = koloda[currentNumber];
			
			if(i%2 == 0) {
			int pause = r.nextInt(20);
				try {
					
					Thread.currentThread().sleep(pause);
					
					
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally {
					r.setSeed(new Date().getTime());
				}
				
			}
		}
	}
}
