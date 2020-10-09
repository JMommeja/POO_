package tutoz;
import tutoz.Personne;

import java.util.ArrayList;

public class Univ  {
	 private String titre ;
	 private ArrayList<Personne> membre ;
	 private int nbPers;
	
	public Univ () {
		 this.titre =titre;
	     membre = new ArrayList<Personne>() ;	
	}
    public void ajouterPersonne(Personne p)
    {
        membre.add(p);
    }
    public void afficherMembres() {
        System.out.println("Université composé de :");
        for(Personne p:membre){
            p.sePresenter();
        }
    }

}
