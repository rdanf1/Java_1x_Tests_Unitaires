import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InversedSort {
    static class Tri {
        public static void triInverse(List<String> liste, boolean bool) {
            if (bool) {
                /* DR inversed sort : */
                Collections.sort(liste, (s1, s2) -> s2.compareTo(s1));
            } else { 
            	Collections.sort(liste);
                /* Equivalence du tri normal (function or lambda calcul du .sort !! : */
                // Collections.sort(liste, (s1, s2) -> s1.compareTo(s2));
              }
        } 
    }

    public static void main(String[] args) {
        List<String> joueursList = new ArrayList<>();

        joueursList.add("Messi");
        joueursList.add("Ronaldo");
        joueursList.add("Zidane");
        joueursList.add("Neymar");
        joueursList.add("Henry");
        joueursList.add("Adriano");
        joueursList.add("Pélé");
        joueursList.add("Benzema");
        joueursList.add("Drogba");
        
        System.out.println("Liste des joueurs stockés tels quels dans une liste");
        joueursList.forEach(System.out::println);

        Tri.triInverse(joueursList, true);
        System.out.println("Liste des joueurs triés inversement / par odre lexicographique décroissant");
        joueursList.forEach(System.out::println);

        Tri.triInverse(joueursList, false);
        System.out.println("Liste des joueurs triés / par odre lexicographique croissant");
        joueursList.forEach(System.out::println);

    }
}
