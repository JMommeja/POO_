package uno;

public class main {

	public static void main(String[] args) {
		int[] a = new int[] {1,2,3,4,88888};
		int[] b = new int[] {-1,2,-3,4,5,666};
		montableau m1=new montableau(a);
		montableau m2=new montableau(b);
		System.out.println(m1.compareA(m2)); //Affiche 1, //car 1+2+3+4 > -1+2-3+4+5
	}

}
