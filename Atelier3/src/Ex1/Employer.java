package Ex1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Employer extends  Personne {
	
	private GregorianCalendar DateEmbauche ;
	private Double Salaire ;
	public static Calendar now = new GregorianCalendar();
	
	
	
	public Employer(String leNom, String lePrenom, GregorianCalendar laDate, Adresse lAdresse,GregorianCalendar DateEmbauche , int Salaire) {
		super(leNom, lePrenom, laDate, lAdresse);
		this.DateEmbauche = DateEmbauche ;
		this.setSalaire(Salaire) ; 
	}
	
	public Employer(String leNom, String lePrenom, int j, int m, int a, int numero, String rue, String code_postal,
			String ville,GregorianCalendar DateEmbauche , int Salaire) {
		super(leNom, lePrenom, j, m, a, numero, rue, code_postal, ville);
		this.DateEmbauche = DateEmbauche ;
		this.setSalaire(Salaire) ; 
	}
    public void setSalaire(double Salaire) { this.Salaire = Salaire; }


	public Double getSalaire() {
		return Salaire;
	}

}
