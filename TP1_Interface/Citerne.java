package src;

import java.time.LocalDate;

public class Citerne {

	static int compt=0;
	int capacite  ;
	LocalDate mise_en_serv ;
	int qte_Liq ;
	int numero ; 
	Liquide liquide ;
	
	public Citerne(int capacite,int qte_Liq,Liquide liquide) {
		checkcapcite(capacite);
		this.capacite = capacite ;
		this.qte_Liq=qte_Liq;
		this.mise_en_serv = LocalDate.now();
		this.liquide = liquide ;
		compt ++ ; 
		this.numero = compt ;
		checkqte(qte_Liq);
	}
	public void checkcapcite (int capacite) 
	{
		if (capacite > 20000 || capacite <= 0) 
		{
			throw new IllegalArgumentException ("capacite invalide");
		}
	}
	public void checkqte (int qte_Liq) 
	{
		if (qte_Liq > this.capacite || qte_Liq < 0 ) 
		{
			throw new IllegalArgumentException ("quantite invalide");
		}
	}
	public void nettoyage () 
	{
		qte_Liq=0;
	}
	public void setqte_Liq (Liquide liquide) 
	{
		if (qte_Liq != 0) 
		{
			throw new ExecptionLiquideIllegal ("pas nettoye");
		}
		else 
		{
			this.liquide = liquide ;
		}
	}
	public static Citerne plusancienne (Citerne a , Citerne b) 
	{
		Citerne res = null ;
		if (a.mise_en_serv.isBefore(b.mise_en_serv))
		{
			res = b;
		}
		else 
		{
			res = a ;
		}
		return res ;
	}	
	@Override
    public String toString() {
        return ("Citerne " + this.numero + ", " + this.liquide + ", capacite : " + this.capacite +
                " mise_en_serv : " + this.mise_en_serv + ", qte_Liq : " + this.qte_Liq);

    }
	@Override
    public boolean equals(Object o) {
		boolean res = false;
	
       if (o instanceof Citerne && (((Citerne)o).capacite==this.capacite && ((Citerne)o).mise_en_serv.equals(this.mise_en_serv)
    		   && ((Citerne)o).qte_Liq==this.qte_Liq))
       {
    	   res = true ;
       }
       	return res ;
	}
	public void ajouterLiq (int qte) 
	{
		if (qte + this.qte_Liq <= this.capacite && qte > 0) 
		{
			this.qte_Liq = qte + this.qte_Liq ;
		}
		else 
		{
			throw new IllegalArgumentException ("Remplissage invalide");
		}
	}
	public void enleverLiq (int qte) 
	{
		if (this.qte_Liq  - qte >= 0 && qte > 0) 
		{
			this.qte_Liq = this.qte_Liq - qte ;
		}
		else 
		{
			throw new IllegalArgumentException ("Remplissage invalide");
		}
	}	
	
}

