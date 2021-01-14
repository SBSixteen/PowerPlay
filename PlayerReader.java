import java.io.*;

public class PlayerReader implements Serializable{

	String filepath;
	FileInputStream Go;
	ObjectInputStream Read;
	
	Player read(String Team, String Player){
	    
		Player A = new Player();
		
		try {
		filepath = "C:\\PowerPlay\\Players\\"+Team+"\\"+Player+".txt";
		Go = new FileInputStream(filepath);
		Read = new ObjectInputStream(Go);
		A = (Player)Read.readObject();
		}catch(Exception e) {		
			System.out.println("File not Found!");
			e.printStackTrace();
		}
		return A;		
	}
	public static void main(String args[]) {

		PlayerReader A = new PlayerReader();
		
		Player X = A.read("Austrailia","Aaron Finch");
		
		System.out.println(X.truns);
		X = A.read("Pakistan","Babar Azam");
		System.out.println(X.truns);
	}
		
}
