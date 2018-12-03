//Activity Final 1
package fibona18;
import java.util.Scanner;
public class Fibona18 {
    
    static long f(int r){
    if ((r == 0) || (r == 1)){
    return r;
    } else {
        return f (r-1) + f (r-2);
        
    }
    
}
    public static void main(String[] args) {  
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter any Integer value");
        int a = sc.nextInt ();
        
        for (int b = 0; b <= a; b++){
        System.out.print ("f(" +b+ ") \t");
        } System.out.print("\n");
        
        for(int b = 0; b <= a; b++){
            for(int c = 0; c <= b; c++){
         System.out.print(f(b) + "\t");
          
             }System.out.print("\n");
        } 
    }
 }
    
    
