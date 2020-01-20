
package ds_algo;

/**output:-
 * 
 **
 ***
 ****
 *****
 ****
 ***
 **
 *
 */
public class recur_15 {
  static void printrow(int num) 
{ 
    if (num == 0) 
        return; 
    System.out.print ("* "); 
    printrow(num - 1); 
}  
static void printpattern(int n, int i) 
{ 
    if (n == 0) {
        return; }
    printrow(i); 
    System.out.println(); 
    if(n>6){
    printpattern(n - 1, i +1); 
    }
    else{
        printpattern(n-1,i-1);
    } 
}

    public static void main(String[] args) {
printpattern(10,1);        
    }
}
