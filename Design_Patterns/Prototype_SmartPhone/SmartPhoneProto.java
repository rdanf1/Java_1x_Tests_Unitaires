public class SmartPhoneProto {
    public static void main(String[] args) throws CloneNotSupportedException {

        SmartPhone note20 = new Samsung("Note20");
        SmartPhone iphone12 = new Apple("IPhone12");
        SmartPhone huaweiP40 = new Huawei("HuaweiP40");
        SmartPhone nokia8 = new Nokia("Nokia8");

        System.out.println(note20);
        System.out.println(iphone12);
        System.out.println(huaweiP40);
        System.out.println(nokia8);

        System.out.println("===> Version Pro <===");

        SmartPhone iphone12Pro = iphone12.clone();
        iphone12Pro.setPrixAdditionnel(250);
        System.out.println(iphone12Pro);

        SmartPhone huaweiP40Pro = huaweiP40.clone();
        huaweiP40Pro.setPrixAdditionnel(100);
        System.out.println(huaweiP40Pro);
    }

    public abstract static class SmartPhone implements Cloneable {
        private String modele;
        private int prix;
        private int prixAdditionnel = 0;

        public String getModele() {
            return modele;
        }

        public void setModele(String modele) {
            this.modele = modele;
        }

        public int getPrix() {
            return prix + this.prixAdditionnel;
        }

        public void setPrix(int prix) {
            this.prix = prix;
        }

        public void setPrixAdditionnel(int prixAdditionnel) {
            this.prixAdditionnel = prixAdditionnel;
        }

        public SmartPhone clone() throws CloneNotSupportedException {
            return (SmartPhone) super.clone();
        }

        @Override
        public String toString() {
            return "Smartphone{" +
                    "modele='" + getModele() + '\'' +
                    ", prix=" + getPrix() + " euros " +
                    ", prixAdditionnel=" + prixAdditionnel + " euros " +
                    '}';
        }
    }

    public static class Samsung extends SmartPhone {
        public Samsung(String model) {
            this.setPrix(850);
            this.setModele(model);
        }

        @Override
        public SmartPhone clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static class Apple extends SmartPhone {
        public Apple(String model) {
            this.setPrix(900);
            this.setModele(model);
        }

        @Override
        public SmartPhone clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Huawei extends SmartPhone {
        public Huawei(String model) {
            this.setPrix(700);
            this.setModele(model);
        }

        @Override
        public SmartPhone clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Nokia extends SmartPhone {
        public Nokia(String model) {
            this.setPrix(500);
            this.setModele(model);
        }

        @Override
        public SmartPhone clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }
}
