package interfaces;

import java.awt.Color;

public interface IAquarium {
	
void addPoisson(IPoisson poisson);	
void setWaterColor(Color couleur);
void setWidth(int largeur);
void setLength(int longueur);
void setSpeed(int vitesse);
}
