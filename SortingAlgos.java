/*
 * Sorting algos in Java
 *
 */


public class SortingAlgos
{
	public static void printArray(int[] a)
	{
		for(int i = 0; i < a.length; i++)
		{
			System.out.printf( "[%d]%-2d  ",i , a[i]);
		}
		System.out.println();
	}

	public static int[] clone(int[] a)
	{
		int[] x = new int[a.length];
		for(int i = 0; i < a.length; i++)
		{	x[i] = a[i];
		}
		return x;
	}

	public static void selectionSort(int[] a)
	{
		int currentIndex = 0;
		while( currentIndex < a.length - 1 )
		{
			int smallestIndex = currentIndex;
			int smallestValue = a[smallestIndex];
			int checkIndex	  = smallestIndex + 1;
			while( checkIndex < a.length )
			{
				if(a[checkIndex] < smallestValue)
				{
					smallestIndex = checkIndex;
					smallestValue = a[checkIndex];
				}
				checkIndex++;
			}
			a[smallestIndex] = a[currentIndex];
			a[currentIndex] = smallestValue;
			currentIndex++;
			System.out.print("\t");
			printArray(a);
		}
	}

	public static void bubbleSort(int[] a)
	{
		int i = a.length;
		boolean swap = true;
		while (swap){
			int j =0;
			swap = false;
			while (j < i-1){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swap = true;
				
					}
					//if(j == j+1){
						//break;
					//}
					j++;
				}
				i = i-1;
				for(int i2 = 0; i2 < a.length; i2++){
				System.out.print(a[i2]+" ");
				}
				System.out.println();
			}		
		}

	public static void insertionSort(int[] a)
	{
		int i = 1;
		int e = a.length;
		int temp = 0;
		int j;
		while (i < e){
			temp = a[i];
			j = i-1;
			while (j >= 0 && a[j] > temp){
				a[j+1] = a[j];
				j = j-1;
				}
				a[j+1] = temp;
				i = i+1;
			}
		// To be done in class. Refer to sorting_algos_SL.pdf
	}

	public static void main (String[] args)
	{
		int[] original = { 12, 7, 14, 9, 5, 3 };
		int[] selection = clone(original);
		int[] bubble = clone(original);
		int[] insert = clone(original);
		System.out.println("\nOriginal array:");
		printArray(original);
		System.out.println("\nSelection sort:");
		selectionSort(selection);
		System.out.println("\nFinal result:");
		printArray(selection);
		System.out.println("\nBubble sort:");
		bubbleSort(bubble);
		System.out.println("\nFinal result:");
		printArray(bubble);
		System.out.println("\nInsertion sort:");
		insertionSort(insert);
		System.out.println("\nFinal result:");
		printArray(insert);
		
		
	}
}
