
public class HIndex {
//	O(log N) approach using binary search
public static int hIndex(int[] citations){
        int i=0;
        int j=citations.length-1;
      int len  =citations.length;
       while(i<=j) {
    	 int  mid=i+(j-i)/2;
    	 if(citations[mid]==len-mid) {
    		 return len-mid;
    	 }
    	 else if(citations[mid]>len-mid) {
    		 j=mid-1;
    	 }
    	 else
    		 i=mid+1;
    	 
       }
       
       return len-i;
    }
//O(N) approach
public static int hIndexanother(int[] citations){
  int i=0;
int  len=citations.length;
  while(i<len&&len-i>citations[i]) {
	  i++;
  }
  return len-i;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,1,3,5,6};
		System.out.println("h index is:-"+hIndex(arr));
		System.out.println("h index is:-"+hIndexanother(arr));
		
	}

}
