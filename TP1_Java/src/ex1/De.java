package ex1;
import java.util.*;
import java.util.ArrayList;
public class De

{ 
	private static int nbde = 0 ;
	private static Random r = new Random();
	private int nbFaces ;
	private String nom ;
	public De (int Nbfaces , String nom) 
	{
		nbde ++;
		this.nom=nom;
		if (Nbfaces < 3 || Nbfaces > 120) 
		{
		  System.err.println("Out of position");
		}
		else
		{
			this.nbFaces = Nbfaces ;
			
		}
	}
	public De () 
	{		
			this.nbFaces = 6 ;
			System.out.println(nbFaces);
		
	}
	public De (int Nbfaces) 
	{
		if (Nbfaces < 3 || Nbfaces > 120) 
		{
		  System.out.println("Out of position");
		}
		else
		{
			this.nbFaces = Nbfaces ;
		
		}
	}
	public int getNbfaces() {return nbFaces;}
	public void setNbfaces(int Nbfaces) {Nbfaces = (this.nbFaces);}
	public String getnom() {return nom;}
	public void setnom(String nom) {nom = (this.nom);}
	
	
	public int lancer() 
		{
		int Nbaleatoire = r.nextInt(this.nbFaces) + 1;
		return Nbaleatoire ;
		}
	
	
	
	public int lancer(int nb) 
	{
		int valancer ;
		int max = 0;
		for (int i = 0; i < nb; i++) 
		{
			valancer = this.lancer(); 
			if (valancer>max)
			{
				max = valancer ;
			}
		}
		return max ;
	}
	
	public String toString() {
		return ("nom " +  this.nom + " nbfaces " + this.nbFaces  );
	}
}