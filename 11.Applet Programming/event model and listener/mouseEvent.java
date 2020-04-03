import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.JLabel;

public class mouseEvent extends Applet implements MouseListener, MouseMotionListener
{
	JLabel label;

	public void init(){
		setSize(600, 300);
		setLayout(new FlowLayout());
		label = new JLabel();
		add(label);
		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public void mouseClicked(MouseEvent me){
		label.setText("Mouse is clicked.");
	}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseExited(MouseEvent me){}
	public void mouseDragged(MouseEvent me){}
	public void mouseMoved(MouseEvent me){
		label.setText("Mouse is moved.");
	}
}