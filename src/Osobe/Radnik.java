package Osobe;

import Proizvodnja.Proizvodnja;
import Proizvodnja.ProizvodnjaBombona;
import Proizvodnja.ProizvodnjaCokolade;
import Proizvodnja.ProizvodnjaKutija;

import preduzece.Preduzece;
import preduzece.Skladiste;
import preduzece.Zahtev;
import proizvodi.Proizvod;

public abstract class Radnik extends Zaposleni implements Runnable{
	
	private Radnik sledeci;
	private int brojProizvedenih;
	
	private boolean slobodan;
	private Skladiste skl;
	
	Proizvodnja trenutna;


	public Radnik(String ime, Preduzece p,boolean sl) {
		super(ime, p);
	
		slobodan =sl;
		oziviNit();
	}
	
	public void setSledeci(Radnik next){
		sledeci=next;
	}

	
	public String prihvatiZahtev(Zahtev z){
		String x=null;
		
		if(slobodan){
			x=konkretni();
			slobodan=false;
			System.out.println("Radnik koji je prihvatio zahtev: "+this);
			System.out.println("-------------------------------------------");
			trenutna=new ProizvodnjaKutija(this,z.getKapacitet());
			proizvedi();
			
			if(z.getVrsta().equalsIgnoreCase("bombone")){
				 trenutna=new ProizvodnjaBombona(this);
			}else if(z.getVrsta().equalsIgnoreCase("cokolada")){
				trenutna=new ProizvodnjaCokolade(this);
			}
			for(int i=0;i<z.getKapacitet();i++){
				System.out.print((i+1)+".");
				proizvedi();}
			System.out.println();
			System.out.println();
			
			
			return x;
		}
		if(sledeci!=null){
			sledeci.prihvatiZahtev(z);//mora da bude posle provere da li je slobodan ili ne, jer ce uvek stamapati obojicu
		}
		slobodan=true;//mora na kraju da se postavi da ponovo postaje slobodan
		return x;
	}

	public abstract String konkretni();
	public void run(){
		
	}
	public void oziviNit(){
		Thread t=null;
		if(t==null){
			t=new Thread(this);
			t.start();
		}
	}
	public void smestiUSkladiste(Proizvod p){
		skl.dodaj(p);
	}
	public void postaviProizvodnju(Proizvodnja p){
		trenutna=p;
	}
	public void proizvedi(){
		trenutna.proizvedi();
	}
	public String toString(){
		return ime;
	}
}
