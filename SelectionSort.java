
public class SelectionSort {
	
	public SelectionSort()
	{
		
	}
	
	
	static void selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			int lowest = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[j] < arr[lowest])
				{
					lowest = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[lowest];
			arr[lowest] = temp;
		}
	}

}
