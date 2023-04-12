package fr.diginamic.banque;

 
//import fr.diginamic.banque.entites.*;
import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;


public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Compte moncompte = new Compte(12,1212212);
		final Compte moncompte2 = new CompteTaux(12,1212212,12);
		
		System.out.println(moncompte2);

	}

}
