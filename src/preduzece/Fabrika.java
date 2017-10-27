package preduzece;

import Osobe.Zaposleni;

public class Fabrika extends Preduzece{

	private Skladiste skl;
	public Fabrika(String n,Skladiste s) {
		super(n);
		skl=s;
	}

	@Override
	public void zaposli(Zaposleni z) {
		// TODO Auto-generated method stub
		zaposleni.add(z);
	}

	@Override
	public void otpusti(Zaposleni z) {
		// TODO Auto-generated method stub
		for(Zaposleni zap:zaposleni){
			if(zap.getIme().equalsIgnoreCase(z.getIme())){
				zaposleni.remove(z);
			}
		}
	}

}
