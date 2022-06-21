import org.junit.jupiter.api.Test;
/* DR
import static org.junit.jupiter.api.Assertions.*;
/* 
/* OR MORE SPECIFICALLY : */
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/* WRONG IDEA :
//import org.junit.jupiter.api.AssertFalse; // NOT PUBLIC
*/

class TwoDicesGameTests {

    TwoDicesGameOddEven jeu = new TwoDicesGameOddEven();

    @org.junit.jupiter.api.Test
    void deLance() {

        int r = jeu.deLance();
        assertTrue(r>=0 && r<7);
  
    }

    @org.junit.jupiter.api.Test
    void resultat() {

        boolean r1 = jeu.resultat(1,1, 0);
        boolean r2 = jeu.resultat(1,1, 1);

        boolean r3 = jeu.resultat(1,2, 0);
        boolean r4 = jeu.resultat(1,2, 1);

        boolean r5 = jeu.resultat(4,2, 0);
        boolean r6 = jeu.resultat(4,2, 1);

        assertFalse(r1);
        assertFalse(r2);

        assertFalse(r3);
        assertTrue(r4);

        assertFalse(r6);
        assertTrue(r5);
    }

    @org.junit.jupiter.api.Test
    void testResultat() {
        assertDoesNotThrow( () -> jeu.resultat(0));
    }

    @org.junit.jupiter.api.Test
    void joue() {
        assertDoesNotThrow( () -> jeu.joue(0));
    }

    @org.junit.jupiter.api.Test
    void gain() {
        int init = jeu.getPieceJoueur();
        jeu.gain(true);
        assertEquals( init+1, jeu.getPieceJoueur());
        jeu.gain(false);
        assertEquals( init, jeu.getPieceJoueur());
    }

}
