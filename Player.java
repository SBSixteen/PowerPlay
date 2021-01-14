import java.io.*;

public class Player implements Serializable {
    
	//Basic Stats
	String name,team,hometown; int age;
	
	//Cricket Stats
	int key;
	int truns =0,twickets,tballs,tbballs,maxruns,maxwickets,fours,sixes,wides,noballs,bruns,maxconceded = 0;
	boolean captain = false,wicketkeeper = false;
	double sr,economy;
	String role;
	
	//To rename and add basic info
	void basic(String n, String t, String h, int a) {
	
		name = n;
		team = t;
		hometown = h;
		age = a;
		
	}
	
	//to update stats after a match is added to DB
	void update(int runs, int balls, int wickets, int brun, int bowled, int f, int s, int w, int nb) {
		
		truns = truns + runs;
		tballs = tballs + balls;
		twickets = twickets + wickets;
		bruns = bruns + brun;
		tbballs = tbballs + bowled;
		fours = fours + f;
		sixes = sixes + s;
		wides = w;
		noballs = nb;
		maxruns= Math.max(runs, maxruns);
		maxwickets = Math.max(wickets, maxwickets);
		maxconceded = Math.max(brun, maxconceded);
		
	}
	
	void dropstats() {
		
		truns = 0;
		tballs = 0;
		twickets = 0;
		bruns = 0;
		tbballs = 0;
		fours = 0;
		sixes = 0;
		wides = 0;
		noballs = 0;
		maxruns= 0;
		maxwickets = 0;
		maxconceded = 0;
		
	}
	
	void write(){
		
		try {
			String filepath = "C:\\PowerPlay\\Players\\" + this.team + "\\" + this.name + ".txt";
			File F = new File(filepath);
			FileOutputStream start = new FileOutputStream(filepath);
			ObjectOutputStream push = new ObjectOutputStream(start);
			push.writeObject(this);
			
			
		}catch(Exception e) {
			
			System.out.println("File not Found");
			
		}
		
	}
	
	//Write Info to a txt file that is serialized
	void write(String Team, String Name, Match X){
		
		name = Name;
		team = Team;
		
		int index  = 0;
		String dir = "C:\\PowerPlay\\Players\\" + Team;
		File Directory = new File(dir);
		if(!Directory.exists()) {
		 Directory.mkdir();
		}
		
		String filepath = "C:\\PowerPlay\\Players\\" + Team + "\\" + Name + ".txt";
		
        if(Team.equals(X.teamA)) {
        	for (int i = 0; i < X.A.length; i++) {
        		if(Name.equals(X.A[i])) {
					index = i; break;
				}
			}

        	update(X.Astats[index][0], X.Astats[index][1], X.Astats[index][2], X.Astats[index][3], X.Astats[index][4], X.Astats[index][5], X.Astats[index][6], X.Astats[index][7], X.Astats[index][8]);
        	
        }
        
        if(Team.equals(X.teamB)) {
        	
        	for (int i = 0; i < X.B.length; i++) {
				if(Name.equals(X.B[i])) {
					index = i; break;
				}
			}

        	update(X.Bstats[index][0], X.Bstats[index][1], X.Bstats[index][2], X.Bstats[index][3], X.Bstats[index][4], X.Bstats[index][5], X.Bstats[index][6], X.Bstats[index][7], X.Bstats[index][8]);
        	
        }
		
		try {
			File F = new File(filepath);
			FileOutputStream start = new FileOutputStream(filepath);
			ObjectOutputStream push = new ObjectOutputStream(start);
			push.writeObject(this);
			
			
		}catch(Exception e) {
			
			System.out.println("File not Found");
			
		}
		
	}
	
	public static void main(String args[]) {
		

	}
	
}
