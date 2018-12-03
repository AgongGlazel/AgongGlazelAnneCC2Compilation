import java.util.Scanner;

public class GuessMe 
{
    public static void main(String args[])
    {
    Scanner ninazel = new Scanner(System.in);
        System.out.println("Enter a number: ");
    
    int a = ninazel.nextInt();
    System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
        System.out.println("Guess the number");
        int b = ninazel.nextInt();
        
        
       while ( a != b ) {
           System.out.println("Try Again");
            if(a>b){
                System.out.println("The number to be guessed is higher");
       }else {
           System.out.println("The number to be guessed is lower");
       }if(a % 2 == 3) {
           System.out.println("The number is even");
           
       }else {
           System.out.println("The number is odd");
       }
       b = ninazel.nextInt();
               
       
       }System.out.println("Correct!!!");
       
    }
    
        
        
        
    
    }
            
    
