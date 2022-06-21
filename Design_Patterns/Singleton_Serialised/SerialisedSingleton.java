import java.lang.annotation.Annotation;
// import java.io.Serial;
import java.io.Serializable;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.*;
import java.lang.annotation.*;

public class SerialisedSingleton implements Serializable {
    private volatile static SerialisedSingleton instance = null;

    public static SerialisedSingleton getInstance() {
        if (instance == null) {
            instance = new SerialisedSingleton();
        }
        return instance;
    }

    /* @Serial //-- DR - ISSUE N°00000002 -- 
     * "Cannot find symbol" BUT IT WORKS WITHOUT ANNOTATION "@Serial"..
     */
    protected Object readResolve() {
        return instance;
    } 

    private int year = 2022;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    static SerialisedSingleton premiereInstance = SerialisedSingleton.getInstance();

    public static void main(String[] args) throws IOException {
        /* Serialisation dans un fichier */
        try (ObjectOutput output = new ObjectOutputStream(
                new FileOutputStream("fichierPerso.ser"));
            ObjectInput input = new ObjectInputStream(
                    new FileInputStream("fichierPerso.ser"))
        ) {

            output.writeObject(instance);
            premiereInstance.setYear(2021);

            SerialisedSingleton deuxiemeInstance = (SerialisedSingleton) input.readObject();

            System.out.println("La première année ==> " + premiereInstance.getYear());
            System.out.println("la deuxième année ==> " + deuxiemeInstance.getYear());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

