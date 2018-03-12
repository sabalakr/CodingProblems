/* 
File:         BinaryTree.java
Created:      2018-03-07 3:58:42 AM 
Author name:  sathesh
*/

/**
 * @author sathesh
 *
 */


class TreeNode{
	public int data;
	public TreeNode left;
	public TreeNode right;
	

    public TreeNode(int item)
    {
    	data = item;
        left = right = null;
    }
	/**
	 * @return the data
	 */
	
}
public class BinaryTree {
		
	TreeNode root;
	
	void preOrder(TreeNode root)
	{
		if(root == null)
		{
			return;
		}
		preOrder(root.left);
		System.out.println(root.data);
		preOrder(root.right);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
 
        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);
 

	}

}
