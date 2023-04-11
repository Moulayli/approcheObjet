package entites;

public class TestAdressePostale {
	
	public static void main (String [] arg) {
		
		final AdressePostale address = new AdressePostale();
		address.numeroDeRue = 12;
		address.libelleDeLaRue = "Rue des etoile";
		address.codePostale = "34000";
		
		System.out.println(address.numeroDeRue);
	}

}
