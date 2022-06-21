class MonProgramme {

public static void main(String[] args) {
    futur("je", "partir", "réussir", "gagner", "rêver");
    futur(false, "il", "mentir", "voler");
}

public static void futur(boolean affirmatif, String personne, String... verbes) {
    
    String suffixe;
    
    switch(personne) {
    	case "je":
        suffixe = "ai";
        break;
        
    	case "tu":
        suffixe = "as";
        break;
        
    	case "il":
    	case "elle":
    	case "on":
        suffixe = "a";
        break;
    	
    	case "nous":
        suffixe = "ons";
        break;
    	
    	case "vous":
        suffixe = "ez";
        break;
    	
    	case "ils":
    	case "elles":
        suffixe = "ont";
        break;
        
        default: //Personne incorrecte : on considère que c'est "MOI !"
        personne = "Moi, je";
        suffixe = "ai";
    }
    
    String debutPhrase = personne + " "; 
    if(!affirmatif) {
    	debutPhrase += "ne ";
    	suffixe += " pas";
    }
    
    for(String verbe : verbes) {
    	System.out.println(debutPhrase + verbe + suffixe);
    }
}

public static void futur(String personne, String...verbes) {
    futur(true, personne, verbes);
}

}

