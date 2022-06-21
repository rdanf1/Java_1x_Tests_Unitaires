public class Demo {

    public static void main(String[] args) {

        Vetement nike = FabriqueVetement.getVetement(new NikeFabriqueAbstraite());

        Vetement adidas = FabriqueVetement.getVetement(new AdidasFabriqueAbstraite());

        Vetement Jordan = FabriqueVetement.getVetement(new JordanFabriqueAbstraite());

    }

    public abstract static class VetementFabriqueAbstraite {

        abstract Vetement creerPanierVetement();

    }

    public abstract static class Vetement {

        public abstract void getShirt();

        public abstract void getSurvet();

        public abstract void getBasket();

    }

    static class FabriqueVetement {

        public static Vetement getVetement(VetementFabriqueAbstraite fabrique) {

            return fabrique.creerPanierVetement();

        }

    }

    static class NikeFabriqueAbstraite extends VetementFabriqueAbstraite {

        @Override

        Vetement creerPanierVetement() {

            Vetement panier = new Nike();

            panier.getShirt();

            panier.getSurvet();

            panier.getBasket();

            return panier;

        }

    }

    static class AdidasFabriqueAbstraite extends VetementFabriqueAbstraite {

        @Override

        Vetement creerPanierVetement() {

            Vetement panier = new Adidas();

            panier.getShirt();

            panier.getSurvet();

            panier.getBasket();

            return panier;

        }

    }

    static class JordanFabriqueAbstraite extends VetementFabriqueAbstraite {

        @Override

        Vetement creerPanierVetement() {

            Vetement panier = new Jordan();

            panier.getShirt();

            panier.getSurvet();

            panier.getBasket();

            return panier;

        }

    }

    static class Nike extends Vetement {

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

    static class Adidas extends Vetement {

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

    static class Jordan extends Vetement {

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

}
