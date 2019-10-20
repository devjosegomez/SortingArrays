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
		//Bubble
		int[] uBubble = {0, -1, 33, 20, 21, 20, 9, 100, -23, 10};
		int[] oBubble;
		
		//Insertion
		int[] uInsertion = {10, 6, 12, 46, -1, 12, 76, 34, -9, 3};
		int[] oInsertion;
		
		printArray(uBubble);
		printArray(uInsertion);
		
		oBubble		= 	Sort.Bubble(uBubble);
		oInsertion	=	Sort.InsertionSort(uInsertion);
		
		printArray("Bubble", oBubble);
		printArray("Insertion", oInsertion);
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
