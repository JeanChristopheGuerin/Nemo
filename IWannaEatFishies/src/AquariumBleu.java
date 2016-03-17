import java.awt.Color;
import java.util.ArrayList;

public class AquariumBleu implements Aquarium {
	
	private ArrayList<ArrayList<ArrayList<TrucKiNage>>> poissons;
	private Color waterColor;
	private int nbPoissons;
	
	public AquariumBleu(int aquaWidth, int aquaHeight){
		poissons = new ArrayList<ArrayList<ArrayList<TrucKiNage>>>();
		waterColor = new Color(25, 80, 135);
		nbPoissons = 0;
		
		for(int i = 0; i < UserUI.aquaWidth; ++i){
			poissons.add(new ArrayList<ArrayList<TrucKiNage>>());
			for(int j = 0; j < UserUI.aquaHeigth; ++j){
				poissons.get(i).add(new ArrayList<TrucKiNage>());
			}
		}
		ajouterPoisson(new PoissonRouge(this,5,5));
	}
	
	@Override
	public void animer() {
		for(ArrayList<ArrayList<TrucKiNage>> AATKN : poissons){
			for(ArrayList<TrucKiNage> ATKN : AATKN){
				for(TrucKiNage TKN : ATKN){
					TKN.move();
					TKN.doAction();
				}
			}
		}
	}

	@Override
	public boolean ajouterPoisson(TrucKiNage poisson) {
		if(poissons.get(poisson.getXPos()).get(poisson.getYPos()).size() < 1){
			poissons.get(poisson.getXPos()).get(poisson.getYPos()).add(poisson);
			return true;
		}
		return false;
	}

	@Override
	public boolean retirerPoisson(TrucKiNage poisson) {
		int i =0,j =0;
		while(i < UserUI.aquaHeigth){
			while(j < UserUI.aquaWidth){
				if(poissons.get(i).get(j).size() > 0){
					for(TrucKiNage TKN : poissons.get(i).get(j)){
						if (TKN.equals(poisson)){
							poissons.get(i).get(j).remove(poisson);
							return true;
						}
					}
				}
				++j;
			}
			++i;
		}
		return false;
	}

	@Override
	public boolean retirerPoisson(int i, int j, TrucKiNage poisson) {
		if(poissons.get(i).get(j).size() > 0){
			for(TrucKiNage TKN : poissons.get(i).get(j)){
				if (TKN.equals(poisson)){
					poissons.get(i).get(j).remove(poisson);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int getNombrePoisson() {
		return nbPoissons;
	}

	@Override
	public Color getColor() {
		return waterColor;
	}

	@Override
	public boolean isCellEmpty(int i, int j) {
		return (poissons.get(i).get(j).size() < 1);
	}
	
	@Override
	public ArrayList<ArrayList<ArrayList<TrucKiNage>>> getAllPoissons() {
		return poissons;
	}
	
	@Override
	public ArrayList<TrucKiNage> getPoissons(int i, int j) {
		return poissons.get(i).get(j);
	}

	@Override
	public TrucKiNage getPoisson(int i, int j, int k) {
		return poissons.get(i).get(j).get(k);
	}
}
