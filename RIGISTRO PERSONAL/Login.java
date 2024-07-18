
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
    Texto titulo= new Texto("INICIAR SESION", 100, 10, 100, 10); 
    Texto txtUsuario= new Texto("Nombre de Usuario", 20, 40, 150, 10);
    Texto textPass= new Texto("Contraseña", 20, 70, 150, 10); 
    //
    Caja tbUsuario= new Caja(150, 30);
    private JPasswordField tbPass= new CajaPass(150, 60);
    //
    Boton btnAceptar= new Boton("ACEPTAR", 20, 110);
    Boton btnCancelar= new Boton("CANCELAR", 190, 110);
    Boton btnNuevo = new Boton("NUEVO", 90, 170);
    
   public Login()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtUsuario);
        add(tbUsuario);
        add(tbPass);
        add(textPass);
        //
        add(btnNuevo);
        add(btnAceptar);
        add(btnCancelar);
        //
        btnNuevo.addActionListener(this);
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
    public static VentanaUsuario frmUsuario;
    
   public void ingresar(){

        Usuario usu= new Usuario(tbUsuario.getText(),tbPass.getText());
        if (DBA.existeUsuario(usu)) {
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
        }
        
        if (e.getSource()== btnNuevo){
            setVisible(false);
            frmUsuario = new VentanaUsuario();
        }
    }
 }