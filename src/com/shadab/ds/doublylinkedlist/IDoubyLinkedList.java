package com.shadab.ds.doublylinkedlist;

public interface IDoubyLinkedList {
	public void addElement(String data);
	public boolean removeElement(String data) throws Exception;
	public void traverseLinkedList();
	public int searchElementIndex(String data);

}
