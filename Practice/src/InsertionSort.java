import java.util.*;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements for array:");
		int nums = input.nextInt();
		int array[] = new int[nums];
		for(int i=0;i<nums;i++) {
			System.out.print("Next element:");
			array[i] = input.nextInt();			
		}
		System.out.println("Current array is:"+Arrays.toString(array));
		InsertionSort insert = new InsertionSort();
		insert.sort(array);
		System.out.print("Sorted array is:");
		insert.printArray(array);
	}
	void sort(int[] arr) {
		int n = arr.length;
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}

}
