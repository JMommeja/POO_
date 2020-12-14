package src;

public class Testciterne {

	public static void main(String[] args) {
		Citerne A = new Citerne(1000,0, Liquide.EAU);
        Citerne B = new Citerne(5000,500, Liquide.HUILE);
        Citerne W = new Citerne(5000,500, Liquide.HUILE);
      //  Citerne C = new Citerne(10,22000, Liquide.VIN); Erreur 
        A.ajouterLiq(66); // 0 + 66 = 66
        A.enleverLiq(33); //66 - 33 = 33
        A.enleverLiq(67); // remplissage invalide
        A.toString();
        System.out.println(A);
        System.out.println(W.equals(B));
        System.out.println(W.equals(A));
        
	}
}
