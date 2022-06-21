public abstract class VetementFactory {

    public static void main(String[] args) {
        FabriqueVetementFactory panier = new FabriqueVetementFactory();
        VetementFactory nike = panier.creerPanierVetementFactory("Nike");
        VetementFactory adidas = panier.creerPanierVetementFactory("Adidas");
        VetementFactory jordan = panier.creerPanierVetementFactory("Jordan");
        VetementFactory dan = panier.creerPanierVetementFactory("Daniel");
    }

    public abstract void getShirt();

    public abstract void getSurvet();

    public abstract void getBasket();

    static class Nike extends VetementFactory {
        @Override
        public void getShirt() {
            System.out.println("Ajoutez un T-Shirt dans le panier de vêtement Nike!");
        }

        @Override
        public void getSurvet() {
            System.out.println("Ajoutez un Survet dans le panier de vêtement Nike!");
        }

        @Override
        public void getBasket() {
            System.out.println("Ajoutez un Basket dans le panier de vêtement Nike!");
        }
    }

    static class Adidas extends VetementFactory {
        @Override
        public void getShirt() {
            System.out.println("Ajoutez un T-Shirt dans le panier de vêtement Adidas!");
        }

        @Override
        public void getSurvet() {
            System.out.println("Ajoutez un Survet dans le panier de vêtement Adidas!");
        }

        @Override
        public void getBasket() {
            System.out.println("Ajoutez un Basket dans le panier de vêtement Adidas!");
        }
    }

    static class Jordan extends VetementFactory {
        @Override
        public void getShirt() {
            System.out.println("Ajoutez un T-Shirt dans le panier de vêtement Jordan!");
        }
        @Override
        public void getSurvet() {
            System.out.println("Ajoutez un Survet dans le panier de vêtement Jordan!");
        }

        @Override
        public void getBasket() {
            System.out.println("Ajoutez un Basket dans le panier de vêtement Jordan!");
        }
    }
    
    static class FabriqueVetementFactory {
	   public static VetementFactory creerPanierVetementFactory (String vetement) {

	    /*	DR - ISSUE NO 0000000001 - SWITCH SYNTAX ERRORS ?!..
	        VetementFactory panier = switch (vetement) {
	            case "nike" -> new Nike();
	       		case "adidas" -> new Adidas();
	        	case "jordan" -> new Jordan();
	        	default : throw new IllegalArgumentException("Pas de vetement de ce modèle");
	    	}; 
	    */
	    	// DR CODE OK
	    	VetementFactory panier;
	    	switch (vetement) {
	    		case "Nike"   : { panier = new Nike();   break; }
	       		case "Adidas" : { panier = new Adidas(); break; }
	        	case "Jordan" : { panier = new Jordan(); break; }
	        	default       : { throw new IllegalArgumentException("Pas de vetement..."); }	    		
	        };
	        
	    	panier.getShirt();
	    	panier.getSurvet();
	    	panier.getBasket();

		    return panier;
	    }
 	}            
}

