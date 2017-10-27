package Proizvodnja;

import Osobe.Radnik;
import proizvodi.Proizvod;

public abstract class Proizvodnja {

	protected Radnik radnik;
	
	public Proizvodnja(Radnik r){
		radnik=r;
	}
	public Proizvodnja(){
		
	}
	public abstract Proizvod proizvedi();
}
