import java.util.Arrays;
public class InsertionSort {
	public static void insertionSort(int arr[], int n) {
		//the time complexity for this algorithm is O(n*n) because of the two loops 
		//the for loop will be called n times from 1 to n, and for every time the for loop is called,
		//the while  loop in worst case will decrement from n-1 to 0 hence O(n*n)
		//the auxilliary space is O(1) because of the temporary variable needed for holding arr elements  before inserting 
		for(int i = 1 ; i < n; i++) {//outer loop starting from 1 because the first element is assumed
			                          // to be sorted
		int temp = arr[i]; // a temporary storage to hold arr[i]
		int j = i - 1;     // variable for nested while loop for comparisons
		while(j >= 0 && arr[j]>temp) { //while j >= 0 and arr[j] is greater than arr[i] in temp
		arr[j + 1] = arr[j];   // then in next position - arr[j+1] store arr[j]
		j--; // decrement j , until you find the right position for arr[i] in temp
	}
		arr[j+1] = temp; //when temp is holding the smallest element in the array,
	                     //then the while loop will run until j is equals to zero
			             //before exiting the loop , j will be decremented to -1, 
			            //then the while loop will be called again
			            //but now j will not be greater or equals to zero as per the condition given
			           //so the control will exit that loop and at arr[j+1] which is  arr[-1+1] 
			           //which is same as arr[0] we store temp value
			          //in case where arr[j] is less than temp , then the control will exit the
			         //the while loop and store temp one position after arr[j] which is arr[j+1] 
					             
			}
		}
// example driver code
	public static void main(String[] args) {
		int n = 6;
		int arr [] = {5,4,10,1,6,2};
		insertionSort(arr,n);
		System.out.println(Arrays.toString(arr));
		// TODO Auto-generated method stub

	}

}

