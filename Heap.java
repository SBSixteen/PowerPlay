
import java.util.*;

class node{
	int data;
	node left;
	node right;
	node parent;

}
class LinkedlistBST {

	node head;
	int length = 0;
	int [] BST;


	public void insert(int data) {
		length++;
		node n = new node();
		n.data = data;
		node current = new node();
		current = head;
		while (true) {
			if (head == null) {
				head = n;
				head.parent = null;
				break;
			}
			else {
				
				if (current.data>n.data) { 
					if (current.left==null) {
						current.left = n;
						n.parent = current;
						break;
					}
					else
						current = current.left;
						
					}
				else if(current.data <= n.data) {
					
					if (current.right == null) {
						current.right = n;
						n.parent = current;
						break;
				}
					else
						current = current.right;
				}
				}
			
		}
		
	}
	

	public void clear() {
		head = null;
	}
	public void DisplayinOrder() {
		DisplayinOrder(head);
	}
	public void DisplayinOrder(node n) {
		if (n == null) {
			return;
		}
		DisplayinOrder(n.left);
		System.out.print(n.data+" ");
		DisplayinOrder(n.right);
	}
	public void TraverseinOrder() {
		TraverseinOrder(this.head,0);
	}
	public void TraverseinOrder(node n,int i) {
		
		if (n == null) {
			return;
		}
		BST[i] = n.data;i++;
		TraverseinOrder(n.left,i);
		i++;
		TraverseinOrder(n.right,i);		
	}
	public int[] Top5() {
		int[] top5 = new int[5];
		BST = new int[length];
		TraverseinOrder();
		Arrays.sort(BST);
		top5[0] = BST[length-1];
		top5[1] = BST[length-2];
		top5[2] = BST[length-3];
		top5[3] = BST[length-4];
		top5[4] = BST[length-5];
		
		return top5;
		
	}
	

	
}
public class Heap {
	public static void main(String[] args) {
		LinkedlistBST lol = new LinkedlistBST();
		lol.insert(45);
		lol.insert(10);
		lol.insert(7);
		lol.insert(90);
		lol.insert(80);
		lol.insert(100);
		lol.insert(160);
		lol.insert(12);
		lol.insert(50);
		lol.insert(150);
		lol.insert(13);
		lol.insert(39);
		lol.insert(200);
		lol.insert(58);
		lol.insert(59);
		
		
		lol.DisplayinOrder();
		System.out.println();
		int[] max5 = lol.Top5();
		
		for (int i=0;i<max5.length;i++) {
			System.out.print(max5[i]+" ");
		}
	}
}
