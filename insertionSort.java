import java.util.Arrays;

public class insertionSort {
	public static void main (String []args) {
		int arr[] = {16,9,13,4}; // the original array 
		System.out.println("the original array is : " + Arrays.toString(arr)); // printing the original array 
		for(int i = 1; i<arr.length;i++) { // iterating through the array from (i = 0) because the first element is always at its sorted position
			int key = arr[i]; // this variable holds the element/key  to sort throughout the array
			 int j = i-1; // 
		
		if (j >=0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j = j-1;
		} 
			arr[j+1] = key ;
			
		}
		System.out.println("the sorted array is : " + Arrays.toString(arr));
	}

	}

