package utils;



public class TestObjetGeometrique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ObjetGeometrique[] tab = new ObjetGeometrique[2];
		tab[0]=new Cercle(5);
		tab[1]=new Rectangle(5,5);
		
		for(ObjetGeometrique object : tab ) {
			System.out.println("Perimettre : "+object.perimetre()+" Surface : "+object.surface());
		}
		
		
	}

}
