package Interpolation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class DumbButton extends JPanel implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected JToggleButton b2;
	boolean isFaded = false;
	boolean isFading = false;

	public DumbButton() {
		ImageIcon fadeButtonIcon = createImageIcon("images/muhbutton.png");
		
		b2 = new JToggleButton("Fade button", fadeButtonIcon);
		ImageIcon icon = (ImageIcon) b2.getIcon();
		Image img = icon.getImage() ;  
		   Image newimg = img.getScaledInstance( 75, 10,  java.awt.Image.SCALE_SMOOTH ) ;  
		   icon = new ImageIcon( newimg );
		
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setMaximumSize(new Dimension(75,10));
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		b2.setActionCommand("fade");
		b2.setEnabled(true);
		b2.setMnemonic(KeyEvent.VK_T);
		
		b2.addActionListener((ActionListener) this);
		
		add(b2);
		
	}
	
	public boolean isFaded() {
		return isFaded;
	}

	public void setFaded(boolean isFaded) {
		this.isFaded = isFaded;
	}
	
	public boolean isFading() {
		return isFading;
	}
	
	public void setFading(boolean isFading) {
		this.isFading = isFading;
	}

	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("DumbButton");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Color color1 = new Color(248,213,131);
		Color color2 = new Color(154,165,127);
		
		DumbButton contentPane = new DumbButton();
		contentPane.setOpaque(false);
		contentPane.setMaximumSize(new Dimension(75,10));
		frame.setContentPane(contentPane);
		
		JLabel yellowLabel = new JLabel();
		yellowLabel.setOpaque(true);
		yellowLabel.setBackground(color1);
		yellowLabel.setPreferredSize(new Dimension(275,200));
		
		
		
		//frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
		
		
		//Display the window.
		frame.pack();
		frame.setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if("fade".equals(e.getActionCommand())) {
			b2.setEnabled(false);
		}
	}

	protected static ImageIcon createImageIcon(String path) {
		java.net.URL imgURL = FadeDemo.class.getResource(path);
		
		return new ImageIcon(imgURL);
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
