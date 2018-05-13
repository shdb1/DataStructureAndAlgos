package com.shadab.ds.doublylinkedlist;

public class Node {
	
	String data;
	Node prevNode;
	Node nextNode;
	
	public Node(String data,Node prevNode,Node nextNode) {
		this.data=data;
		this.prevNode=prevNode;
		this.nextNode=nextNode;
	}

}
