import java.io.*;

public class BatchWrite implements Serializable{
	
	void updatePlayerDB(){
		
		resetStats();
		MatchReader Read = new MatchReader();
		PlayerReader V = new PlayerReader();
		
		Match X = new Match();
		String[] TList = (new File("C:\\PowerPlay\\Tournament\\").list());
		
		String address = "C:\\PowerPlay\\Tournament\\";
		
		for (int i = 0; i < TList.length; i++) {
			
			String[] MList = new File(address + TList[i]).list();
			
			 for (int j = 0; j < MList.length; j++) {
				System.out.println("Tournament# " + i + " | Match# " + j + " | " + TList[i] + " | " + MList[j]);				 
					X = Read.read("C:\\PowerPlay\\Tournament\\" + TList[i] + "\\"+ MList[j]);
					
					for (int k = 0; k < X.A.length; k++) {
						
						Player A = new Player();
						if(new File("C:\\PowerPlay\\Players\\" + X.teamA + "\\" + X.A[k] + ".txt").exists()) {
							A = V.read(X.teamA, X.A[k]);
							A.write(X.teamA, X.A[k], X);
						}else {
							A = new Player();
							System.out.println("A else ran");
							System.out.println( X.A[k]+ " " + X.Astats[k][0]);
							A.write(X.teamA, X.A[k], X);
						}
						
						
					}
					
					for (int l = 0; l < X.B.length; l++) {
						
						Player B = null;						
						if(new File("C:\\PowerPlay\\Players\\" + X.teamB + "\\" + X.B[l] + ".txt").exists()) {
							B = V.read(X.teamB, X.B[l]);
	                        B.write(X.teamB, X.B[l], X);
						}else {
                           B = new Player();
                           B.write(X.teamB, X.B[l], X);
						}

						
						
					}
		
				 
			}
			
			
		}
		
	}
	
	void resetStats(){
		
        Player A = new Player();
		PlayerReader Reader = new PlayerReader();
        
        String[] TList = (new File("C:\\PowerPlay\\Players\\").list());
		
		for(int i = 0; i<TList.length;i++) {
			
			String[] PList = (new File("C:\\PowerPlay\\Players\\" + TList[i]).list());
			
			for(int j = 0;j<PList.length;j++) {
			int index = PList[j].indexOf(".txt");
			A = Reader.read(TList[i], PList[j].substring(0, index));
			System.out.println(TList[i] + " " + PList[j].substring(0, index));
			A.dropstats();
            A.write();
		}
	}

		
}
	
	public static void main(String args[]) {

      BatchWrite A = new BatchWrite();
      A.updatePlayerDB();
      PlayerReader X = new PlayerReader();
	}

}
