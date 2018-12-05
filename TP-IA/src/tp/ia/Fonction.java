package tp.ia;

import java.util.ArrayList;
import java.util.List;

public class Fonction {

	private List<Taquin> listTaquin;
	private Taquin taquin;
	private Taquin taquinfinal;
	private int nb;
	
	public Fonction(Taquin t, Taquin t2) {
		this.listTaquin = new ArrayList<Taquin>();
		listTaquin.add(t);
		taquin = t;
		taquinfinal = t2;
	}
	
	public void rechercheAEtoile(Taquin taquinPossible, Taquin taquinPrecedent) {
		
		int i,j;
		Taquin prochaintaquin = null;
		if(taquinPossible!=null) {
			if(!taquinPossible.equals(taquinPrecedent)) {
				for(i=0;i<taquinPossible.getTaille();i++) {
					for(j=0;j<taquinPossible.getTaille();j++) {
						if(taquinPossible.getCase(i,j)==0) {
							if(i>0){
								prochaintaquin = taquinPossible;
								prochaintaquin.setCase(i, j, prochaintaquin.getCase(i-1, j));
								prochaintaquin.setCase(i-1, j, 0);
								if(!listTaquin.contains(prochaintaquin)) {
									listTaquin.add(prochaintaquin);
									rechercheAEtoile(prochaintaquin, taquinPossible);									
								}
							}
							if(i<taquinPossible.getTaille()-1) {
								prochaintaquin = taquinPossible;
								prochaintaquin.setCase(i, j, prochaintaquin.getCase(i+1, j));
								prochaintaquin.setCase(i+1, j, 0);
								if(!listTaquin.contains(prochaintaquin)) {
									listTaquin.add(prochaintaquin);
									rechercheAEtoile(prochaintaquin, taquinPossible);									
								}
							}
						}
					}	
				}
				
			}
		}
	}
}
