package OddEvenArrayTableAgong;
/**
 *
 * @author cc2_1d-39
 */
public class OddEvenArrayTableAgong {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     
     int nbr[] = {3 ,9 ,15 ,20 ,65 ,23 ,18 ,4 ,2 ,14 };
     
    
     
     int[] odd = new int[nbr.length];
     int[] even = new int[nbr.length];
     
     int oddn = 0;
     int evenn = 0;
     
     for (int n = 0; n< nbr.length; n++){
     
     if (nbr[n]% 2==0){
         even [evenn]=nbr[n];
         evenn++;
                 
         
     }else{
         odd[oddn] = nbr[n]; 
         oddn++;
         
     }
     }
    
      System.out.println("Odd \t Even");
         for (int n = 0; n < oddn; n++){
        System.out.println(odd[n] +"\t"+ even[n]);
         }
    }
}
