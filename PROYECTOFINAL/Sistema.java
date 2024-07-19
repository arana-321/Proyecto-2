
/**
 * Write a description of class Sistema here.
 * 
 * @author (yo name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Sistema extends JFrame implements ActionListener
{
  private Texto titulo= new Texto("REGISTROS", 300, 10, 300, 100, Color.BLACK, 25);
  
  private Boton btnPersonal= new Boton("REGISTRAR PERSONAL", 50, 100, 180, 50);
  private Boton btnAsistencia= new Boton("CONTROL ASISTENCIA",260,100,180,50);
  private Boton btnRestringidos= new Boton("RESTRINGIDOS", 470, 100,180, 50);
  private Boton btnControl= new Boton("CONTROL VISITAS", 50, 180, 180, 50);
  private Boton btnHistorial= new Boton("REGISTRO HISTORIAL ", 260, 180, 180, 50);
  private Boton btnSalir= new Boton("SALIR", 470, 180, 180, 40);
  /**
     * Constructor for objects of class Ventana
     */
    public Sistema()
    {
        //AÑADIR OBJETOS
        add(titulo);
        
        add(btnPersonal);
        add(btnAsistencia);
        add(btnRestringidos);
        add(btnControl);
        add(btnHistorial);
        
        add(btnSalir);
        //ACTION BUTTONS
        btnPersonal.addActionListener(this);
        btnAsistencia.addActionListener(this);
        btnRestringidos.addActionListener(this);
        btnControl.addActionListener(this);
        btnHistorial.addActionListener(this);
        
        btnSalir.addActionListener(this);
        //Personalizar el fondo de pantalla con un color personalizado 
        getContentPane().setBackground  (new Color(173, 216, 230)); // Azul claro 
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(750, 400);
        setVisible(true);
    }
    VentanaPersonal frmPer;
    VentanaAsistencia frmCon;
    //VentanaRestringidos frmREstringidos;
    //VentanaVisitas frmVisitas;
    //VentanaHistorial frmHistorial;
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == btnPersonal) 
        {
            frmPer = new VentanaPersonal();
            dispose();
        }
        //
        if (e.getSource() == btnAsistencia) 
        {
            frmCon = new VentanaAsistencia();
            dispose();
        }
        //
        
         //
       
        //
      
        //
        if (e.getSource() == btnSalir) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());

            // Cerrar la ventana actual
            window.dispose();
        }
    }
}