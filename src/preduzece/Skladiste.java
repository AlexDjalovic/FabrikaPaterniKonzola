package preduzece;

import java.util.ArrayList;
import java.util.List;

import proizvodi.Proizvod;

public class Skladiste {

	List<Proizvod>proizvodi;
	
	public Skladiste() {
		proizvodi = new ArrayList<Proizvod>();
	}

	public void dodaj(Proizvod p) {
		proizvodi.add(p);
	}

	public void uzmi(Proizvod p) {
		for (Proizvod pr : proizvodi) {
			if (pr.getNaziv().equalsIgnoreCase(p.getNaziv())) {
				proizvodi.remove(p);
			}
		}
	}

	public List<Proizvod> getProizvodi() {
		return proizvodi;
	}
	
}
