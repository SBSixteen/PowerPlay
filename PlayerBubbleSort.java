public class PlayerBubbleSort {
	
	void sort(Player[] X){
		
		int L = X.length;
		
		for (int i = 0; i < X.length; i++) {
			for (int j = 0; j < X.length-1; j++) {
				if(X[j].twickets>X[j+1].twickets) {
					Player s = X[j];
					X[j] = X[j+1];
					X[j+1] = s;
				}
			}
		}
		
	}
	
	void print(Player[] X) {
		System.out.println(X[0].team + ": ");
		for (int i = 0; i < X.length; i++) {
			System.out.print(X[i].twickets + " " +  X[i].name + " | ");
		}
		System.out.println();
	}

}
