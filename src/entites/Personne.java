package entites;

public class Personne {

	public  String  nom  , prenom ;
	  
	  
	public AdressePostale adressePostale ; 
	
	public Personne(String nom , String prenom , AdressePostale adressePostale  ) {
		this.nom=nom;
		this.prenom=prenom;
		this.adressePostale=adressePostale;
	}

	public String getnom (){
		return this.nom;
		
	}
	
	public void setnom (String nom){
		this.nom = nom;
		
	}
	
	public String getprenom (){
		return this.prenom;
		
	}
	
	public void setprenom (String prenom){
		this.prenom = prenom;
		
	}

	public AdressePostale getadressePostale (){
		return this.adressePostale;
		
	}
	
	public void setadressePostale (AdressePostale adressePostale){
		this.adressePostale = adressePostale;
	}
	 
	  
}
