package tutoz;

public class Etudiant extends Personne {

	private String numetud ;

	public Etudiant(String nom, String adresse, double salaire , String numetud) 
	{
		super(nom, adresse, salaire);
		this.numetud = numetud ;
	}
	public String toString() 
	{
		return super.toString() + "NB ETUD " + this.numetud;
	}
	@Override
	void sePresenter() {
		// TODO Auto-generated method stub
		System.out.println(getNom() + "est etudiant et j'ai code " + this.numetud );
		
	}
}
