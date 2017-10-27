package Proizvodnja;

import Osobe.Radnik;
import proizvodi.Bombona;
import proizvodi.Proizvod;

public class ProizvodnjaBombona extends Proizvodnja{

	public ProizvodnjaBombona(Radnik r) {
		
	
	}

	@Override
	public Bombona proizvedi() {
		System.out.println("bombona");
		return new Bombona();
	}

}
