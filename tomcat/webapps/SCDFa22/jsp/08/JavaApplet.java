//JavaApplet.java
import java.applet.*;
import java.awt.*;

//<applet code = JavaApplet width = 300 height = 300></applet>
public class JavaApplet extends Applet{
  public void paint(Graphics g){
    g.drawString("Welcome in Java Applet.",40,20);
  }
}