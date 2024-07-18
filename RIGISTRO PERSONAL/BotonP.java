
/**
 * Write a description of class BotonP here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class BotonP extends JButton
{
    public BotonP(String text, int px, int py)
    {
        setText(text);
        setLocation(px, py);
        setSize(145, 50);
    }
}
