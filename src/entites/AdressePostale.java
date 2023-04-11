package entites;

public class AdressePostale {
	
  public   int  numeroDeRue  ;
  
  public String libelleDeLaRue ; 
  
  public String codePostale ; 
  
  
  public AdressePostale ( int numeroDeRue ,String libelleDeLaRue , String codePostale ) {
	  this.numeroDeRue = numeroDeRue;
	  this.libelleDeLaRue = libelleDeLaRue;
	  this.codePostale = codePostale;
  }
  
  public int getnumeroDeRue (){
	  return this.numeroDeRue;
	  
  }
  
  public void setNumeroDeRue (int numeroDeRue){
	  this.numeroDeRue = numeroDeRue;
	  
  }

  public String getLibelleDeLaRue (){
	  return this.libelleDeLaRue;
	  
  }
  
  public void setLibelleDeLaRue (String libelleDeLaRue){
	  this.libelleDeLaRue = libelleDeLaRue;
	  
  }
  
  public String getCodePostale (){
	  return this.codePostale;
	  
  }
  
  public void setCodePostale (String codePostale){
	  this.codePostale = codePostale;
	  
  }
  
  
  
  
  
}
