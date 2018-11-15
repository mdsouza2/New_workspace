import java.util.*;

public class HeapSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements to be inputted:");
		int nums = input.nextInt();
		int array[] = new int[nums];
		for(int i=0;i<nums;i++) {
			System.out.print("Next element:");
			array[i] = input.nextInt();
		}
		HeapSort hp = new HeapSort();
		System.out.println("Heap Sorted array is:"+Arrays.toString(hp.sort(array)));
	}
	int[] sort(int[] arr) {
		int n=arr.length;
		for(int i=(n/2)-1;i>=0;i--) {
			this.heapify(arr, i, n);
		}
		for(int i=n-1;i>=0;i--) {
			this.swap(arr, 0, i);
			this.heapify(arr, 0, i);
		}
		return arr;
	}
	void heapify(int[] arr, int i, int n) {
		int largest = i;
		int left = 2*i+1;
		int right = 2*i+2;
		if(left<n && arr[left]>arr[largest])
			largest = left;
		if(right<n && arr[right]>arr[largest])
			largest = right;
		if(largest!=i) {
			this.swap(arr, largest, i);
			this.heapify(arr, largest, n);
		}
	}
	void swap(int[] arr, int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
		
	}

}
