package com.shadab.ds.queue;

public class Queue  implements IQueue{
	String[] queue;
	int queueSize;
	int front;
	int rear;
	public Queue(int queueSize) {
		// TODO Auto-generated constructor stub
		queue = new String[queueSize];
		this.queueSize = queueSize;
		front = 0;
		rear = -1;
	}

	@Override
	public void push(String data) throws Exception {
		// TODO Auto-generated method stub
		if(rear==queueSize-1)
			throw new Exception("Overflow");
		queue[rear+1] = data;
		rear++;
		
	}

	@Override
	public String pop() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("pop");
		String data=null;
		if( front == rear)
			throw new Exception("underflow");
		data = queue[front];
		front++;
	
		return data;
	}

	@Override
	public void traverseQueue() {
		// TODO Auto-generated method stub
		System.out.println("front  "+front+"   rear "+rear);
		for (int i = front; i < rear; i++) {
			System.out.println(queue[i]);
			
		}
		
	}

}
