public class CompteBancaireBuilder {
    private long numeroDeCompte; // Obligatoire
    private String proprietaireDuCompte;
    private String succursale;
    private double soldeDuCompte;
    private double tauxDInteret;

    private CompteBancaireBuilder() {
    }

    public static void main(String[] args) {
        CompteBancaireBuilder compte = new CompteBancaireBuilder.Monteur(34L)
                .duProprietaireDuCompte("Joel")
                .deLaSuccursale("Montpellier")
                .duSoldeDuCompe(5000)
                .duTauxDInteret(2.5)
                .monteur();
        CompteBancaireBuilder autreCompte = new CompteBancaireBuilder.Monteur(75L)
                .duProprietaireDuCompte("Jean")
                .deLaSuccursale("Paris")
                .duSoldeDuCompe(1000)
                .duTauxDInteret(2.2)
                .monteur();
        System.out.println(compte.toString());
        System.out.println(autreCompte.toString());
    }

    @Override
    public String toString() {
        return "Monteur{" +
                "numeroDeCompte=" + numeroDeCompte +
                ", proprietaireDuCompte='" + proprietaireDuCompte + '\'' +
                ", succursale='" + succursale + '\'' +
                ", soldeDuCompte=" + soldeDuCompte + " euros" +
                ", tauxDInteret=" + tauxDInteret + " %" +
                '}';
    }

    private static class Monteur {
        private final long numeroDeCompte; // Obligatoire
        private String proprietaireDuCompte;
        private String succursale;
        private double soldeDuCompte;
        private double tauxDInteret;

        public Monteur(long numeroDeCompte) {
            this.numeroDeCompte = numeroDeCompte;
        }

        public Monteur duProprietaireDuCompte(String proprietaireDuCompte) {
            this.proprietaireDuCompte = proprietaireDuCompte;
            return this; // En renvoyant le constructeur à chaque fois, nous pouvons créer une interface fluide.
        }

        public Monteur deLaSuccursale(String succursale) {
            this.succursale = succursale;
            return this;
        }

        public Monteur duSoldeDuCompe(double soldeDuCompte) {
            this.soldeDuCompte = soldeDuCompte;
            return this;
        }

        public Monteur duTauxDInteret(double tauxDInteret) {
            this.tauxDInteret = tauxDInteret;
            return this;
        }

        public CompteBancaireBuilder monteur() {
            CompteBancaireBuilder compte = new CompteBancaireBuilder();
            compte.numeroDeCompte = this.numeroDeCompte;
            compte.proprietaireDuCompte = this.proprietaireDuCompte;
            compte.succursale = this.succursale;
            compte.soldeDuCompte = this.soldeDuCompte;
            compte.tauxDInteret = this.tauxDInteret;
            return compte;
        }
    }
}
