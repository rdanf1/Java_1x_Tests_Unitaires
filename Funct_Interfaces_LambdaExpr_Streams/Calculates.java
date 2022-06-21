public class Calculates {

    public static void main(String[] args) {

        // Avec la déclaration de type (parameters are the same)
        Calculatrice addition = Integer::sum;

        // DR - Adding 1 parameter making sum a special substraction with full lambda expression
        // Implies New FI : Calculator ( can be simpliflied perhaps with a Constructor )  
        Calculator addition2 = (x, y, z) -> Integer.sum(x+z, -y-z); 
        
        // Sans déclaration de type
        Calculatrice soustraction = (x, y) -> x - y;

        // Avec l'instruction 'return' et les accolades
        Calculatrice multiplication = (int x, int y) -> {
            return x * y;
        };

        //sans 'return' et sans les accolades
        Calculatrice division = (int x, int y) -> x / y;

        System.out.println("L'addition: 10 + 5 = " + calculer(10, 5, addition));
        System.out.println("La soustraction: 10 - 5 = " + calculer(10, 5, soustraction));
        System.out.println("La multiplaction: 10 x 5 = " + calculer(10, 5, multiplication));
        System.out.println("La division: 10 / 5 = " + calculer(10, 5, division));

        System.out.println("L'addition2: 10, 5, 3 = " + calculate(10, 5, 3, addition2));
    }

    private static int calculer(int x, int y, Calculatrice op) {
        return op.calc(x, y);
    }

    private static int calculate(int x, int y, int z, Calculator op) {
        return op.calc(x, y, z);
    }

    @FunctionalInterface
    public interface Calculatrice {
        int calc(int x, int y);
    }

    @FunctionalInterface
    public interface Calculator {
        int calc(int x, int y, int z);
    }
}
