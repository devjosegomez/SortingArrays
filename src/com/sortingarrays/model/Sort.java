package com.sortingarrays.model;

public class Sort {
	//Methods
	// -Bubble sort
	public static int[] Bubble (int[] unsortedArray) {
		int [] intArray = unsortedArray;

        //Bubble sort
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0;
                lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }
        
        return intArray;
        
    }
    
    //Swaping element
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
}
