
import javax.swing.JTextField;
import java.io.*;

public class Match implements Serializable{

	String[] A  = new String[11],B = new String[11];
	int[][] Astats = new int[11][9] ,Bstats = new int[11][9];
	String venue,tournament,teamA,teamB,stage,date;
    
void update(JTextField[] An,JTextField[] Bn,JTextField[] Ar,JTextField[] Br,JTextField[] Ab,JTextField[] Bb,JTextField[] Aw,JTextField[] Bw,JTextField[] Abb,JTextField[] Bbb,JTextField[] Af,JTextField[] Bf,JTextField[] As,JTextField[] Bs,JTextField[] Awd,JTextField[] Bwd,JTextField[] Anb,JTextField[] Bnb, JTextField[] brA, JTextField[] brB ){

	for(int i = 0; i<11;i++) {
		A[i] = An[i].getText();
		B[i] = Bn[i].getText();
		
		// Order : Runs, BallsFaced, Wickets, BallsBowled, RunsConceded, Fours, Sixes, Wides, NoBalls 
		
		Astats[i][0] = Integer.parseInt(Ar[i].getText());
		Astats[i][1] = Integer.parseInt(Ab[i].getText());
		Astats[i][2] = Integer.parseInt(Aw[i].getText());
		Astats[i][3] = Integer.parseInt(Abb[i].getText());
		Astats[i][4] = Integer.parseInt(brA[i].getText());
		Astats[i][5] = Integer.parseInt(Af[i].getText());
		Astats[i][6] = Integer.parseInt(As[i].getText());
		Astats[i][7] = Integer.parseInt(Awd[i].getText());
		Astats[i][8] = Integer.parseInt(Anb[i].getText());
		
		Bstats[i][0] = Integer.parseInt(Br[i].getText());
		Bstats[i][1] = Integer.parseInt(Bb[i].getText());
		Bstats[i][2] = Integer.parseInt(Bw[i].getText());
		Bstats[i][3] = Integer.parseInt(Bbb[i].getText());
		Bstats[i][4] = Integer.parseInt(brB[i].getText());
		Bstats[i][5] = Integer.parseInt(Bf[i].getText());
		Bstats[i][6] = Integer.parseInt(Bs[i].getText());
		Bstats[i][7] = Integer.parseInt(Bwd[i].getText());
		Bstats[i][8] = Integer.parseInt(Bnb[i].getText());
	}
	
}
	
void basic(String a, String b, String c, String d, String e,String f) {
	
	teamA = a;
	teamB = b;
	stage = c;
	tournament = d;
	venue = e;
	date = f;
	
}

}
