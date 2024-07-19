
/**
 * Write a description of class Login here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JPasswordField;
import java.awt.*;
 public class Login extends JFrame implements ActionListener
 {
    Texto titulo= new Texto("INICIAR SESION", 100, 0, 400, 100, Color.BLACK, 25); 
    Texto txtUsuario= new Texto("Nombre de Usuario", 20, 80, 150, 10, Color.BLACK, 15);
    Texto textPass= new Texto("Contraseña", 20, 110, 150, 10, Color.BLACK, 15); 
    //
    Caja tbUsuario= new Caja(150, 70, 90, 30);
    private JPasswordField tbPass= new CajaPass(150, 100, 90, 30);
    //
    Boton btnAceptar= new Boton("ACEPTAR", 20, 150, 100, 30);
    Boton btnCancelar= new Boton("CANCELAR", 150, 150, 100, 30);
    
    
   public Login()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtUsuario);
        add(tbUsuario);
        add(tbPass);
        add(textPass);
        //
        
        add(btnAceptar);
        add(btnCancelar);
        //
        
        btnAceptar.addActionListener(this);
        btnCancelar.addActionListener(this);
        //Personalizar el fondo de pantalla con un color personalizado 
        getContentPane().setBackground  (new Color(173, 216, 230)); // Azul claro 
        
        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(400,300);
        setVisible(true);
        //
        tbPass.setEchoChar('*');
    }
   public static void main()
    {
        Login login= new Login();
     
   }
    //preguntar mñn para que nos sirve
    public static Sistema frmSistema;
    
   public void ingresar(){
        Usuario us= new Usuario(tbUsuario.getText(), tbPass.getText());
        String usu="rodri";
        String pass="1234";
        if (DBA.existeUsuario(us) || (tbUsuario.getText().equals(usu) && tbPass.getText().equals(pass))) {
            frmSistema= new Sistema();
            dispose();
        } else {
            setTitle("ERROR");
        }
        
    }
    
   public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()== btnAceptar){
            ingresar();
            dispose();
        }

        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
            // Cerrar la ventana actual
            window.dispose();
        }
    }
 }