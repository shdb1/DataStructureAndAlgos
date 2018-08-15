/**
 * 
 */
package com.shadab.ds.tree;

/**
 * @author mshadab
 *
 */
public class InOrderTraversal {
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
		Node rootNode = new Node(1);
		binaryTree.rootNode = rootNode;
		binaryTree.rootNode.leftNode = new Node(2);
		binaryTree.rootNode.rightNode = new Node(3);
		
		binaryTree.rootNode.leftNode.leftNode = new Node(4);
		binaryTree.rootNode.leftNode.rightNode = new Node(5);
		
		InOrderTraversal inOrderTraversal = new InOrderTraversal();
		inOrderTraversal.inOrderTraverse(rootNode);
		
	}

	
public void inOrderTraverse(Node rootNode) {
	if(null !=rootNode) {
		if(null!=rootNode.leftNode)
			inOrderTraverse(rootNode.leftNode);
		System.out.print(rootNode.nodeKey+" ");
		if(null!=rootNode.rightNode)
			inOrderTraverse(rootNode.rightNode);
	}
	else {
		System.out.println("This is not a tree");
	}
}	
}
