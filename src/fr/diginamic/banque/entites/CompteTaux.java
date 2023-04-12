package fr.diginamic.banque.entites;

//import fr.diginamic.banque.entites.Compte;

public class CompteTaux extends Compte {
	
	private double tauxDeRemuneration;
	
	public CompteTaux (int numeroDeCompte,double soldeDeCompte , double tauxDeRemuneration ) {
		super(numeroDeCompte, soldeDeCompte);
		this.tauxDeRemuneration=tauxDeRemuneration;
	}
	
	public String toString() {
		return "numeroDeCompte :  "+numeroDeCompte+" soldeDeCompte : "+soldeDeCompte+" tauxDeRemuneration : "+tauxDeRemuneration  ;
	}
	
	
	
	
}
