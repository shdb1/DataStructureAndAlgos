package com.shadab.algos.design.dp.fibonacci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FibDemo {
	
	Map countHolder = new HashMap<Integer,Integer>();
	int totalcalls=0;
	int[] table = new int[100];
	
	public static void main(String[] args) {
/*		long startTime=0;
		long endTime =0;
		long totalTime=0;
		 startTime = System.nanoTime();
		 FibDemo fibDemo = new FibDemo();
 		System.out.println(fibDemo.fib(10));
		 endTime   = System.nanoTime();
		 totalTime = endTime - startTime;
		System.out.println(totalTime);
		System.out.println(fibDemo.countHolder);
		System.out.println("Total calls:"+fibDemo.totalcalls);*/
		
	/*	OutPut
		----------------
		55
		645106
		{1=21, 2=34, 3=21, 4=13, 5=8, 6=5, 7=3, 8=2, 9=1, 10=1}
		Total calls:109*/
		
		
	/*	long startTime=0;
		long endTime =0;
		long totalTime=0;
		 startTime = System.nanoTime();
		 FibDemo fibDemo = new FibDemo();
 		System.out.println(fibDemo.fibMemo(10));
		 endTime   = System.nanoTime();
		 totalTime = endTime - startTime;
		System.out.println(totalTime);
		System.out.println(fibDemo.countHolder);
		System.out.println("Total calls:"+fibDemo.totalcalls);*/
		
	/*	Output:
		55
		395305
		{1=1, 2=2, 3=2, 4=2, 5=2, 6=2, 7=2, 8=2, 9=1, 10=1}
		Total calls:17*/
		
		
		long startTime=0;
		long endTime =0;
		long totalTime=0;
		 startTime = System.nanoTime();
		 FibDemo fibDemo = new FibDemo();
 		 fibDemo.fibBottomUp(10);
		 endTime   = System.nanoTime();
		 totalTime = endTime - startTime;
		System.out.println(totalTime);
		
	/*	Output:
			[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
					324559*/
  		
	}
	
	public  long fib(int n) {
 		puEntryInMap(n);
 		totalcalls=totalcalls+1;
		long result=0;
	    if (n == 1 || n == 2){
	        result = 1;
	    }
	    else {
	        result = fib(n-1) + fib(n-2);
	    }
	    return result;
	}
	
	
	public  int fibMemo(int n) {
 		puEntryInMap(n);
 		
 		totalcalls=totalcalls+1;
		int result=0;
		if(table[n]!=0)
			return table[n];
	    if (n == 1 || n == 2){
	        result = 1;
	        table[n]=1;
	    }
	    else {
	        result = fibMemo(n-1) + fibMemo(n-2);
	        table[n]=result;
	    }
	    return table[n];
	}
	
	public  void fibBottomUp(int n) {
  		int[] bottomUp = new int[n+1];
 	bottomUp[1]=1;
 	bottomUp[2]=1;
 	for(int element=3 ; element<=n;element++) {
 		
 		bottomUp[element] = bottomUp[element-1]+ bottomUp[element-2];
 	}
 	
 	System.out.println(Arrays.toString(bottomUp));

	}
	
	public void puEntryInMap(int number) {
	if(null!=countHolder.get(number)) {
		int currentCount=(int)countHolder.get(number);
		countHolder.put(number,currentCount+1);
	}
	else {
		countHolder.put(number,1);

	}
	}

}
