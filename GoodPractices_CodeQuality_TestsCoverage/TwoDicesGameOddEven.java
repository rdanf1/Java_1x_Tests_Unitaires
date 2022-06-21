
import java.util.Random;
import java.lang.Math; // Math.abs() for the call, or ISSUE with abs() so...

public class TwoDicesGameOddEven {
    Random r = new Random();

    private int pieceJoueur = 10;

    public int deLance(){
        int res = Math.abs(r.nextInt()%6);
        System.out.println("le dé lancé a fait " + res);
        return res;
    }


    public boolean resultat(int de1, int de2, int parisImpair){//renvoie faux si le joueur perd, vrai sinon. parisImpair vaut 1 si impair, 0 si Pair
        if (de1==de2){
            return false;
        } else {
            return (de1+de2)%2==parisImpair;
        }
    }

    public boolean resultat( int parisImpair){
        return resultat(deLance(), deLance(), parisImpair);
    }


    public int getPieceJoueur() {
        return pieceJoueur;
    }

    public void joue(int paris){
        gain(resultat(paris));
    }

    public void gain(boolean victoire){
        if(victoire){
            pieceJoueur++;
        } else {
            pieceJoueur--;
        }
    }
}

