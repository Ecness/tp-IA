package tp.ia;

public class Taquin {
	
	private int[][] cases;
	private Taquin nextTaquin;
	private int caseBougee;
	private int taille;
	

	public Taquin(int taille) {
		this.setTaille(taille);
		cases = new int[taille][taille];
		setNextTaquin(null);
		setCaseBougee(0);
	}
	
	private void addTaquin(Taquin taquin, int caseBougee) {
		setNextTaquin(taquin);
		this.setCaseBougee(caseBougee);

	}
	
	
	
	
	
	public int[][] getCases() {
		return cases;
	}

	public void setCases(int[][] cases) {
		this.cases = cases;
	}

	public Taquin getNextTaquin() {
		return nextTaquin;
	}

	public void setNextTaquin(Taquin nextTaquin) {
		this.nextTaquin = nextTaquin;
	}

	public int getCaseBougee() {
		return caseBougee;
	}

	public void setCaseBougee(int caseBougee) {
		this.caseBougee = caseBougee;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	@Override
	public boolean equals(Object object) {
		int[][] casesToCompare = ((Taquin)object).getCases();
		
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				if (cases[i][j] != casesToCompare[i][j]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
