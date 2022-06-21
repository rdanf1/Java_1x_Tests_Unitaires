// Externals...
// import java.util.Scanner;

class MonProg2 {

  public static void main(String[] args) {
  
      /* display arguments passed to MonProg2 when launched :
          ie : 
             $ java MonProg2 "je" "tu" "il" "nous" "vous" "ils"
          outputs :
             6
             je,tu,il,nous,vous,ils 
             tu partiras
             tu réussiras
             tu gagneras
             tu rêveras
      */
      
      // Number of arguments passed
      System.out.println(args.length) ;
      
      // Browse and display args
      for (String s : args) System.out.print(s + ",") ;
      
      // Print backspace then a point:"." to remove last comma 
      System.out.print("\b" + ".") ;
      // Carriage return ( end of line )
      System.out.println("") ;
      
      /* 
          Creating an instance of MonProgramme defined elsewhere...
          (Class in other file with same name : MonProgramme.java )
          NB : It is compiled within MonProg2.java compilation 
               => Generates MonProg2.class but previously MonProgramme.java
      */
       
      MonProgramme monProgramme = new MonProgramme () ;
      
      // args[1] is actually the 2d parameter of MonProg2 in runtime
      monProgramme.futur(args[1], "partir", "réussir", "gagner", "rêver");       
      
      MyGeometry maGeometry = new MyGeometry () ;
      
      maGeometry.drawRectangle( 4 , args.length + 1 ) ;
      
      AskValue myAskValue = new AskValue () ;


      Integer i1 = myAskValue.integ() ;
      String  s1 = myAskValue.strin() ;
      String  s2 = myAskValue.line() ;
      // String  s2 = myAskValue.line(true); : this was a big mistake (not "big mustach...")
      /* Beware as told by "Higlander's" : There must be only ONE last "true" !!!
           (if not that's an issue !!!)     */
      Integer i2 = myAskValue.integ(true) ; // When "true" sent to garbage I presume...
      
      // More tests after truth above !!!
      // Be careful : Even with another fresh Object instance, Scanner's remains .closed...
      // myAskValue = null;
      // myAskValue = new AskValue () ;
      // Integer i3 = myAskValue.integ() ;
      /* The ERRORS output (at runtime) :
      Type a number :
      Exception in thread "main" java.util.NoSuchElementException
	at java.base/java.util.Scanner.throwFor(Scanner.java:937)
	at java.base/java.util.Scanner.next(Scanner.java:1594)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
	at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        ...
      */
      /* External use : =====>>>>>>> SAME ERRORS as above listed !!!
      Scanner scannerObject = new Scanner(System.in);
      System.out.println("Type a number 2 :");
      int n = scannerObject.nextInt();
      */  
      
      System.out.println("Les entiers : " + i1 + " ET " + i2);
      
  //    String s2 = myAskValue.string ;

 //     s1 = "Merde," ;
 //     String s2 = " va Chier !!!" ;
      
      String[] strTab = { s1 , s2 } ;

      Simulator mySimulator = new Simulator () ;
      // Passing parmeters successfully to Simulator Class's Object !!!
      //   ( I DIDN'T changed main method into it with saisie method ) 
      mySimulator.main( strTab );
      
      // Student class with Sample of Constructor in it !
      Student meStudent = new Student();
      // main Overloaded without parameters !!!
      meStudent.main();
      
  }
}
