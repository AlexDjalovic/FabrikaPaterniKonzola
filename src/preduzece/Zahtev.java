package preduzece;

import Osobe.Rukovodilac;

public class Zahtev {

	private Rukovodilac rukovodilac;
	private int brojKutijaKojeTrebaNapraviti;
	private int kapacitet;
	private String vrsta;
	
	
	public Zahtev(Rukovodilac rukovodilac, int brojKutijaKojeTrebaNapraviti, int kapacitet, String vrsta) {
		super();
		this.rukovodilac = rukovodilac;
		this.brojKutijaKojeTrebaNapraviti = brojKutijaKojeTrebaNapraviti;
		this.kapacitet = kapacitet;
		this.vrsta = vrsta;
	}


	public Rukovodilac getRukovodilac() {
		return rukovodilac;
	}
	public void setRukovodilac(Rukovodilac rukovodilac) {
		this.rukovodilac = rukovodilac;
	}
	public int getBrojKutijaKojeTrebaNapraviti() {
		return brojKutijaKojeTrebaNapraviti;
	}
	public void setBrojKutijaKojeTrebaNapraviti(int brojKutijaKojeTrebaNapraviti) {
		this.brojKutijaKojeTrebaNapraviti = brojKutijaKojeTrebaNapraviti;
	}
	public int getKapacitet() {
		return kapacitet;
	}
	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	
	
	
	
	
	
	
	
	
}
