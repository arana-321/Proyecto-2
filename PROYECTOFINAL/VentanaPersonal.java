
/**
 * Write a description of class VentanaPersonal here.
 * 
 * @author (yo name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import javax.swing.JPasswordField;
public class VentanaPersonal extends JFrame implements ActionListener 
{
    //private Texto titulo= new Texto("REGISTRO PERSONAL", 135, 10, 200, 30);
    private Texto ventana = new Texto("REGISTRAR PERSONAL ", 100, 10, 300, 100, Color.BLACK, 25);

    private Texto txtId= new Texto("Id Personal:", 20, 120, 180, 20, Color.BLACK, 15);
    
    private Texto txtCi= new Texto("ci:", 20, 150, 180, 20, Color.BLACK, 15);
    private Texto txtNombre= new Texto("Nombre:", 20, 180, 180, 20, Color.BLACK, 15);
    private Texto txtApellidoP= new Texto("Apellido Paterno:", 20, 210, 180, 20, Color.BLACK, 15);
    private Texto txtApellidoM= new Texto("Apellido Materno:", 20, 240, 180, 20, Color.BLACK, 15);
    private Texto txtFechaN= new Texto("Fecha de Nacimiento:", 20, 270, 180, 20, Color.BLACK, 15);
    private Texto txtCorreo= new Texto("Correo electronico:", 20, 300, 180, 20, Color.BLACK, 15);
    private Texto txtCargo= new Texto("Cargo:", 20, 330, 180, 20, Color.BLACK, 15);
    private Texto txtDireccion= new Texto("Direccion:", 20, 360, 180, 20, Color.BLACK, 15);
    private Texto txtTelefono= new Texto("Telefono:", 20, 390, 180, 20, Color.BLACK, 15);
    //
    
    //
    private Caja tbId= new Caja(200, 120, 200, 25);
    private Caja tbCi= new Caja(200, 150, 200, 25);
    private Caja tbNombre= new Caja(200, 180, 200, 25);
    private Caja tbApellidoP= new Caja(200, 210, 200, 25);
    private Caja tbApellidoM= new Caja(200, 240, 200, 25);
    private Caja tbFechaN= new Caja(200, 270, 200, 25);
    private Caja tbCorreo= new Caja(200, 300, 200, 25);
    private Caja tbCargo= new Caja(200, 330, 200, 25);
    private Caja tbDireccion= new Caja(200, 360, 200, 25);
    private Caja tbTelefono= new Caja(200, 390, 200, 25);
    //private Caja tbBuscar = new Caja(650, 180, 50, 30);
    //private JPasswordField tbpass= new CajaPass(200, 400, 200, 25);

    //
    private Boton menu = new Boton("", 625, 10, 80, 80);
    private Boton btnRegistrar = new Boton("REGISTRAR", 50, 440, 125, 30);
    //private Boton btnCancelar = new Boton("CANCELAR", 450, 180, 125, 30);
    private Boton btnVisualizar = new Boton("VISUALIZAR", 200, 440, 125, 30);

    
    //
    //private Texto txtPosicion = new Texto("Posición:", 20, 430, 100, 20);
    //private Caja tbPosicion = new Caja(160, 435);
    //private JTextField tbPas= new CajaPas(190, 435);
    //private Boton btnVisualizar = new Boton("BUSCAR REGISTRO", 20, 430);
    //private JButton btnBotonP= new BotonP("BUSCAR REGISTRO",20, 435);
    public VentanaPersonal()
    {
        //AÑADIR OBJETOS
        ImageIcon Menu = new ImageIcon("G:/PROYECTO/iconos/Menu.png");

       // menu.setIcon(Menu);
        add(ventana);
        //add(titulo);
        
        add(txtId);
        add(txtCi);
        add(txtNombre);
        add(txtApellidoP);
        add(txtApellidoM);
        add(txtFechaN);
        add(txtCorreo);
        add(txtCargo);
        add(txtDireccion);
        add(txtTelefono);
        //add(txtPass);

        //
        add(tbId);
        add(tbCi);
        add(tbNombre);
        add(tbApellidoP);
        add(tbApellidoM);
        add(tbFechaN);
        add(tbCorreo);
        add(tbCargo);
        add(tbDireccion);
        add(tbTelefono);
        //add(tbpass);
        //
        add(menu);
        add(btnRegistrar);
        //add(btnCancelar);
        add(btnVisualizar);
        //
        //add(txtPosicion);
        //add(tbPosicion);
        //add(btnVisualizar);
        //
         menu.addActionListener(this);
        //btnCancelar.addActionListener(this);
        btnRegistrar.addActionListener(this);
        btnVisualizar.addActionListener(this);
        //btnCancelar.addActionListener(this);
        //btnAceptar.addActionListener(this);
        //btnVisualizar.addActionListener(this);
        //btnBotonP.addActionListener(this);
        //Personalizar el fondo de pantalla con un color personalizado 
        getContentPane().setBackground  (new Color(33, 150, 243)); // Azul vibrante  //(new Color(173, 216, 230)); // Azul claro//(new Color(144, 238, 144)); // Verde claro o verde pasto

        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(450, 550);
        setVisible(true);
    }
    
    public void RegistrarPersonal(){
        int id = Integer.parseInt(tbId.getText());
        int ci = Integer.parseInt(tbCi.getText());
        String nom = tbNombre.getText();
        String apep = tbApellidoP.getText();
        String apem = tbApellidoM.getText();
        String fecha = tbFechaN.getText();
        String correo = tbCorreo.getText();
        String car = tbCargo.getText();
        String direc = tbDireccion.getText();
        String tel = tbTelefono.getText();
       

        Personal per = new Personal(ci, id, nom, apep, apem, fecha, correo, car, direc, tel);
        DBA.setPersonal(per);
        //Usuario usu = new Usuario(us, pas); // Ajusta el constructor de Animal según corresponda
        //DBA.setUsuario(usu);


            // Limpiar los campos después del registro
            tbId.setText("");
            tbCi.setText("");
            tbNombre.setText("");
            tbApellidoP.setText("");
            tbApellidoM.setText("");
            tbFechaN.setText("");
            tbCorreo.setText("");
            tbCargo.setText("");
            tbDireccion.setText("");
            tbTelefono.setText("");
        }
        
        
       public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menu) {
            Sistema sist = new Sistema();
            dispose();
        }

        if (e.getSource() == btnRegistrar) {
            RegistrarPersonal();
        }

        if (e.getSource() == btnVisualizar) {
            MostrarPersonal Mper = new MostrarPersonal();
            dispose();
        }

//         if (e.getSource() == btnCancelar) {
//             Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());
//             window.dispose();
//         }
    }
  }