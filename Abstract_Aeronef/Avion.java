public class Avion extends Aeronef {
  public Avion(int numeroImmatriculation, String nomModele, 
               int nombrePlacesABord) {
    super(numeroImmatriculation, nomModele, nombrePlacesABord);
  }

  @Override
  public void decoller() {
    System.out.println("L'avion " + this.getNomModele()
                     + ", immatriculé " + this.getNumeroImmatriculation()
                     + ", roule sur la piste.");
    System.out.println("L'avion " + this.getNomModele()
                     + ", immatriculé " + this.getNumeroImmatriculation()
                     + ", quitte le sol.");
    System.out.println("L'avion " + this.getNomModele()
                     + ", immatriculé " + this.getNumeroImmatriculation()
                     + ", vient de décoller.");
  }

  @Override
  public void atterrir() {
    System.out.println("L'avion " + this.getNomModele() 
                     + ", immatriculé " + this.getNumeroImmatriculation()
                     + ", vient de regagner le sol.");
    System.out.println("L'avion " + this.getNomModele()
                     + ", immatriculé " + this.getNumeroImmatriculation()
                     + ", roule sur la piste.");
    System.out.println("L'avion " + this.getNomModele()
                     + ", immatriculé " + this.getNumeroImmatriculation()
                     + ", s'est arrêté.");
  }
}
