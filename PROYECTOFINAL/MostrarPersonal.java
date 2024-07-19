
/**
 * Write a description of class MostrarPersonal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
//import javax.swing.JPasswordField;
public class MostrarPersonal extends JFrame implements ActionListener 
{
    private Texto titulo= new Texto("REGISTRO PERSONAL", 100, 10, 300, 100, Color.BLACK, 15);
    
    private Texto txtId= new Texto("Id Personal:", 20, 120, 180, 20, Color.BLACK, 15);
    private Texto txtCi= new Texto("ci:", 20, 150, 180, 20, Color.BLACK, 15);
    private Texto txtNombre= new Texto("Nombre:", 20, 180, 180, 20, Color.BLACK, 15);
    private Texto txtApellidoP= new Texto("Apellido Paterno:", 20, 210, 180, 20, Color.BLACK, 15);
    private Texto txtApellidoM= new Texto("Apellido Materno:",  20, 240, 180, 20, Color.BLACK, 15);
    private Texto txtFechaN= new Texto("Fecha de Nacimiento:", 20, 270, 180, 20, Color.BLACK, 15);
    private Texto txtCorreo= new Texto("Correo electronico:", 20, 300, 180, 20, Color.BLACK, 15);
    private Texto txtCargo= new Texto("Cargo:", 20, 330, 180, 20, Color.BLACK, 15);
    private Texto txtDireccion= new Texto("Direccion:", 20, 360, 180, 20, Color.BLACK, 15);
    private Texto txtTelefono= new Texto("Telefono:", 20, 390, 180, 20, Color.BLACK, 15);
    //
    
    //
    private Caja tbBuscar = new Caja(150, 450, 60, 40);
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
  

    //
    private Boton btnCancelar = new Boton("CANCELAR", 260, 510, 125, 40);
    private Boton btnBuscar = new Boton("BUSCAR", 20, 450, 125, 40);
    private Boton btnModificar = new Boton("MODIFICAR", 260, 450, 125, 40);
    private Boton btnEleminar = new Boton("ELEMINAR", 20, 510, 125, 40);

    //
    //private Texto txtPosicion = new Texto("Posición:", 20, 430, 100, 20);
    //private Caja tbPosicion = new Caja(160, 435);
    //private JTextField tbPas= new CajaPas(190, 435);
    //private Boton btnVisualizar = new Boton("BUSCAR REGISTRO", 20, 430);
    //private JButton btnBotonP= new BotonP("BUSCAR REGISTRO",20, 435);
    public MostrarPersonal()
    {
        //AÑADIR OBJETOs
        
        add(titulo);
        
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
        

        //
        add(tbBuscar);
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
        
        //
        add(btnCancelar);
        add(btnBuscar);
        add(btnEleminar);
        add(btnModificar);
        //
        //add(txtPosicion);
        //add(tbPosicion);
        //add(btnVisualizar);
        //
        btnCancelar.addActionListener(this);
        btnBuscar.addActionListener(this);
        btnModificar.addActionListener(this);
        btnEleminar.addActionListener(this);

        //btnCancelar.addActionListener(this);
        //btnAceptar.addActionListener(this);
        //btnVisualizar.addActionListener(this);
        //btnBotonP.addActionListener(this);
        //Personalizar el fondo de pantalla con un color personalizado 
        getContentPane().setBackground  (new Color(33, 150, 243)); // Azul vibrante  //(new Color(173, 216, 230)); // Azul claro//(new Color(144, 238, 144)); // Verde claro o verde pasto

        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(450, 650);
        setVisible(true);
    }
    
    public void ImprimirPersonal(){
        int pos = Integer.parseInt(tbBuscar.getText());
        Personal per = DBA.getPersonal(pos);
        if (per != null) {
            tbId.setText(String.valueOf(per.getIdPersonal()));
            tbCi.setText(String.valueOf(per.getCi()));
            tbNombre.setText(per.getNombre());
            tbApellidoP.setText(per.getApellidoPaterno());
            tbApellidoM.setText(per.getApellidoMaterno());
            tbFechaN.setText(per.getFechaNacimiento());
            tbCorreo.setText(per.getCorreoElectronico());
            tbCargo.setText(per.getCargo());
            tbDireccion.setText(per.getDireccion());
            tbTelefono.setText(per.getTelefono());
            
        } else {
            JOptionPane.showMessageDialog(this, "Registro no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void ModificarPersonal() {
        int pos = Integer.parseInt(tbBuscar.getText());
        int id = Integer.parseInt(tbId.getText());
        int ci = Integer.parseInt(tbCi.getText());
        String nombre = tbNombre.getText();
        String apellidoPaterno = tbApellidoP.getText();
        String apellidoMaterno = tbApellidoM.getText();
        String fechaNacimiento = tbFechaN.getText();
        String correoElectronico = tbCorreo.getText();
        String cargo = tbCargo.getText();
        String direccion = tbDireccion.getText();
        String telefono = tbTelefono.getText();
        

        Personal nuevoPersonal = new Personal( id, ci, nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento,correoElectronico, cargo, direccion, telefono);
        boolean success = DBA.ModificarPersonal(pos, nuevoPersonal);

        if (success) {
            JOptionPane.showMessageDialog(this, "Registro modificado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo modificar el registro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
     public void EliminarPersonal() {
        int pos = Integer.parseInt(tbBuscar.getText());
        boolean sucess = DBA.EliminarPersonal(pos);

        if(sucess){
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
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnBuscar) {
            ImprimirPersonal();
        }

        if (e.getSource() == btnModificar) {
            ModificarPersonal();
        }
        
        if (e.getSource() == btnEleminar) {
            EliminarPersonal();
        }
        
        if (e.getSource() == btnCancelar) {
            VentanaPersonal Vper = new VentanaPersonal();
            dispose();
        }
    }
  }