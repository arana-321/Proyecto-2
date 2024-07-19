
/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class Boton extends JButton
{
  public Boton(String txt, int px, int py, int tx, int ty)
    {
        setText(txt);
        setLocation(px, py);
        setSize(tx, ty);
    }
    
}
