package com.sortingarrays.model;

public abstract class Sort {

	// -Bubble sort
	public static int[] Bubble(int[] unsortedArray) {
		int[] intArray = unsortedArray;

		// Bubble sort
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for (int i = 0; i < lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[i + 1]) {
					swap(intArray, i, i + 1);
				}
			}
		}

		return intArray;

	}

	// Insertion Sort
	public static int[] Insertion(int[] unsortedArray) {
		int[] intArray = unsortedArray;
		for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
			int newElement = intArray[firstUnsortedIndex];

			int i;

			for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
				intArray[i] = intArray[i - 1];
			}

			intArray[i] = newElement;
		}
		return intArray;
	}

	// Selection sort
	public static int[] Selection(int[] unsortedArray) {
		int[] intArray = unsortedArray;
		for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

			int largest = 0;

			for (int i = 1; i <= lastUnsortedIndex; i++) {
				if (intArray[i] > intArray[largest]) {
					largest = i;
				}
			}

			swap(intArray, largest, lastUnsortedIndex);

		}

		return intArray;
	}

	// Swaping element
	public static void swap(int[] array, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
