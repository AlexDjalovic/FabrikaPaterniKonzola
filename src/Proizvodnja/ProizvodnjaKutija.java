package Proizvodnja;

import Osobe.Radnik;
import proizvodi.Kutija;


public class ProizvodnjaKutija extends Proizvodnja {

	private int kap;

	public ProizvodnjaKutija(Radnik r,int kapacitet){
		super(r);
		kap=kapacitet;
	}
	public ProizvodnjaKutija(){
		
	}
	@Override
	public Kutija proizvedi() {
		
		System.out.println("proizvedena kutija kapaciteta "+kap);
		Kutija k=new Kutija(kap);
		
		return k;
	}
	public int getKap() {
		return kap;
	}
	public void setKap(int kap) {
		this.kap = kap;
	}
	

}
