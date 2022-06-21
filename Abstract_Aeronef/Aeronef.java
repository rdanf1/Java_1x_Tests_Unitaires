public abstract class Aeronef {
	private long numeroImmatriculation;
	private String nomModele;
	private int nombrePlacesABord;
	
	public Aeronef(int numeroImmatriculation, String nomModele, int nombrePlacesABord) {
		this.numeroImmatriculation = numeroImmatriculation;
		this.nomModele = nomModele;
		this.nombrePlacesABord = nombrePlacesABord;
	}

	public long getNumeroImmatriculation() {
		return numeroImmatriculation;
	}

	public void setNumeroImmatriculation(long numeroImmatriculation) {
		this.numeroImmatriculation = numeroImmatriculation;
	}

	public String getNomModele() {
		return nomModele;
	}

	public void setNomModele(String nomModele) {
		this.nomModele = nomModele;
	}

	public int getNombrePlacesABord() {
		return nombrePlacesABord;
	}

	public void setNombrePlacesABord(int nombrePlacesABord) {
		this.nombrePlacesABord = nombrePlacesABord;
	}
	
	public abstract void decoller();
	
	public abstract void atterrir();
}

