package Ex1;

import java.util.GregorianCalendar;

public class TEST {
	public static void main(String[] args)
	{
		Personne UnePersonne = new Personne (" Un ", "lePrenom", 6, 6, 0, 0, "rue", "20600","ville");
		Personne DeuxPersonne = new Personne (" Deux ", "lePrenom", 8, 666, 1, 1450, "rue", "20600","ville");
		Personne TroisPersonne = new Personne (" tROIS ", "lePrenom", 8, -600, 1, 2000, "rue", "20600","ville");
		System.out.println(Personne.getNbPersonne());
		System.out.println(Personne.plusAgee(UnePersonne,DeuxPersonne));
		System.out.println(UnePersonne.plusAgeeQue(TroisPersonne));
	
}
