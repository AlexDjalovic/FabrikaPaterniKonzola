package preduzece;

import java.util.ArrayList;
import java.util.List;

import Osobe.Zaposleni;

public abstract class Preduzece {

	protected String naziv;
	protected List<Zaposleni>zaposleni;
	public Preduzece(String n){
		naziv=n;
		zaposleni=new ArrayList<Zaposleni>();
	}
	public abstract void zaposli(Zaposleni z);
	public abstract void otpusti(Zaposleni z);
		
	
}
