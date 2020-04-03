import java.applet.Applet;
import java.awt.Graphics;

public class Base extends Applet{
	public void paint(Graphics g){
		g.drawString("getCodeBase : " + getCodeBase(), 20, 20);
		g.drawString("getDocumentBase : " + getDocumentBase(), 20, 40);
	}
}