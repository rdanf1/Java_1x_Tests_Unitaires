import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsAndMethods {
    public static void main(String[] args)  {

        // Création de la liste des entiers
        List<Integer> number = Arrays.asList(2,3,4,5);

        // illustration avec la méthode map( )
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        // Création de la liste des String
        List<String> names =
                Arrays.asList("Reflection","Collection","Stream");

        // illustration avec la méthode filter( )
        List<String> result = names.stream().filter(s->s.startsWith("S")).
                collect(Collectors.toList());
        System.out.println(result);

        // Illustration avec la méthode sorted( )
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // Création de la liste des entiers
        List<Integer> numbers = Arrays.asList(8,3,4,5,4,2);

        // Illustration avec la méthode collect( ) qui retourne un set
        Set<Integer> squareSet =
                numbers.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // Illustration avec la méthode forEach( )
        number.stream().map(x->x*x).forEach(System.out::println);

        // Illustration avec la méthode sorted( )
   //     int even =
        System.out.println("**DR BEWARE HERE : "
                         + "intermediate stream method .filter takes only even values");
        System.out.println("  (equals 0 when mod 2)");
        System.out.println("** I mean formerly 0 in .reduce was only a start of sums offset...");
        System.out.println(
          "** before making a total of sums using pairs from Integer list of evens."
                          );

        System.out.println("vvvvvvvv The evens filtered (below) vvvvvvvv");
        numbers.stream().filter(x->x%2==0).forEach(System.out::println);; //.reduce(0, Integer::sum);
        System.out.println("vvvvvvvv .reduce in action starting with 100 + ... (below) vvvvvvvv");        
        int number2 = numbers.stream().filter(x->x%2==0).reduce(100, Integer::sum);
        System.out.println("This is 100 + [Sum of pairs of even above] : \n" + number2);
    }
}
