package com.shadab.ds.linkedlist;

public class LinkedList implements ILinkedList {

	Node initialNode;
	Node lastNode;
	String data;

	public LinkedList() {
		// TODO Auto-generated constructor stub

		initialNode = null;
		lastNode = null;
		data = null;
	}

	@Override
	public void addElement(String data) {
		// TODO Auto-generated method stub

		if (initialNode == null) {
			initialNode = new Node(data, null);
			lastNode = initialNode;
		} else {
			lastNode.nextNode = new Node(data, null);
			lastNode = lastNode.nextNode;
		}

	}

	@Override
	public boolean removeElement(String data) throws Exception {
		// TODO Auto-generated method stub

		if (initialNode == null)
			throw new Exception("empty linked list");
		Node temp = initialNode;
		Node prevNodeTemp = null;
		while (temp != null) {
 			if (temp.data.equals(data)) {
				if (temp.nextNode != null) {
					prevNodeTemp.nextNode = temp.nextNode;
					return true;
				}
			}
			prevNodeTemp = temp;
			temp = temp.nextNode;

		}

		return false;
	}

	@Override
	public void traverseLinkedList() {
		// TODO Auto-generated method stub
		
		Node temp = initialNode;
 		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
			}
 			

		}
		
	

	@Override
	public int searchElementIndex(String data) {
		// TODO Auto-generated method stub
		
		Node temp = initialNode;
 		int currentIndex=0;
		while (temp != null) {
 			if (temp.data.equals(data)) {
				if (temp.nextNode != null) {
 					return currentIndex;
				}
			}
 			temp = temp.nextNode;
            currentIndex++;
		}
		
		return -1;
	}

	@Override
	public String findMiddleElement() {
		// TODO Auto-generated method stub
 		Node myTemporarySlowNode= initialNode;
		Node myTemporaryFastNode= initialNode;
		int counter=1;
		int middleIndexIs;
		Node middleNode=null;
		if(initialNode==null ) {
			return "linkedlist is empty";
		}
		else if (initialNode==lastNode) {
			return "linked list has only one element and element is"+initialNode.data;
		}
		else {
			while(myTemporaryFastNode.nextNode!=null) {
 				myTemporarySlowNode=myTemporarySlowNode.nextNode;
				myTemporaryFastNode=myTemporaryFastNode.nextNode.nextNode;
				counter++;
				
			}
			if(counter%2!=0)
				middleIndexIs=counter+1/2;
			else
				middleIndexIs=counter;
			
		}
		
		return "Middle Index is:"+middleIndexIs+" middle data is:"+myTemporarySlowNode.data;
	}

	@Override
	public void reverseLinkedList() {
		// TODO Auto-generated method stub
		
		Node prevNode=null;
		Node headNode=initialNode;
		Node current=initialNode;
 		while(current!=null) {
  			headNode=current;
 			current=current.nextNode;
 			headNode.nextNode=prevNode;
  			prevNode=headNode;	
			
		}
 		
 		traverseGivenLinkedList(headNode);
		
	}

	@Override
	public void traverseGivenLinkedList(Node initialNode) {
		// TODO Auto-generated method stub
		
		
		 
 		while (initialNode != null) {
			System.out.println(initialNode.data);
			initialNode = initialNode.nextNode;
			}
		
	}

}
