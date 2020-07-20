//Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
public class RemDupFromSortedArr {
public static int meth(int arr[]) {
	int index=1;
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]!=arr[i+1]) {
			arr[index++]=arr[i+1];
		}
		
	}
	for(int i:arr) {
		System.out.println(i);
	}
	return index;
//	the arr from index 0 to the value of index has become unique
//	in this example the first three elements have become uniq.

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,2,2,3};
System.out.println(meth(arr));
	}

}
