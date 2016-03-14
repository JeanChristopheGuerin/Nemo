package interfaces;

import java.awt.Color;
import java.util.ArrayList;

public interface IAquarium {

	
public void addPoisson(IPoisson poisson);	
public void setWaterColor(Color couleur);
public void setWidth(int largeur);
public void setLength(int longueur);
public void setSpeed(int vitesse);

public ArrayList<? extends IPoisson> getPoissons();
public int getWidth();
public int getLength();
public int getSpeed();
public Color getWaterColor();
}
