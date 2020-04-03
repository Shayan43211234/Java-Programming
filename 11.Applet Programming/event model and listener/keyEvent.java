import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class keyEvent extends Applet implements KeyListener
{
	JTextField itf;
	JLabel label;

	public void init(){
		setSize(600, 300);
		setLayout(new FlowLayout());
		itf = new JTextField(20);
		add(itf);
		itf.addKeyListener(this);
		label = new JLabel();
		add(label);
	}
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){
		label.setText(String.valueOf(ke.getKeyChar()));
	}
}