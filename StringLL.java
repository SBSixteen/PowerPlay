public class StringLL {
	 Node head;	

	 static class Node{
			
		 Node next = null;
		 String X = null;
		 
		
		 Node(String A)
		 {
			 X = A;
			 
		 }
	 }
	 
	 void insert(String A) {
		 
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
	 
	String search(int n) {
		 
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
}
