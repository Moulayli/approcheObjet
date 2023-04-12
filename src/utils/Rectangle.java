package utils;

public class Rectangle  implements ObjetGeometrique  {
	
	public int longeur ;
	public int largeur; 
	
	public Rectangle (int longeur , int largeur  ){
		this.longeur = longeur; 
		this.largeur = largeur;
	}

	
	public double perimetre() {
		return  (longeur+largeur)*2; 
	}
	
	public double surface() {
		return longeur*largeur;
	}
	
}
