package ex1;

public class DéFacesAutres extends De {
	
	public DéFacesAutres(int nbfaces , String nom) {
		super(nbfaces,nom);
	}	
	//Si pair gagné si impair perdu
	public String Resultimpair() 
	{
	int leLancer=super.lancer();
	System.out.println(leLancer);
	if ( leLancer < getNbfaces()/4  ) 
	{
		return "Rouge";
	}
	else if (leLancer < getNbfaces()/2 )
	{
		return "Vert";
	}
	else if (leLancer < getNbfaces()/2+ getNbfaces()/4 )
	{
		return "Yellow";
	}
	else 
	{
		return "SUP";
	}
	}
	public String toString() {
		return super.toString()+"vous avez la couleur  " +Resultimpair();
	}
}
