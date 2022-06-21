public class MonProg {
	
	public static void main(String[] args) {
	
	  Aeronef[] listeAeronefs = new Aeronef[3];
	
	  listeAeronefs[0] = new Avion(1, "A321", 300);
	  listeAeronefs[1] = new Avion(2, "Boeing 720", 120);
	  listeAeronefs[2] = new Helico(3, "Helico 2021", 4);
	
	  for(Aeronef a : listeAeronefs) {
		a.decoller();
		System.out.println("--");
		a.atterrir();
		System.out.println("--");
		System.out.println("--");
	  } 
	}
}
