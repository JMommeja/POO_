package ex1;

import java.util.Random;

public class D�sPipes extends De {
	
	private int valmin = 0;
	public D�sPipes(int valmin ,int nbfaces , String nom) {
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