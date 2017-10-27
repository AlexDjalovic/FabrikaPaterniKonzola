package Osobe;

import preduzece.Preduzece;
import preduzece.Zahtev;

public class Rukovodilac extends Zaposleni{

	private Radnik radnik;
	
	public Rukovodilac(){
		
	}
	public Rukovodilac(String ime,Preduzece p){
		super(ime,p);
	}
	
	public Rukovodilac(String ime,  Preduzece p,Radnik r) {
		super(ime, p);
		radnik=r;
	}

	public void neuspeh(Zahtev z){
		//ako su svi radnici zauzeti 
	}
	public void posaljiZahtev(int brojKutijaKojeTrebaNapraviti,int kapacitet,String vrsta){
		Zahtev z=new Zahtev(this, brojKutijaKojeTrebaNapraviti, kapacitet, vrsta);
		radnik.prihvatiZahtev(z);
	}
}
