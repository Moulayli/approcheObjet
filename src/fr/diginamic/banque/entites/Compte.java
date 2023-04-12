package fr.diginamic.banque.entites;

public class Compte {
	protected int numeroDeCompte;
	protected double soldeDeCompte;
	
	public Compte (int numeroDeCompte,double soldeDeCompte ) {
		this.numeroDeCompte = numeroDeCompte; 
		this.soldeDeCompte = soldeDeCompte;
	}
	
	public String toString() {
		return "numeroDeCompte :  "+numeroDeCompte+" soldeDeCompte : "+soldeDeCompte  ;
	}

}
