package com.shadab.ds.linkedlist;

public class Node {
	
	String data;
	Node nextNode;
	public Node(String data,Node nextNode) {
		// TODO Auto-generated constructor stub
		this.data=data;
		this.nextNode=nextNode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(data);
		while (nextNode!=null) {
			sb.append("/n").append(nextNode.data);
			nextNode=nextNode.nextNode;
			
		}
		return sb.toString();
	}

}
