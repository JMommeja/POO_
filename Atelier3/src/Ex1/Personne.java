package Ex1;

import java.util.*;

public class Personne{
    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private final GregorianCalendar dateNaissance;
    private static int NbPersonne = 0 ;
    private Adresse adresse=ADRESSE_INCONNUE;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		NbPersonne ++;
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;		
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	public static int getNbPersonne(){
		return NbPersonne;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"PrŽnom : "+prenom+"\n"+
		"NŽ(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	public static String plusAgee(Personne P , Personne Q)
	{
		if (P.getDateNaissance().after(Q.getDateNaissance()))
		{
			return Q.getNom() + "est Plus vieux" ;
		}
		return P.getNom() + "Est plus vieux";
	}
	public  String plusAgeeQue(Personne Q)
	{
		if (this.getDateNaissance().after(Q.getDateNaissance()))
		{
			return Q.getNom() + "est Plus vieux" ;
		}
		return this.getNom() + "Est plus vieux";
	}
	public static boolean equals(Personne p, Personne p2){

        boolean isEqualNom = (p.getNom().equals(p2.getNom())) && (p.getPrenom().equals(p2.getPrenom())) && (p.getDateNaissance().equals(p2.getDateNaissance()));

        return isEqualNom;

    }
}

    
   
   
