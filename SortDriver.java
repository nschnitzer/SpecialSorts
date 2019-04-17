//***************************************************
// Nathan Schnitzer
// SortDriver.java
//4/17/19
//***************************************************

import java.util.Arrays;
import java.util.Random;


public class SortDriver {

	public static void main(String[] args) 
	{
		Random gen = new Random();
		int[] unSortedArray = new int[10];
		int[] tester = new int[10];
		int[] tester2 = new int[10];
		int[] tester3 = new int[10];
		for (int i = 0; i < unSortedArray.length; i++)
		{
			unSortedArray[i] = gen.nextInt(100);
			tester[i] = gen.nextInt(100);
			tester2[i] = gen.nextInt(100);
			tester3[i] = gen.nextInt(100);
		}
		System.out.println("QUICK SORT:");
		System.out.println(Arrays.toString(unSortedArray));
		QuickSort.quickSort(unSortedArray);
		System.out.println(Arrays.toString(unSortedArray));
		System.out.println();
		
		
		System.out.println("BUBBLE SORT");
		System.out.println(Arrays.toString(tester));
		BubbleSort.bubbleSort(tester);
		System.out.println(Arrays.toString(tester));
		System.out.println();
		
		System.out.println("SELECTION SORT");
		System.out.println(Arrays.toString(tester2));
		SelectionSort.selectionSort(tester2);
		System.out.println(Arrays.toString(tester2));
		System.out.println();
		
		System.out.println("INSERTION SORT");
		System.out.println(Arrays.toString(tester3));
		InsertionSort.insertionSort(tester3);
		System.out.println(Arrays.toString(tester3));

		
		
	}

}
