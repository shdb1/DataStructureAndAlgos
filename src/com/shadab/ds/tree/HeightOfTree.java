package com.shadab.ds.tree;

public class HeightOfTree {
	
	public static void main(String[] args) {
		
		BinaryTree binaryTree = new BinaryTree();
		
		Node rootNode = new Node(3);
		binaryTree.rootNode = rootNode;
		binaryTree.rootNode.leftNode = new Node(2);
		binaryTree.rootNode.rightNode = new Node(5);
		
		binaryTree.rootNode.leftNode.leftNode = new Node(1);
		binaryTree.rootNode.rightNode.leftNode = new Node(4);
		
		binaryTree.rootNode.rightNode.rightNode = new Node(6);
		
		binaryTree.rootNode.rightNode.rightNode.rightNode = new Node(7);

		
		HeightOfTree heightOfTree = new HeightOfTree();
		System.out.println(heightOfTree.getHeight(rootNode)-1);
		
	}

	
public int getHeight(Node rootNode) {
	
	
 	if(rootNode==null) {
 		System.out.println("nulll");
		return 0;
	}
	else
	{System.out.println(rootNode.nodeKey);
	/* compute the depth of each subtree */
    int lDepth = getHeight(rootNode.leftNode);
    int rDepth = getHeight(rootNode.rightNode);

    /* use the larger one */
    if (lDepth > rDepth)
        return (lDepth + 1);
     else
        return (rDepth + 1);			
	}
}	
}
