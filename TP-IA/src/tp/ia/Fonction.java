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
	
	
	public void rechercheAEtoile( List<Taquin> listTaquinPossible, Taquin taquinPrecedent) {
		
		int i,j;
		for (Taquin taquin : listTaquinPossible) {
			for(i=0;i<taquin.getTaille();i++) {
				for(j=0;j<taquin.getTaille();j++) {
					if(taquin.getCase(i,j)==0) {
						if(i>0){
							taquin.setCase(i, j, taquin.getCase(i-1, j));
							taquin.setCase(i-1, j, 0);
						}
					}
				}
			}
			
			
		}
	}
}
