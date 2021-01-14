import java.io.File;

public class PlayerRadixSort {
	
	static void finalize(Player[] X, int p) {
		 
		 Player[] copy = new Player[X.length];
		 int[] count = new int[10];
		 
		 for (int i = 0; i < copy.length; i++) {
			count[(X[i].truns/p) % 10]++; 
		}
		 
	    for (int i = 1; i < count.length; i++) {
			count[i] += count[i-1];
		}
	    
	    for (int i = copy.length-1; i >= 0; i--) {
			copy[count[(X[i].truns/p) % 10]-1] = X[i];
			count[(X[i].truns/p) % 10]--; 
		}
		 
	    for (int i = 0; i < copy.length; i++) {
			X[i] = copy[i];
		}
	 }
	 
	 static void radix(Player[] X) {
	
			int max = 0;
			for (int i = 0; i < X.length; i++) {
			
				max = Math.max(X[i].truns, max);
			}
			
			for (int p = 1; max/p>0; p= p*10) {
				finalize(X,p);
			}
		 
	 }
	 
   public static void main(String[] lmao) {
 
	   PlayerReader Pread = new PlayerReader();
       String fp = "C://PowerPlay//Players//Austrailia//";
       String[] names = (new File(fp).list());
       Player[] X = new Player[names.length];
       
       for(int i =0; i<names.length;i++) {
			int index = names[i].indexOf(".txt"); 
			names[i] = names[i].substring(0, index);	
			X[i] = Pread.read("Austrailia", names[i]);
       }
       
       PlayerBubbleSort sorter = new PlayerBubbleSort();
       for (int i = 0; i < X.length; i++) {
		System.out.println( X[i].truns + X[i].name +  " | ");
	}	   
       
       System.out.println();
       
       radix(X);
       for (int i = 0; i < X.length; i++) {
		System.out.println( X[i].truns + " " + X[i].name);
	}	   
      
   }
}
