package com.shadab.ds.linkedlist;

import javax.sound.sampled.Line;

/**
 * @author mshadab
 *
 */
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	try {
		/*LinkedList linkedList = new LinkedList();
	for (int i = 0; i < 20; i++) {
		linkedList.addElement("item-"+i);
	}
		 * linkedList.traverseLinkedList();
		 * System.out.println("gonna remove item-10 from linkedlist");
		 * System.out.println(linkedList.removeElement("item-10"));
		 * System.out.println("after removing the item linked list is");
		 * linkedList.traverseLinkedList();
		 * System.out.println("gonna search element item-5");
		 * System.out.println(linkedList.searchElementIndex("item-5")); System.out.
		 * println("gonna search element item-10  it should return -1 bcz we have removed it already"
		 * ); System.out.println(linkedList.searchElementIndex("item-10"));
		 * System.out.println("Middle Element is :"+linkedList.findMiddleElement());
		 * System.out.println("Reversing linkedlist:"); linkedList.reverseLinkedList();
		 */
 		System.out.println("Insert Node At a postion in linkedlist:");
 		LinkedList linkedList2 = new LinkedList();
 		linkedList2.addElement("1");
 		linkedList2.addElement("2");
 		linkedList2.addElement("3");
 		Node node = linkedList2.insertNodeAtSpecificLoc(linkedList2.node, 4, 2);
 		System.out.println(node);
  		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		

	}

}
