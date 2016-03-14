package implementations;
import interfaces.IAfficheur;
import interfaces.IAquarium;

public class AfficheurBasique implements IAfficheur {
	
	public void afficher(IAquarium aquarium) {
		
		System.out.println("--- Afficheur Basique ---");
		System.out.println("- nombre de poissons  : "+aquarium.getPoissons().size());
		System.out.println("- taille de l'aquarium  : Lenght/Hauteur = "+aquarium.getLength()+" Width/Hauteur = "+aquarium.getWidth());
	}
}
