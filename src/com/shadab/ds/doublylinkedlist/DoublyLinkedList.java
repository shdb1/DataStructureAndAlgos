package com.shadab.ds.doublylinkedlist;

public class DoublyLinkedList implements IDoubyLinkedList{

	private Node initialnode;
	private Node lastNode;
	
	@Override
	public void addElement(String data) {
		// TODO Auto-generated method stub
		if(initialnode==null) {
			initialnode = new Node(data, null, null);
			lastNode=initialnode;
			
		}
		else {
			lastNode.nextNode = new Node(data, lastNode, null);
			lastNode=lastNode.nextNode;
		}
		
	}

	@Override
	public boolean removeElement(String data) throws Exception {
		// TODO Auto-generated method stub
		Node tempNode=initialnode;
		if(tempNode == null)
			throw new Exception("Linked list is empty");
		while(tempNode != null) {
			if(data.equals(tempNode.data)) {
				tempNode.prevNode.nextNode=tempNode.nextNode;
				return true;
			}
			tempNode=tempNode.nextNode;
		}
	
		
		return false;
	}

	@Override
	public void traverseLinkedList() {
		// TODO Auto-generated method stub
		Node temp = initialnode;
		while(temp != null) {
			System.out.print("current node data:"+temp.data);
			try {
				System.out.print(" ,prev node data:"+temp.prevNode.data);
			}
			catch (Exception e) {
				System.out.print(" ,prev node data: Null");
			}
			try {
				System.out.println(" ,next node data:"+temp.nextNode.data);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(" ,next node data: Null");
			}

			temp=temp.nextNode;
		}
		
	}

	@Override
	public int searchElementIndex(String data) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
