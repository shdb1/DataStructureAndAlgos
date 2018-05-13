package com.shadab.ds.linkedlist;

import javax.sound.sampled.Line;

/**
 * @author mshadab
 *
 */
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList linkedList = new LinkedList();
	for (int i = 0; i < 20; i++) {
		linkedList.addElement("item-"+i);
	}
	try {
		linkedList.traverseLinkedList();
		System.out.println("gonna remove item-10 from linkedlist");
		System.out.println(linkedList.removeElement("item-10"));
		System.out.println("after removing the item linked list is");
		linkedList.traverseLinkedList();
		System.out.println("gonna search element item-5");
		System.out.println(linkedList.searchElementIndex("item-5"));
		System.out.println("gonna search element item-10  it should return -1 bcz we have removed it already");
		System.out.println(linkedList.searchElementIndex("item-10"));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		

	}

}
