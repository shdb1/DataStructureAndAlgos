package com.shadab.ds.bst;

public class BSTTree {
	
	BSTNode rootNode;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BSTTree bst = new BSTTree();
		bst.inserKey(12);
		bst.inserKey(10);
		bst.inserKey(115);
		bst.inorder();
 		
		

	}
	
	class BSTNode{
		
		BSTNode leftNode,rightNode;
		int nodeKey;
	}
	
	
	
	
	public void inserKey(int key){
		//System.out.println(rootNode.nodeKey);
		rootNode=insertinTree(key,rootNode);
 	}
	
	public BSTNode insertinTree(int key,BSTNode bstNode){
 		if(bstNode==null){
			bstNode= new BSTNode();
			bstNode.nodeKey=key;
			return bstNode;
		}
		else{
			if(key<bstNode.nodeKey){
				// add in left
				bstNode.leftNode=insertinTree(key, bstNode.leftNode);
			}
			if(key>bstNode.nodeKey){
				// add in right
				bstNode.rightNode=insertinTree(key, bstNode.rightNode);
			}
			
			return bstNode;
		}
		
	}
	
	 void inorder()  {
	       inorderRec(rootNode);
	    }
	 
	    // A utility function to do inorder traversal of BST
	    void inorderRec(BSTNode root) {
	    	System.out.println("cakled");
 	        if (root != null) {
 	        	System.out.println(root.nodeKey);
 	        	System.out.println(root.leftNode);
 	            inorderRec(root.leftNode);
	            System.out.println(root.nodeKey);
	            inorderRec(root.rightNode);
	        }
	    }
	

}
