import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Repaint extends Applet implements MouseListener
{
	private int mouseX, mouseY;
	private boolean mouseClicked = false;

	public void init(){
		setBackground(Color.CYAN);
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e){
		mouseX = e.getX();
		mouseY = e.getY();
		mouseClicked = true;
		repaint();
	}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseExited(MouseEvent me){}

	public void paint(Graphics g){
		String str;
		g.setColor(Color.RED);
		if(mouseClicked){
			str = "X="+mouseX+", "+"Y="+mouseY;
			g.drawString(str, mouseX, mouseY);
			mouseClicked = false;
		}
	}
}