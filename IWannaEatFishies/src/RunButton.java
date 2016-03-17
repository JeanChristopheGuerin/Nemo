import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;

public class RunButton extends JFrame  {
	private static final long serialVersionUID = 1L;

	UserUI userUi;
	private JButton runButton;
	private boolean running;
	private final Timer timer;
	JPanel panel;
	
	public RunButton(UserUI ui){
		ActionListener listener;
		
		panel = new JPanel();
		userUi = ui;
		running = false;
		
		runButton = new JButton("Start");
		runButton.setPreferredSize(new Dimension(200, 50));
		
		setSize(220,90); // set the window size
		setResizable(false); // user can't yolo with window size
		setLocationRelativeTo(null); // the window will pop on the center of the screen
		setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE); // can't close the button
		
		listener = new ActionListener() {
			public void actionPerformed(ActionEvent e){
            	if(running){
            		runButton.setText("Start");
            		timer.stop();
            		running = false;

            	}else{
            		runButton.setText("Stop");
            		timer.start();
            		running = true;
            	}
			}
		};
		runButton.addActionListener(listener);
		
		timer = new Timer(500, null);
		listener = new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	userUi.timerTick();
		    }
		};
		timer.addActionListener(listener);
		
		panel.add(runButton, BorderLayout.CENTER);
		add(panel,BorderLayout.CENTER);
	}
}
