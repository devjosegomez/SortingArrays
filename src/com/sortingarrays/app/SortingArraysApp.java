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
		//u - unordered
		//o - ordered
		
		// Bubble
		int[] uBubble = { 0, -1, 33, 20, 21, 20, 9, 100, -23, 10 };
		int[] oBubble;

		// Insertion
		int[] uInsertion = { 10, 6, 12, 46, -1, 12, 76, 34, -9, 31 };
		int[] oInsertion;

		// Selection
		int[] uSelection = { 1, 65, 5, -10, -5, 45, 22, 44, -7, 85 };
		int[] oSelection;
		
		// Shell
		int[] uShell = { 11, 5, 78, 15, 65, 2, 0, 444, 100, 4 };
		int[] oShell;
		
		printArray(uBubble);
		printArray(uInsertion);
		printArray(uSelection);
		printArray(uShell);

		oBubble =	Sort.Bubble(uBubble);
		oInsertion = Sort.Insertion(uInsertion);
		oSelection = Sort.Selection(uSelection);
		oShell = Sort.Shell(uShell);

		printArray("Bubble", oBubble);
		printArray("Insertion", oInsertion);
		printArray("Selection", oSelection);
		printArray("Shell", oShell);
	}

	// ToString
	public static void printArray(String sortType, int[] orderedArray) {
		// Displaying Ordered Array with type
		System.out.println("Ordered Array (" + sortType + " sort):");
		for (int elem : orderedArray) {
			System.out.print("[" + elem + "]");
		}
		System.out.print("\n\n");
	}

	public static void printArray(int[] Array) {
		// Displaying an Array
		for (int elem : Array) {
			System.out.print("[" + elem + "]");
		}
		System.out.print("\n\n");
	}

}
