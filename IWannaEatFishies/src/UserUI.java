import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UserUI extends JFrame {
	private static final long serialVersionUID = 1L;
	public final static int aquaWidth = 20;
	public final static int aquaHeigth = 20;
	public final static int aquaCellWitdh = 50;
	public final static int aquaCellHeigth = 50;
	
	private ArrayList<ArrayList<JLabel>> poissonsUI;
	private Aquarium aquarium;
	private RunButton runButton;
	private JPanel graphicPanel;
	private JPanel extensionsPanel;
	// plateform p = new plateform
	// p.getDescs()
	// if exist BlueAqua && Exist PoissonRouge
	public UserUI(){
		JLabel jl;
		GridBagConstraints c = new GridBagConstraints();
		graphicPanel = new JPanel();
		extensionsPanel = new JPanel();
		poissonsUI = new ArrayList<ArrayList<JLabel>>();
		aquarium = new AquariumBleu(aquaWidth, aquaHeigth);
		runButton = new RunButton(this);
		
		setSize(400,600); // set the window size
		setResizable(true); // user can't yolo with window size
		setLocationRelativeTo(null); // the window will pop on the center of the screen
		setDefaultCloseOperation(EXIT_ON_CLOSE); // when this window is close the program end
		
		
		graphicPanel.setSize(380,300);
		for (int i = 0; i < aquaHeigth ; ++i){
			poissonsUI.add(new ArrayList<JLabel>());
			for (int j = 0; j < aquaWidth ; ++j){
				jl = new JLabel();
				try {
					jl.setIcon(new ImageIcon(ImageIO.read(new File("pics/transparent"))
							.getScaledInstance(aquaCellWitdh, aquaCellHeigth, Image.SCALE_SMOOTH)));
				} catch (IOException e) {
					System.out.println("Can't find transparent image ><");
				}
				poissonsUI.get(i).add(jl);
				c.fill = GridBagConstraints.HORIZONTAL;
				c.weightx = 0.2;
				c.gridx = i+1;
				c.gridy = j+1;
				graphicPanel.add(jl,c);
			}
		}

		graphicPanel.setBackground(aquarium.getColor());
		
		add(graphicPanel,BorderLayout.CENTER); // place the graphic panel on window's top
		add(extensionsPanel,BorderLayout.PAGE_END); // place the extension panel on window's bottom
		
		runButton.setVisible(true);
	}
	
	public void timerTick(){
		aquarium.animer();
		//TODO Recopier les icons dans les labels
		//TODO debugger le segfault
	}
}
