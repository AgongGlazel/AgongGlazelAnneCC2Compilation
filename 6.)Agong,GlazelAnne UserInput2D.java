
package array2d;
import java.util.Scanner;
public class Array2d {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter row size : ");
        int row = sc.nextInt () ;
        System.out.println("Enter column size: ");
        int column = sc.nextInt () ;
        
        String zelnina [][] = new String [row] [column];
        
        
        for(int g = 0; g < row; g++) {
            
            for( int z = 0; z < column; z++) {
                System.out.println("Row: " + g + " Column: " + z + ": ");
                String c = sc.next ();
                zelnina[g][z] = c;   
            
            }
        }
        System.out.println("\n");
        System.out.println("Two Dimentional Array:");
        for (int d = 0; d < row ; d++) {
         
            System.out.print("Row" + d + ":" + "\t");
               
                for (int a = 0; a < zelnina[d].length; a++) {
                System.out.print(zelnina [d][a] + "\t");    
                
            }  System.out.print("\n"); 
         }   
      }
   }

