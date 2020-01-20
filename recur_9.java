
package ds_algo;
//
//pattern:-
//*
//**
//***
//****
public class recur_9 {
  
     static void printrow(int num) 
{ 
    // base case 
    if (num == 0) 
        return; 
    System.out.print ("* "); 
  
    // recursively calling printn() 
    printrow(num - 1); 
} 
  
// function to print the pattern 
static void pattern(int n, int i) 
{ 
    // base case 
    if (n == 0) {
       return;}
    printrow(i); 
    System.out.println(); 
  
    // recursively calling pattern() 
    pattern(n - 1, i +1); 
} 
  
    public static void main(String[] args) {
      pattern(5,1);
    }
 
}
