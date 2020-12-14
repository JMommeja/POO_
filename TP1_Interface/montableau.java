package uno;

public class montableau implements EstComparable{
	
	public int[] tableau;

	public montableau(int[] tableau) {
		this.tableau=tableau;
	}

	@Override
	public int compareA(Object o) {
		int somm1=0;
		int somm2=0;
		int res=0;
		if (o instanceof montableau)
		{
			for (int i = 0; i<this.tableau.length -1 ;i++) {
				somm1+=this.tableau[i];
			}
			for (int j = 0; j<((montableau)o).tableau.length -1 ;j++) {
				somm2+=((montableau)o).tableau[j];
			}
		}
		if(somm1<somm2) {
			res=1;
		}else if (somm1>somm2) {
			res=-1;
		}
		return res;
	}

}
