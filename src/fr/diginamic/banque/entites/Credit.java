package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOperation , double montantOperation) {
		// TODO Auto-generated constructor stub
		super(dateOperation,montantOperation);
		
	}
	
	public String getType(){
		return "Credit";
	}

}
