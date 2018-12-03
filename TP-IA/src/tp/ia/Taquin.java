package tp.ia;

public class Taquin {
	
	private int[][] cases;
	private Taquin nextTaquin;
	private int caseBougee;
	

	public Taquin(int taille) {
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
}
