import java.util.Scanner;

//ACTIVITY #2 (Calculator)
public class calculator {
    
    public static void main(String[] ags) {
        Scanner toyi = new Scanner (System.in);
        System.out.println("Enter a number");
        int a = toyi.nextInt();
        System.out.println("Enter another number");
        int b = toyi.nextInt();
        System.out.println("Enter an operation");
        String o = toyi.next();
        
        switch (o) {
            case ("+"):
            case ("add"):
                System.out.println(a+b);
                break;
            case ("-"):
            case ("subtract"):
                System.out.println(a-b);
                break;
            case ("*"):
            case ("multiply"):
                System.out.println(a*b);
                break;
            case ("/"):
            case ("divide"):
                System.out.println(a/b);
                break;
            case ("%"):
            case ("modulo"):
                System.out.println(a%b);
                break;
                
            default:
                System.out.println("The number you've been entered is invalid");
                        
                        
                        
                        
                        
                       
    }
    }
}
