//******************************************************
// Nathan Schnitzer
// QuickSort.java
// 4/17/19
//******************************************************


public class QuickSort 
{
	public QuickSort()
	{

	}


	public static void quickSort(int[] arr)
	{
		int low = 0;
		int high = arr.length-1;

		if (low < high)
		{
			int part = partition(arr, low, high);

			sort(arr, low, part-1);
			sort(arr, part+1, high);
		}
	}
	
	private static void sort(int[] arr, int low, int high)
	{
		if (low < high)
		{
			int part = partition(arr, low, high);

			sort(arr, low, part-1);
			sort(arr, part+1, high);
		}
	}

	private static int partition(int[] arr, int low, int high)
	{
		int pivot = arr[high];
		int i = low-1;

		for (int k = low; k < high; k++)
		{
			if (arr[k] <= pivot)
			{
				i++;

				//swap
				int temp = arr[i];
				arr[i] = arr[k];
				arr[k] = temp;

			}
		}

		//swap
		int temp = arr[i+1];
		arr[i+1] = arr[high];
		arr[high] = temp;

		return i+1;
	}

}
