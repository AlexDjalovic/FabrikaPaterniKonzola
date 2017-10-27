package proizvodi;

public class Kutija implements Proizvod{

	private int popunjenost;
	private Proizvod[]punjenje;
	
	public Kutija(int kapacitet){
		punjenje=new Proizvod[kapacitet];
	}
	@Override
	public String getNaziv() {
		// TODO Auto-generated method stub
		return "kutija ";
	}

	public boolean dodaj(Proizvod p) {
		if (!puna()) {
			punjenje[popunjenost++] = p;
			return true;
		} else
			return false;

	}
	public boolean puna(){
		if(punjenje.length==popunjenost)return true;
		return false;
	}
}
