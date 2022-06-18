package com.shadab.ds.array.search;




public class UnsortedArrayTwoWaySearching {
	
	public static void main(String[] args) {
		
		int[] dataArray =  {-100,400,-500,399,23,40,
				5,3,22,99,32,423,5433,121,1,24,
				2221,95955,2312,-9};
		for(int k=0;k<10;k++)
		{
			searchElementInOneDIrection(dataArray, 121);
		searchElementInTwoDirections(dataArray, 121);
		}
  		}

public static boolean searchElementInOneDIrection(int[] dataArray,int elementToSearch){
	long startTime = System.nanoTime();

	boolean isElementFound= false;
	for (int i = 0; i < dataArray.length; i++) {
		if(dataArray[i]==elementToSearch)
		{
			isElementFound=true;
			break;
		}
	}
	long endTime   = System.nanoTime();
	long totalTime = endTime - startTime;
	System.out.println("One Dir"+ totalTime);
	return isElementFound;
	
}

public static boolean searchElementInTwoDirections(int[] dataArray,int elementToSearch){

	long startTime = System.nanoTime();

	boolean isElementFound= false;
	for (int i = 0; i < dataArray.length; i++) {
 		if(dataArray[i]==elementToSearch || dataArray[dataArray.length-1-i]==elementToSearch)
		{
			isElementFound=true;
			break;
		}
	}
	long endTime   = System.nanoTime();
	long totalTime = endTime - startTime;
	System.out.println("Two Dir"+totalTime);
	return isElementFound;
}

}

/*OUTPUTS:-

Two way scan output
-------------------------
2188
2188
2188
1094
364
729
2188
1094
1094
1823


One Way Scan output
-------------
730
730
730
729
1459
729
365
729
1824
1823*/
