package fr.diginamic.banque;

import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;
import fr.diginamic.banque.entites.Credit;


public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation [] tab = {
				new Debit("02/02/02",15.0),
				new Debit("02/03/02",150.0),
				new Credit("02/02/02",105.0),
				new Credit("02/02/02",152.0),		
		};
		
		
		int somme = 0 ; 
		
		for (int i = 0; i < tab.length; i++) {
			if(tab[i].getType()=="Credit") {
				somme += tab[i].montantOperation;
			}else {
				somme -= tab[i].montantOperation;
			}
				
			System.out.println(" dateOperation "+tab[i].dateOperation + " montantOperation :"+tab[i].montantOperation + "type : "+tab[i].getType());
		}
		
		System.out.println(somme);
		
		
		
		
		
	}

}
