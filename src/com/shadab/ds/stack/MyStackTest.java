package com.shadab.ds.stack;

/**
 * 
 */
/**
 * @author mshadab
 *
 */
public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyStack myStack = new MyStack();
        try {
        //	myStack.pop();
			myStack.push("12");
			myStack.push("30");
			myStack.push("13");
			myStack.push("31");
			myStack.push("12");
			myStack.push("30");
			myStack.push("13");
			myStack.push("31");
			myStack.push("12");
			myStack.push("30");
			myStack.push("13");
			myStack.push("31");
			myStack.push("13");
			myStack.push("31");
			myStack.push("12");
			myStack.push("30");
			myStack.push("13");
			myStack.push("31");
			myStack.push("12");
			myStack.push("30");
			//myStack.push("30");
			myStack.pop();
			myStack.pop();
			System.out.println(myStack.pop());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        

	}
}
	
	class MyStack implements IMyStack{
		int elementAdded;
		String[] myStackArray;
		public MyStack() {
			this.myStackArray=new String[20];
 		}

		@Override
		public void push(String data) throws Exception {
			// TODO Auto-generated method stub
			 if(elementAdded==myStackArray.length)
				 throw new Exception("Overflow");
			myStackArray[elementAdded]=data;
			elementAdded++;
			
		 
			
		}

		@Override
		public String pop() throws Exception {
			// TODO Auto-generated method stub
			String data=null;
		 
				if(elementAdded==0)
					throw new Exception("underflow");
				data=myStackArray[elementAdded-1];
				myStackArray[elementAdded-1]=null;
				elementAdded--;
	 
			return data;
		}
		
	
		
		
	}


