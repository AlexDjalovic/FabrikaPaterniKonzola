package Proizvodnja;

import Osobe.Radnik;
import proizvodi.Cokolada;


public class ProizvodnjaCokolade extends Proizvodnja {

	public ProizvodnjaCokolade(Radnik r) {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public Cokolada proizvedi() {
		System.out.println(" cokolada");
		Cokolada cokolada=new Cokolada();
		return cokolada;
	}

}
