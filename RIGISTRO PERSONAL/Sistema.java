
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
  Texto titulo= new Texto("REGISTROS", 270, 10, 100, 10);
  Caja tbPass= new Caja(150, 60);
  Boton btnRegistro= new Boton("REGISTRAR PERSONAL", 50, 60);
  Boton btnAsistencia= new Boton("CONTROL ASISTENCIA", 230, 60);
  Boton btnRestringidos= new Boton("RESTRINGIDOS", 410, 60);
  Boton btnControl= new Boton("CONTROL VISITAS", 50, 130);
  Boton btnHistorial= new Boton("REGISTRO HISTORIAL ", 230, 130);
  private Boton btnSalir= new Boton("SALIR", 440, 200);
  /**
     * Constructor for objects of class Ventana
     */
    public Sistema()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(btnRegistro);
        add(btnAsistencia);
        add(btnRestringidos);
        add(btnControl);
        add(btnHistorial);
        
        add(btnSalir);
        //ACTION BUTTONS
        btnRegistro.addActionListener(this);
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
        setSize(650, 300);
        setVisible(true);
    }
    public static VentanaPersonal frmVentanaPersonal;
    public static VentanaAsistencia frmVentanaAsistencia;
    public static VentanaRestringidos frmVentanaRestringidos;
    public static VentanaVisitas frmVentanaVisitas;
    public static VentanaHistorial frmVentanaHistorial;
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== btnRegistro){
            frmVentanaPersonal= new VentanaPersonal();
        }
        //
        if (e.getSource()== btnAsistencia){
            frmVentanaAsistencia= new VentanaAsistencia();
        }
        //
        if (e.getSource()== btnRestringidos){
            frmVentanaRestringidos= new VentanaRestringidos();
        }
         //
        if (e.getSource()== btnControl){
            frmVentanaVisitas= new VentanaVisitas();
        }
        //
        if (e.getSource()== btnHistorial){
            frmVentanaHistorial= new VentanaHistorial();
        }
        //
        if (e.getSource() == btnSalir) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());

            // Cerrar la ventana actual
            window.dispose();
        }
    }
}