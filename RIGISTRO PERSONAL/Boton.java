
/**
 * Write a description of class Boton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class Boton extends JButton
{
   public Boton(String text, int px, int py)
    {
        setText(text);
        setLocation(px, py);
        setSize(165, 50);
    }
    
}
