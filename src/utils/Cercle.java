package utils;



public class Cercle  implements ObjetGeometrique   {
	
	public int rayon ; 
	
	public Cercle (int rayon){
		this.rayon = rayon; 
	}
	
	public double perimetre() {
		return  rayon * Math.PI * 2 ;
	}
	
	public double surface() {
		return  rayon * rayon * Math.PI ;
	}
	
	

}
