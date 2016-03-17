import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class PoissonRouge implements TrucKiNage{
	Icon icon;
	Aquarium aquarium;
	int direction;
	int posX;
	int posY;
	
	public PoissonRouge(Aquarium aqua, int x, int y){
		aquarium = aqua;
		direction = 1;
		try {
			icon = new ImageIcon(ImageIO.read(new File("pics/poissonRouge1.png"))
					.getScaledInstance(UserUI.aquaCellWitdh, UserUI.aquaCellHeigth, Image.SCALE_SMOOTH));
		} catch (IOException e) {
			System.out.println("Can't find fish Icon");
		}
		posX = x;
		posY = y;
	}
	
	@Override
	public void move() {
		int nouvPos = posY + 1 * direction;
		if(nouvPos < UserUI.aquaHeigth && nouvPos >= 0 && aquarium.isCellEmpty(posX, nouvPos)){
			aquarium.retirerPoisson(posX, posY, this);
			posY = nouvPos;
			aquarium.ajouterPoisson(this);
		}else{
			direction = direction * - 1;
			try {
				icon = new ImageIcon(ImageIO.read(new File("pics/poissonRouge" + Integer.toString(direction) + ".png"))
						.getScaledInstance(UserUI.aquaCellWitdh, UserUI.aquaCellHeigth, Image.SCALE_SMOOTH));
			} catch (IOException e) {
				System.out.println("Can't find fish Icon");
			}
		}
	}

	@Override
	public void doAction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Icon getIcon() {
		return icon;
	}

	@Override
	public int getXPos() {
		return posX;
	}

	@Override
	public int getYPos() {
		return posY;
	}
}
