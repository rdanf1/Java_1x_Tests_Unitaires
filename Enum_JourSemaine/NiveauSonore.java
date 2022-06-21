public enum NiveauSonore {

	INFRASONORE("On n'entend plus rien !"),
	BAS        ("On entend à peine !"),
	NORMAL     ("C'est bon, on entend !"),
	FORT       ("C'est un peu gênant !"),
	TRES_FORT  ("On a mal aux oreilles !"),
	ULTRASONORE("On n'entend plus rien !");

        private String definition;

	private NiveauSonore(String definition) {
		this.definition = definition;
	};
	
	public String getDefinition () {
		return definition;
	};
	
	public void setDefinition (String definition) {
		this.definition = definition;
	};

}
