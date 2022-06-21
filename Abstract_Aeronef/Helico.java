public class Helico extends Aeronef {
 public Helico(int numeroImmatriculation, String nomModele, 
                    int nombrePlacesABord) {
   super(numeroImmatriculation, nomModele, nombrePlacesABord);
 }

 @Override
 public void decoller() {
   System.out.println("L'hélicoptère " + this.getNomModele()
                    + ", immatriculé " + this.getNumeroImmatriculation()
                    + ", fait tourner son hélice.");
   System.out.println("L'hélicoptère " + this.getNomModele()
                    + ", immatriculé " + this.getNumeroImmatriculation()
                    + ",  monte et quitte le sol.");
 }

 @Override
 public void atterrir() {
   System.out.println("L'hélicoptère " + this.getNomModele()
                    + ", immatriculé " + this.getNumeroImmatriculation()
                    + ", descend jusqu'au sol.");
   System.out.println("L'hélicoptère " + this.getNomModele()
                    + ", immatriculé " + this.getNumeroImmatriculation()
                    + ", arrête de faire tourner son hélice.");
 }

}
