package com.sortingarrays.app;

import com.sortingarrays.model.Sort;

/*
 * This application has the following sorting methods:
 * 	- Bubble
 * 	- Insertion 
 * 	- Selection
 * 	- Shell
*/
public class SortingArraysApp {

	public static void main(String[] args) {
		int[] myUnsortedArray1 = {0, -1, 33, 20, 21, 20, 9, 100, -23, 10};
		int[] myOrderedArray1;
		
		myOrderedArray1 = Sort.Bubble(myUnsortedArray1);
		
		printArray(myUnsortedArray1);
		printArray("Bubble", myOrderedArray1);
	}
	
    //ToString
	public static void printArray(String sortType, int[] orderedArray){
		//Displaying Ordered Array with type
		System.out.println("Ordered Array (" + sortType + " sort):");
		for(int elem : orderedArray) {
			System.out.print("[" + elem + "]");
		}
		System.out.print("\n");
	}
	
	public static void printArray(int[] Array) {
		//Displaying an Array
		for(int elem : Array) {
			System.out.print("[" + elem + "]");
		}
		System.out.print("\n");
	}

}
