import java.util.Arrays;
import java.util.HashMap;
//We know that we need to transform the input array to the new array (temp) in the minimum number of swaps.
//Make a map that stores the elements and their corresponding index, of the input array.
//
//So at each i starting from 0 to N in the given array, where N is the size of the array:
//
//1. If i is not in its correct position according to the sorted array, then
//
//2. We will fill this position with the correct element from the hashmap we built earlier. 
//We know the correct element which should come here is temp[i], so we look up the index of
//this element from the hashmap. 
//
//3. After swapping the required elements, we update the content of the hashmap accordingly,
//as temp[i] to the ith position, and arr[i] to where temp[i] was earlier.
public class MinSwapsToSortArr {
//	hashmap contains the iindex of every elemtn in input array.
//	we sort temp
	public static int minSwaps(int[] arr)
	{
		int N=arr.length;
		int ans = 0;
		int[] temp = Arrays.copyOfRange(arr, 0, N);
		HashMap<Integer, Integer> h
		= new HashMap<Integer, Integer>();

		Arrays.sort(temp);
		for (int i = 0; i < N; i++) 
		{
			h.put(arr[i], i);
		}
		for (int i = 0; i < N; i++) 
		{

			if (arr[i] != temp[i]) 
			{
				ans++;
				int val = arr[i];

				swap(arr, i, h.get(temp[i]));

				h.put(val, h.get(temp[i]));
				h.put(temp[i], i);
			}
		}
		return ans;
	}
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		int arr[]= {3,1,8,9};
		System.out.println(minSwaps(arr));
	}

}
