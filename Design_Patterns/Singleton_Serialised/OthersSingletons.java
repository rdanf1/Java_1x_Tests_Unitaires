/*
 * Initiation hâtive/impatiente : Dans une initialisation hâtive, une instance d'une classe est créée bien avant qu'elle ne soit réellement requise. Cela se fait principalement au démarrage du système et c'est la méthode la plus simple pour créer une classe Singleton. */

class HativeSingleton {
    private static final HativeSingleton instance =
            new HativeSingleton();

    private HativeSingleton() { }

    private static HativeSingleton getInstance() {
        return instance;
    }
}

/*
 *
 *    Initiation paresseuse/tardive/patiente : En programmation informatique, l'initialisation paresseuse est la tactique consistant à retarder la création d'un objet, le calcul d'une valeur ou tout autre processus coûteux jusqu'à la première fois que cela est nécessaire.

    Dans un patron Singleton, l'initialisation paresseuse limite la création de l'instance jusqu'à ce qu'elle soit demandée pour la première fois
 *
 */

class TardiveSingleton {
    /**
     *  L'utilisation du mot clé volatile (Java 5+) permet d'éviter le cas où le tardiveSingleton.instance est non null
     */
    private static volatile TardiveSingleton instance = null;

    private TardiveSingleton() { }

    public static TardiveSingleton getInstance() {
        if (instance == null) {
            synchronized (TardiveSingleton.class) {
                instance = new TardiveSingleton();
            }
        }
        return instance;
    }
}

/*
 *
 *Thread Safe Singleton : C'est le moyen le plus simple de créer une classe Singleton. Il s'agit de synchroniser la méthode d'accès globale afin qu'un seul thread à la fois puisse exécuter cette méthode.
 *
 */
class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}

/*
 *
 *Verrouillage revérifié : Ce principe consiste à revérifier la variable d'instance dans un bloc synchronisé de la précédente approche pour résoudre le problème des systèmes multithreads et garantir qu'une seule instance d'une classe Singleton est créée.
 *
 */
class TardiveSingletonSync {
    /**
     *  L'utilisation du mot clé volatile (Java 5+) permet d'éviter le cas où le tardiveSingleton.instance est non null
     */
    private static volatile TardiveSingletonSync instance = null;

    private TardiveSingletonSync() { }

    public static TardiveSingletonSync getInstance() {
        if (instance == null) {
            synchronized (TardiveSingletonSync.class) {
                if (instance == null) {
                    instance = new TardiveSingletonSync();
                }
            }
        }
        return instance;
    }
}

/*
 *
 *Enum Java : Java garantit que toute valeur enum n'est instanciée qu'une seule fois dans un programme.
 *
 */
enum EnumSingleton {

    INSTANCE;
    
    public static void doSomething(){ ; }
}


