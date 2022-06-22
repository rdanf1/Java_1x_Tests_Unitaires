import java.util.Scanner;

public class MainForTestingGame {

    public static void joue(){
        var jeu = new TwoDicesGameOddEven();
        while (jeu.getPieceJoueur()>=0) {
            System.out.println("Il vous reste " + jeu.getPieceJoueur() + " pièces.");
            System.out.println("Voulez vous parier pair (0) ou impair (1)");
            var myInput = new Scanner(System.in);
            var paris = myInput.nextInt();
            jeu.joue(paris);
        }
    }

    public static void main(String[] args) {
       joue();
    }
}

