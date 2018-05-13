package com.shadab.ds.queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue queue = new Queue(10);
		for (int i = 0; i < 10; i++) {
			try {
				queue.push("data-"+i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			queue.traverseQueue();
			queue.pop();
			queue.pop();
			queue.traverseQueue();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
