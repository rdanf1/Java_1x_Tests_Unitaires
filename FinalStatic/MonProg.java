
public class MonProg {
    public static void main(String[] args) {
        // final String maVariable  = "une variable finale" ;
        
        /*public static*/ final String MAVARSTATIC = "une variable statiqueE";
        // String maVariable = maVariable2;
        
        System.out.println("println var final & static done !" + MAVARSTATIC + ", " + MAVARSTATIC);
        
        FinalStaticVar finalStatic = new FinalStaticVar(); 
        
        System.out.println("new FinalStaticVar() done !");
                                  
        System.out.println("finalStatic :" + finalStatic);       
        System.out.println("finalStatic.getString() :" + finalStatic.getString());

        FinalStaticVar finalStatic2 = new FinalStaticVar();
        System.out.println("new FinalStaticVar() Number 2 done !");
        
        System.out.println(FinalStaticVar.getString());
        
    }
}
