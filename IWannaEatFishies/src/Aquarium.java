import java.awt.Color;
import java.util.ArrayList;

public interface Aquarium {
	public void animer();
	public boolean ajouterPoisson(TrucKiNage poisson);
	public boolean retirerPoisson(TrucKiNage poisson);
	public boolean retirerPoisson(int i, int j, TrucKiNage poisson);
	public int getNombrePoisson();
	public Color getColor();
	public boolean isCellEmpty(int i, int j);
	public TrucKiNage getPoisson(int i, int j, int k);
	public ArrayList<TrucKiNage> getPoissons(int i, int j);
	public ArrayList<ArrayList<ArrayList<TrucKiNage>>> getAllPoissons();
}
