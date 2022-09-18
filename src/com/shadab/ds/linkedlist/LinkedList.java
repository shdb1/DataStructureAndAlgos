package com.shadab.ds.linkedlist;

public class LinkedList implements ILinkedList {

	Node node;
	String data;

	public LinkedList() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void addElement(String data) {
		// TODO Auto-generated method stub

		if (node == null) {
			this.node = new Node(data, null);
		} else {
			Node nextNode = null;
			while(node.nextNode != null)
			{
				nextNode = this.node.nextNode;
			}
			nextNode.nextNode = new Node(data, null);
		}

	}

	@Override
	public boolean removeElement(String data) throws Exception {
		// TODO Auto-generated method stub

		if (node == null)
			throw new Exception("empty linked list");
		Node temp = node;
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
		
		Node temp = node;
 		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.nextNode;
			}
 			

		}
		
	

	@Override
	public int searchElementIndex(String data) {
		// TODO Auto-generated method stub
		
		Node temp = node;
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
 		Node myTemporarySlowNode= node;
		Node myTemporaryFastNode= node;
		int counter=1;
		int middleIndexIs;
		Node middleNode=null;
		if(node==null ) {
			return "linkedlist is empty";
		}
		else if (node==node.nextNode) {
			return "linked list has only one element and element is"+node.data;
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
		Node headNode=node;
		Node current=node;
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

	@Override
	public Node insertNodeAtSpecificLoc(Node initialNode,int data, int loc) {
		// TODO Auto-generated method stub
		/* we should traverse the node until 
		 * that particular position comes
		 * and insert the new node there
		 * 
		 * so steps should be :
		 * 1. prepare a node keep to/fro null for it .
		 * 2. Find the position & inject created node there.
		 * 3. Return the head node 
		 * */
		
		// create node
		Node newDataNode = new Node(String.valueOf(data), null);
		// now find the location
		if (initialNode== null)
			return null;
		boolean iterate = true;
		int locationTraversed=0;
		Node currentNode = initialNode;
		while (iterate) {
			if(currentNode.nextNode !=null) {
				locationTraversed++;
				currentNode=currentNode.nextNode;
			}else
			{
				iterate=false;
			}
			
			if(locationTraversed==loc) {
				newDataNode.nextNode = 	currentNode.nextNode;
				currentNode.nextNode = newDataNode;
			}
			    
		}
		
		return currentNode;
		
	}

}
