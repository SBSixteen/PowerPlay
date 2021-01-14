public class PlayerLL {
	 Node head;	

	 static class Node{
		 Node next = null;
		 Player X = null;
		 
		 Node(Player A)
		 {
			 X = A;
			 
		 }
	 }
	 
	 void insert(Player A) {
		 
		 if(head == null) {
			 head = new Node(A);
		 }
		 else {
			 
			 Node temp = head;
			 while(temp.next!= null) {
				 
				 temp = temp.next;
				 
			 }
			 
			 temp.next = new Node(A);
			 
		 }
		 
		 
	 }
	 
	 Player search(int n) {
		 
		 int i = 0;
		 
		 Node temp = head;
		 
		 while(i<n) {
			 
			 temp = temp.next;
			 i++;
			 
		 }
		 
		 return temp.X;
		 
	 }
	 
		int length(){
			 int count =0;
			 Node temp = head;
			 while(temp!=null) {
				 count++;
				 temp = temp.next;
			 }
					 
					 return count;
		}
	 
	 public static void main(String[] args) {
		 
		 Player A = new Player();
		 A.name = "Nabeel";
		 Player B = new Player();
		 B.name = "16";
		 Player C = new Player();
		 C.name = "17";
		 Player D = new Player();
		 D.name = "18";
		 
		 PlayerLL X = new PlayerLL();
		 
		 X.insert(A);
		 X.insert(B);
		 X.insert(C);
		 X.insert(D);
		 
		 System.out.println(X.head.X.name);
		 System.out.println(X.head.next.X.name);
		 
		 Player F = X.search(2);
		 System.out.println(F.name);
		 
	 }

}
