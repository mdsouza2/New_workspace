import java.util.*;
import java.util.Arrays;

public class BubbleSort {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of elements in arrays:");
		int nums = input.nextInt();
		int arr[] = new int[nums];
		for(int i=0;i<nums;i++) {
			System.out.print("Next element:");
			arr[i] = input.nextInt();
		}
		System.out.println("Current array is:"+Arrays.toString(arr));
		BubbleSort bs = new BubbleSort();
		bs.sort(arr);
		System.out.print("Bubble Sorted array is:");
		bs.printArray(arr);
		
	}
	void sort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}	
			}
		}
	}
	void printArray(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++)
			System.out.print(" "+arr[i]);
		}
	}

