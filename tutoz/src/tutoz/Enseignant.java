
package tutoz;

public class Enseignant extends Personne {

	private int nbheure ; 
	public Enseignant(String nom,String adresse, double salaire, int nbheure) {
		super(nom,adresse,salaire);
		this.nbheure=nbheure;
		// TODO Auto-generated constructor stub
	}

	@Override
	void sePresenter() {
		// TODO Auto-generated method stub
		System.out.println(this.getNom() + "est enseignant et a " + this.nbheure + "heure");
	}
}
