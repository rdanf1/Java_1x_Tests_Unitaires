public enum JourSemaine {
	LUNDI("Mathématiques", "Monsieur FASOLA"), 
	MARDI("Philosophie", "Madame RICO"), 
	MERCREDI("Anglais", "Madame ZION"), 
	JEUDI("Physique", "Monsieur NEMAR"), 
	VENDREDI("Informatique", "Monsieur PARD"), 
	SAMEDI("Repos", 1), 
	DIMANCHE("Repos", 2);
	
	private String matiere;
	private String prof;
        // DR surcharge !
	private int prof_int;
	
	JourSemaine(String matiere, String prof) {
		this.matiere = matiere;
		this.prof = prof;
	}

	JourSemaine(String matiere, int prof_int) {
		this.matiere = matiere;
		this.prof_int = prof_int;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

	public String getProf() {
		return prof;
	}
	
	public void setProf(String prof) {
		this.prof = prof;
	}
		
	public int getProf_int() {
		return prof_int;
	}
	
	public void setProf_int(int prof_int) {
		this.prof_int = prof_int;	
	}
	
}
