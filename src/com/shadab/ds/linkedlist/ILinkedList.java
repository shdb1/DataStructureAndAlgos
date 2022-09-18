package com.shadab.ds.linkedlist;

public interface ILinkedList {
	
	public void addElement(String data);
	public boolean removeElement(String data) throws Exception;
	public void traverseLinkedList();
	public int searchElementIndex(String data);
	public String findMiddleElement();
	public void reverseLinkedList();
	public void traverseGivenLinkedList(Node initialNode);
	public Node insertNodeAtSpecificLoc(Node initialNode,int data,int loc);
	

}
