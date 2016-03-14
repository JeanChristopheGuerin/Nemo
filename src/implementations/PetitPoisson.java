package implementations;
import interfaces.IPoisson;
import java.awt.Color;

public class PetitPoisson implements IPoisson{
	int taille;
	Color couleur;
	
	public PetitPoisson(){
		taille = 1;
		couleur = Color.RED;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}
}
