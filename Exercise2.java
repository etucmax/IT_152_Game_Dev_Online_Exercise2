package exercise2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Exercise2 extends JFrame implements KeyListener{
	
	private JLabel Wlabel, Alabel, Xlabel, Dlabel, Slabel; // Declare private variables for the labels
	
	public Exercise2(String title) {
		
		super(title);
		this.setSize(800, 700);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.addKeyListener(this); // Add the keylistener function
		
		// I create a labels for the keys in the example
		Wlabel = createLabel("W Key");
		Alabel = createLabel("A Key");
		Xlabel = createLabel("X Key");
		Dlabel = createLabel("D Key");
		Slabel = createLabel("S Key");
		
		// I add the labels to the frame using the BorderLayout
		this.add(Wlabel, BorderLayout.NORTH);
		this.add(Alabel, BorderLayout.WEST);
		this.add(Xlabel, BorderLayout.SOUTH);
		this.add(Dlabel, BorderLayout.EAST);
		this.add(Slabel, BorderLayout.CENTER);
			
	}
	
	// private method to create a label with specified text
	private JLabel createLabel(String t) {
		JLabel label = new JLabel(t);
		label.setHorizontalAlignment(SwingConstants.CENTER); // set the horizontal alignment of the label to center
		label.setOpaque(true); // make the label opaque
		this.add(label); // add the label to the frame
		return label; // return the label object
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	
		/* the e.getkeycode function get the code that was pressed and if the key code is for the A key the
		   background color of the Alabel will turn to green and same with others
		*/
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Alabel.setBackground(Color.GREEN);
		}
		else if(e.getKeyCode() == KeyEvent.VK_W) {
			Wlabel.setBackground(Color.GREEN);
		}
		else if(e.getKeyCode() == KeyEvent.VK_X) {
			Xlabel.setBackground(Color.GREEN);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			Slabel.setBackground(Color.GREEN);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			Dlabel.setBackground(Color.GREEN);
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
		/* the e.getkeycode function get the code that was pressed and if the key code is for the A key the
		   background color of the Alabel will turn to null and same with others
		*/
		if(e.getKeyCode() == KeyEvent.VK_A) {
			Alabel.setBackground(null);
		}
		else if(e.getKeyCode() == KeyEvent.VK_W) {
			Wlabel.setBackground(null);
		}
		else if(e.getKeyCode() == KeyEvent.VK_X) {
			Xlabel.setBackground(null);
		}
		else if(e.getKeyCode() == KeyEvent.VK_S) {
			Slabel.setBackground(null);
		}
		else if(e.getKeyCode() == KeyEvent.VK_D) {
			Dlabel.setBackground(null);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise2 win = new Exercise2("KeyListener");
		win.setVisible(true);

	}

}
