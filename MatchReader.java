import java.io.*;

public class MatchReader implements Serializable{

	String filepath;
	FileInputStream Go;
	ObjectInputStream Read;
	
	Match read(String x){
	    
		Match A = new Match();
		
		try {
		filepath = x;
		Go = new FileInputStream(filepath);
		Read = new ObjectInputStream(Go);
		A = (Match)Read.readObject();
		}catch(Exception e) {		
			
		}
		return A;		
	}
	
	public static void main(String[] args) {
		

		
	}
	
}
