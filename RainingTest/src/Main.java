import java.awt.EventQueue;

import javax.swing.JFrame;

import Panel.RainPanel;

public class Main  {

	//The idea for this project
	//https://www.youtube.com/watch?v=KkyIDI6rQJI&t=373s&list=WL&index=32
	
	
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// addin panel to frame
		RainPanel rainpanel = new RainPanel();
		frame.add(rainpanel);
	}

}
