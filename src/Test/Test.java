package Test;

import Osobe.*;
import preduzece.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Skladiste s=new Skladiste();
		Preduzece p=new Fabrika("abc", s);
		
		prviRadnik r1=new prviRadnik("aca", p,true);
		drugiRadnik r2=new drugiRadnik("peca", p, true);
		r1.setSledeci(r2);
		
		Rukovodilac ruk=new Rukovodilac("deki", p, r1);
		ruk.posaljiZahtev(6, 20, "bombone");
		ruk.posaljiZahtev(1, 2, "cokolada");
		
	}

}
