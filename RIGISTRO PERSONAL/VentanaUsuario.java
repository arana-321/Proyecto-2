
/**
 * Write a description of class VentanaUsuario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPasswordField;
public class VentanaUsuario extends JFrame implements ActionListener
{
  private Texto titulo = new Texto("REGISTRAR USUARIO", 70, 10, 150, 10);
     

    private Texto txtUsuario= new Texto("Nombre de Usuario", 20, 40, 150, 10);
    private Texto textPass= new Texto("Contraseña", 20, 70, 150, 10);
    private Caja tbUsuario= new Caja(150, 30);
    private JPasswordField tbPass= new CajaPass(150, 60);
   
    private Boton btnRegistrar = new Boton("REGISTRAR", 10, 110);
    private Boton btnCancelar = new Boton("CANCELAR", 180, 110);
    

  public VentanaUsuario(){
        add(titulo);
        add(txtUsuario);
        add(tbUsuario);
        add(tbPass);
        add(textPass);

        add(btnRegistrar);
        add(btnCancelar);

        btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);
        //Personalizar el fondo de pantalla con un color personalizado 
        getContentPane().setBackground  (new Color(173, 216, 230)); // Azul claro 
      
        setLayout(null);
        setTitle("LOGIN"); 
        setSize(390, 250); 
        setVisible(true);
        
        tbPass.setEchoChar('*');
    }
    
  public void registroUsuario(){
        String us = tbUsuario.getText();
        String pas = tbPass.getText();

            Usuario usu = new Usuario(us, pas); // Ajusta el constructor de Animal según corresponda
            DBA.setUsuario(usu);
            
            // Limpiar los campos después del registro
            tbUsuario.setText("");
            tbPass.setText("");
        
        setVisible(false);
    }
    
  public void abrirLogin(){
        Login lg= new Login();
        lg.setVisible(true);
    }
    
    
  public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            registroUsuario();
            abrirLogin();
        }

        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());

            // Cerrar la ventana actual
            window.dispose();
        }
  }
    
}
