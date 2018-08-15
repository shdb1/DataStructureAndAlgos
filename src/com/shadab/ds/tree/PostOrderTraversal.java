/**
 * 
 */
package com.shadab.ds.tree;

/**
 * @author mshadab
 *
 */
public class PostOrderTraversal {

	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
		Node rootNode = new Node(1);
		binaryTree.rootNode = rootNode;
		binaryTree.rootNode.leftNode = new Node(2);
		binaryTree.rootNode.rightNode = new Node(3);
		
		binaryTree.rootNode.leftNode.leftNode = new Node(4);
		binaryTree.rootNode.leftNode.rightNode = new Node(5);
		
		PostOrderTraversal postOrderTraversal = new PostOrderTraversal();
		postOrderTraversal.postOrderTraverse(rootNode);
		
	}

	
public void postOrderTraverse(Node rootNode) {
	if(null !=rootNode) {
		if(null!=rootNode.leftNode)
			postOrderTraverse(rootNode.leftNode);
		if(null!=rootNode.rightNode)
			postOrderTraverse(rootNode.rightNode);
		System.out.print(rootNode.nodeKey+" ");

	}
	else {
		System.out.println("This is not a tree");
	}
}	


}
