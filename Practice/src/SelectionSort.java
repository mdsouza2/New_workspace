import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {67,34,45,87,65,55,90};
		System.out.println("Current array is: "+Arrays.toString(arr));
		SelectionSort ob = new SelectionSort();
		ob.sort(arr);
		System.out.print("Selection Sorted array:");
		ob.printArray(arr);
		int target = 90;
		int low = 0;
		int high = arr.length;
		while(low<high) {
			int mid = (low+high)/2;
			if(arr[mid]==target) {
				System.out.print("\nElement "+target+" found at index:"+mid);
				break;}
			else if(arr[mid]>target)
				high = mid-1;
			else if(arr[mid]<target)
				low = mid+1;
		}
		if (low>=high)
			System.out.println("\nElement not found");
	}
	void sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			int min_idx = i;
			for(int j=i+1;j<n;j++) {
				if(arr[min_idx]>arr[j])
					min_idx=j;
				}
			int temp=arr[min_idx];
			arr[min_idx]=arr[i];
			arr[i]=temp;
			
			}
		}
	void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.print(" "+arr[i]);
		}
	}
		
	}

