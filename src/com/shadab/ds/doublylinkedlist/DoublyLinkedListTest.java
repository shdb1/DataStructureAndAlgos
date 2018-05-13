package com.shadab.ds.doublylinkedlist;

public class DoublyLinkedListTest {
	public static void main(String[] args) {
		DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
		for (int i = 1; i < 20; i++) {
			doublyLinkedList.addElement("item-"+i);
			
		}
		try {
			doublyLinkedList.traverseLinkedList();
			System.out.println("going to remove");
			System.out.println(doublyLinkedList.removeElement("item-10"));
			System.out.println("reoved");
			doublyLinkedList.traverseLinkedList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
