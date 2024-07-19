
/**
 * Write a description of class Caja here.
 * 
 * @author (yo name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class Caja extends JTextField
{
   public Caja(int px, int py, int tx, int ty)
    {
        setLocation(px, py);
        setSize(tx, ty);
    }
    
}
