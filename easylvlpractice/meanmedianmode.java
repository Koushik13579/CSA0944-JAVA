package easylvlpractice;
import java.util.Scanner;
public class meanmedianmode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int len = s.nextInt();
		System.out.println("Enter "+len+" elements of array: ");
		int[] arr = new int[len];
		for(int i=0;i<len;i++) {
			arr[i]=s.nextInt();
		}
		double mean = 0;
		for(int i=0;i<len;i++) {
			mean+=arr[i];
		}
		mean = mean/len;
		int mid = len/2;
		double median = 0;
		if(len%2==1) {
			median = arr[mid];
		}
		else {
			median = (arr[mid-1]+arr[mid])/2.0;
		}
		int freq=0;
		int count = 0;
		int val = 0;
		for(int i=0;i<len;i++) {
			count = 0;
			for(int j=0;j<len;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>freq) {
				freq = count;
				val = arr[i];
			}
		}
		System.out.println("Mean: "+mean);
		System.out.println("Median: "+median);
		System.out.println("Mode: "+val);
	}
}
