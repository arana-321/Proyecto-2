
/**
 * Write a description of class Texto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class Texto extends JLabel 
{
   public Texto(String texto, int px, int py, int tx, int ty)
    {
        setText(texto);
        setLocation(px, py);
        setSize(tx, ty);
    }
    
}
