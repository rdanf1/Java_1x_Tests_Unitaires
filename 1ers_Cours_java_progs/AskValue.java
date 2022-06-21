/* DR - June 14 of year 2022 -

Use of Scanner Class transparently...

NB : Scanner.close() must be called at last use of the instance object !!!
     ( Sounds a bit weird to me, though I'm not familiar with Objects... )
*/

import java.util.Scanner;

public class AskValue {
    
    public static int integ (boolean lastScan) { 
        
        Scanner scannerObject = new Scanner(System.in);
      
        System.out.println("Type a number :");
        int n = scannerObject.nextInt();
        
        // Can't do this because with same instance/object of AskValue screw up next input...
        // scannerObject.close();
        // I mean it :
        if ( lastScan ) {
        //    System.out.println("Integer is the last ONE !!!"); // test purpose
            scannerObject.close();
        }
        
        return (Integer) n ;      
    }
    // Overloaded Method with no parameters
    public static int integ () { 
        // System.out.println("Integer is not LAST !!!"); // test purpose
        return AskValue.integ (false);
    }
    
    public static String strin (boolean lastScan) { 

        Scanner scannerObject = new Scanner(System.in);
      
        System.out.println("Type a string :");
        String s = scannerObject.next();
        
        // For this object/instance : see just above method...
        if ( lastScan ) scannerObject.close();
        
        return s ;
    }
    // Overloaded Method with no parameters
    public static String strin () { 
        return AskValue.strin (false);
    }
    
    public static String line (boolean lastScan) { 

        Scanner scannerObject = new Scanner(System.in);
      
        System.out.println("Type a line :");
        String s = scannerObject.nextLine();
        
        // For this object/instance : see just above method...
        if ( lastScan ) scannerObject.close();
        
        return s ;        
    }
    // Overloaded Method with no parameters (^^^ Keep focused ! ^^^)
    public static String line() {
        return AskValue.line (false); 
    }
       
}
