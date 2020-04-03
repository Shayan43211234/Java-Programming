//Use Parameters
import java.awt.*;
import java.applet.*;

public class ParaDemo extends Applet{
	String n, a;

	//Initialize the string to be display
	public void init(){
		n = getParameter("name");
		a = getParameter("age");
	}

	//Display Parameters
	public void paint(Graphics g){
		g.drawString("Name is : " + n, 20, 20);
		g.drawString("Age is : " + a, 20, 40);
	}
}