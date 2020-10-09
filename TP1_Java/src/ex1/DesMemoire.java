package ex1;

public class DesMemoire extends De {
	int Der_Val = 0 ;
	
	public int lancer(int nb) {
		int RdmNbaleatoire = 0;
		for (int i = 0; i < nb; i++)
		
		{
			RdmNbaleatoire=super.lancer();
			if (RdmNbaleatoire == Der_Val)
			 {
				System.out.println(RdmNbaleatoire);
				System.out.println("2 d'affilé");
			 }
			 else {
				  Der_Val = RdmNbaleatoire ; 
				 System.out.println(RdmNbaleatoire);
			 }
		}
		return RdmNbaleatoire;		
	}
}
