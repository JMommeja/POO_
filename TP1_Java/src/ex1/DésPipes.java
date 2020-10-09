package ex1;

import java.util.Random;

public class DésPipes extends De {
	
	private int valmin = 0;
	public DésPipes(int valmin ,int nbfaces , String nom) {
		super(nbfaces,nom);
	
		this.valmin = valmin;
	}
	public int lancer() 
	{
		int RdmNbaleatoire=(super.lancer());
		 while (RdmNbaleatoire < valmin)
		  {
			  RdmNbaleatoire=(super.lancer());
		  }
	return RdmNbaleatoire;
		}
	
	public String toString() {
		return super.toString()+ "valmin " + valmin;
	}
	}