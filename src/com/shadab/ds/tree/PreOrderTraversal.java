package com.shadab.ds.tree;

public class PreOrderTraversal {
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
		Node rootNode = new Node(1);
		binaryTree.rootNode = rootNode;
		binaryTree.rootNode.leftNode = new Node(2);
		binaryTree.rootNode.rightNode = new Node(3);
		
		binaryTree.rootNode.leftNode.leftNode = new Node(4);
		binaryTree.rootNode.leftNode.rightNode = new Node(5);
		
		PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
		preOrderTraversal.preOrderTraverse(rootNode);
		
	}

	
public void preOrderTraverse(Node rootNode) {
	if(null !=rootNode) {
		System.out.print(rootNode.nodeKey+" ");
		if(null!=rootNode.leftNode)
		preOrderTraverse(rootNode.leftNode);
		if(null!=rootNode.rightNode)
		preOrderTraverse(rootNode.rightNode);
	}
	else {
		System.out.println("This is not a tree");
	}
}	
}
