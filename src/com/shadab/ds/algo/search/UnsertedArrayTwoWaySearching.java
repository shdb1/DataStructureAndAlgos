package com.shadab.ds.algo.search;

public class UnsertedArrayTwoWaySearching {
	
	public static void main(String[] args) {
		
		int[] dataArray =  {-100,400,-500,399,23,40,
				5,3,22,99,32,423,5433,121,1,24,
				2221,95955,2312,-9};
		for(int k=0;k<10;k++)
		{
			searchElementInOneDIrection(dataArray, 121);
		//searchElementInTwoDirections(dataArray, 121);
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
	System.out.println(totalTime);
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
	System.out.println(totalTime);
	return isElementFound;
}

}
