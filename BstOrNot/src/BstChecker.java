/* 
File:         BstChecker.java
Created:      2018-03-08 11:13:55 PM 
Author name:  sathesh
*/


 class Node{
	public int data;
	public Node left;
	public Node right;
	
	public Node(int item)
	{
		this.data = item;
		this.left= this.right = null;
	}
	
}

/**
 * @author sathesh
 *
 */
public class BstChecker {
	
	
	public boolean isBST(Node node,int min,int max)
	{
		if(node == null)
		{
			return true;
		}
		
		if(node.data<min || node.data>max)
		{
			return false;
		}
		return isBST(node.left,min,node.data) && isBST(node.right,node.data,max);
				
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node head = new Node(10);
		Node node10 = new Node(10);
		Node sub5 = new Node(-5);
		Node nineteen = new Node(19);
		Node seventeen = new Node(17);
		Node twentyone = new Node(21);
		
		head.left = node10;
		head.right = nineteen;
		node10.left=sub5;
		nineteen.left= seventeen;
		nineteen.right= twentyone;
		
		BstChecker bstChecker = new BstChecker();
		System.out.println(bstChecker.isBST(head, Integer.MIN_VALUE, Integer.MAX_VALUE));

	}

}


