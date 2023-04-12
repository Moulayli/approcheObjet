package entites;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final AdressePostale address = new AdressePostale(12 ,"Rue des etoile","34000" );
		
		final AdressePostale address2 = new AdressePostale(1,"  "," ");
		
		address2.setNumeroDeRue(16);
		address2.setLibelleDeLaRue("6 rue");
		address2.setCodePostale("97690");
		
		
		
				
		
		final Personne perso = new Personne("Moula","Sadi",address2);
		
		System.out.println(perso.adressePostale.numeroDeRue);
		
		

	}

}
