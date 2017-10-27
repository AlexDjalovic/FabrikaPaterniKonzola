package Osobe;

import preduzece.Preduzece;

public abstract class Zaposleni  {

	protected String ime;
	private Preduzece preduzece;

	public Zaposleni() {

	}
	public Zaposleni(String ime, Preduzece p) {
		this.ime = ime;
		preduzece = p;
	}
	public void promeniPreduzece(Preduzece p) {
		preduzece = p;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public Preduzece getPreduzece() {
		return preduzece;
	}
	public void setPreduzece(Preduzece preduzece) {
		this.preduzece = preduzece;
	}

}
