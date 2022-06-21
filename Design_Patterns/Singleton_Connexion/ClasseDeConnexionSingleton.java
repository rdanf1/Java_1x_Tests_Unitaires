import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.mariadb.jdbc.Driver;

/**
 *  la classe est final car un singleton n'est pas censé avoir d'héritier
 */
final class ClasseDeConnexionSingleton {

    /**
     *  L'utilisation du mot clé volatile (Java 5+) permet d'éviter le cas où le notreSingleton.instance est non null
     */
    private static volatile ClasseDeConnexionSingleton instance;
    private Connection connection;

    /**
     * La présence d'un constructeur privé supprime le constructeur public par défaut.
     *  De plus, seul le singleton peut s'instancier lui-même.
     */
    private ClasseDeConnexionSingleton() throws SQLException {
        try {
     //     Class.forName("org.mysql.Driver");
            Class.forName("org.mariadb.jdbc.Driver");
            String username = "root";
            String password = "RootyB33I1F0";
     //       String url = "jdbc:mysql://localhost/test_db?PermitMysqlScheme";
            String url = "jdbc:mariadb://localhost/test_db";
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    /**
     *  Méthode permettant de renvoyer une instance de notre classe Singleton
     */
    public static ClasseDeConnexionSingleton getInstance() throws SQLException {
        if (instance == null) {
            instance = new ClasseDeConnexionSingleton();
        } else if (instance.getConnection().isClosed()) {
            instance = new ClasseDeConnexionSingleton();
        }
        return instance;
    }
    
    public static void main(String[] args) throws SQLException, 
	                                          InterruptedException {
        try {
        ClasseDeConnexionSingleton connexion = ClasseDeConnexionSingleton.getInstance();
	System.out.println("Nothing wrong with the DB connection String !!!");
	Thread.sleep(1000);
	System.out.println("Nothing wrong with Thread.sleep(1000) !!!");
	Thread.sleep(4000);
	System.out.println("Nothing wrong with Thread.sleep(4000) either !!!");
	} catch (SQLException ex) {
            System.out.println("Something's wrong on DB connection String : "
			      + ex.getMessage());
	} catch (InterruptedException ex) {
            System.out.println("Something's wrong within Thread.sleep Thing :"
			      + ex.getMessage());
	}
    } 
/*    public static void main(String[] args) throws InterruptedException, SQLException {
        
        ClasseDeConnexionSingleton connexion = ClasseDeConnexionSingleton.getInstance();
	Thread.sleep(1000);
	System.out.println("Nothing wrong with the DB connection String !!!");
	Thread.sleep(4000);
    } */
}
