public class TestUnitaire {
	
	public static void main(String[] args) {
	
		JourSemaine jour = JourSemaine.LUNDI;
		
		System.out.print(jour + " : ");
		System.out.print(jour.getMatiere() + ", ");
		System.out.println(jour.getProf());
		
		// La surcharge ( les Profs sont tous des Nos...
		
		JourSemaine jour_repos1 = JourSemaine.SAMEDI;
		
		System.out.print(jour_repos1 + " : ");
		System.out.print(jour_repos1.getMatiere() + ", ");
		System.out.println(jour_repos1.getProf_int());
		
		JourSemaine jour_repos2 = JourSemaine.DIMANCHE;
		
		System.out.print(jour_repos2 + " : ");
		System.out.print(jour_repos2.getMatiere() + ", ");
		System.out.println(jour_repos2.getProf_int());
	
	/*    Exo suivant... */
	/* plus tard... transposition en <NiveauSonore.{variable tableau}> comment ?!..    
	       enum TableauDesNiveauxSonores = {  
	        			       "INFRASONORE",
	                                       "BAS",
	                                       "NORMAL",
	                                       "FORT",
	                                       "TRES_FORT",
	                                       "ULTRASONORE"
	                                    }; 
	                                      
	        for ( String Niv : TableauDesNiveauxSonores ) {     */                      
		
		NiveauSonore niveauDuSon = NiveauSonore.NORMAL;
		System.out.print(niveauDuSon + " : ");
		System.out.println(niveauDuSon.getDefinition() + "!!");
				
	}

}
