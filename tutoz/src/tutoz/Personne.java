package tutoz;

public abstract class Personne
{
	public static final double SMIC = 1219 ;
	private String nom ;
	private String adresse;
	private double salaire ; 
	public static String defautLoc = " " ; 
	private static double MasseSaL = 0 ; 
	private static int nbpersonne  = 0 ; 
	
	public Personne (String nom,String adresse,double salaire) 
	{	
		nbpersonne ++ ; 
		this.nom = nom ;
		this.salaire = salaire ; 
		this.adresse = adresse ;
		MasseSaL=this.salaire  + MasseSaL;
	}
	public Personne (String nom,double salaire) 
	{	
		this(nom,defautLoc,salaire) ; 
	}
	
	abstract void sePresenter();

	public int getnbpersonne() {
		return nbpersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
		
	public double getSalaire() {
			return salaire;
		}
		
	public void setSalaire(double salaire)
	{
		if (salaire > 1000 )
		{
			this.salaire = salaire;
			MasseSaL=this.salaire  + MasseSaL;
		}
		else 
		{
			this.salaire = SMIC;
			MasseSaL=this.salaire  + MasseSaL;
		}
	}
	public void afficher() 
	{
	System.out.println(" nom= " + this.getNom() + " adresse= " + this.getAdresse() + " salaire= " +  this.salaire);		
	}
	public String toString() 
	{
	return (" nom= " + this.getNom() + " adresse= " + this.getAdresse() + " salaire= " +  this.salaire);		
	}
	public static void afficherMassSal() 
	{
		if (getMasseSaL() == 0) {
			System.out.println("Pas d'emploier / revenue");	
		}
		else 
		{
			System.out.println(getMasseSaL());
		}		
	}
	public void changerAdresse(String NouvAdr) 
	{
	 this.setAdresse(NouvAdr);	
	}
	public double salaireAnnuel()
	{
		return (salaire*12);
	}
	public boolean estSup1K()
	{
		return (this.salaire > 1000);
	}		
	public static double Salairemoy()
	{
		return (getMasseSaL()/nbpersonne) ; 
	}
	public static double getMasseSaL() {
		return MasseSaL;
	}
}
