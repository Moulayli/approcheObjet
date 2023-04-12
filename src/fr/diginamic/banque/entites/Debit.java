package fr.diginamic.banque.entites;

public class Debit extends Operation {

	
	public Debit(String dateOperation , double montantOperation) {
		// TODO Auto-generated constructor stub
		super(dateOperation,montantOperation);
		
	}
	
	public String getType(){
		return "Debit";
	}
	

}
