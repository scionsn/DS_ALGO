/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author SCION
 */
public class ValidMountainArray{
	  public static boolean validMountainArray(int[] A) {
	        int count = 0;
	        boolean check = false;
	        
	        for(int i  =0;i < A.length&&i+1<A.length;i++){
	            if(A[i]< A[i + 1] ){
	                count++;
	            }
	            }
	        
	        if(count==0||count==A.length-1)
	            return false;
	        for(int i  =count;i < A.length&&i+1<A.length;i++){
	            if(A[i] <= A[i + 1] ){
return check;
}
	            }
	        check=true;
	        return check;
	    }
    public static void main(String[] args) {
     System.out.println("hello");
     int arr[]= {1,2,3,4,3,2,1};
     System.out.println(validMountainArray(arr));
    	}
    }

