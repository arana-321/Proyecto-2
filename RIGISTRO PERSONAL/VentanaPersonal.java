
/**
 * Write a description of class VentanaPersonal here.
 * 
 * @author (yo name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPasswordField;
public class VentanaPersonal extends JFrame implements ActionListener 
{
    private Texto titulo= new Texto("REGISTRO PERSONAL", 135, 10, 200, 30);
    private Texto txtId= new Texto("Id Personal:", 20, 40, 180, 20);
    private Texto txtCi= new Texto("ci:", 20, 70, 180, 20);
    private Texto txtNombre= new Texto("Nombre:", 20, 100, 180, 20);
    private Texto txtApellidoP= new Texto("Apellido Paterno:", 20, 130, 180, 20);
    private Texto txtApellidoM= new Texto("Apellido Materno:", 20, 160, 180, 20);
    private Texto txtFechaN= new Texto("Fecha de Nacimiento:", 20, 190, 180, 20);
    private Texto txtCorreo= new Texto("Correo electronico:", 20, 220, 180, 20);
    private Texto txtCargo= new Texto("Cargo:", 20, 250, 180, 20);
    private Texto txtDireccion= new Texto("Direccion:", 20, 280, 180, 20);
    private Texto txtTelefono= new Texto("Telefono:", 20, 310, 180, 20);
    //
    private Caja tbId= new Caja(150, 40);
    private Caja tbCi= new Caja(150, 70);
    private Caja tbNombre= new Caja(150, 100);
    private Caja tbApellidoP= new Caja(150, 130);
    private Caja tbApellidoM= new Caja(150, 160);
    private Caja tbFechaN= new Caja(150, 190);
    private Caja tbCorreo= new Caja(150, 220);
    private Caja tbCargo= new Caja(150, 250);
    private Caja tbDireccion= new Caja(150, 280);
    private Caja tbTelefono= new Caja(150, 310);
    //
    private Boton btnAceptar= new Boton("REGISTRAR", 20, 370);
    private Boton btnCancelar= new Boton("CANCELAR", 190, 370);
    //
    //private Texto txtPosicion = new Texto("Posición:", 20, 430, 100, 20);
    //private Caja tbPosicion = new Caja(160, 435);
    private JTextField tbPas= new CajaPas(190, 435);
    //private Boton btnVisualizar = new Boton("BUSCAR REGISTRO", 20, 430);
    private JButton btnBotonP= new BotonP("BUSCAR REGISTRO",20, 435);
    public VentanaPersonal()
    {
        //AÑADIR OBJETOS
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
        add(tbPas);
        //
        add(btnAceptar);
        add(btnCancelar);
        add(btnBotonP);
        //
        //add(txtPosicion);
        //add(tbPosicion);
        //add(btnVisualizar);
        //
        btnCancelar.addActionListener(this);
        btnAceptar.addActionListener(this);
        //btnVisualizar.addActionListener(this);
        btnBotonP.addActionListener(this);
        //Personalizar el fondo de pantalla con un color personalizado 
        getContentPane().setBackground  (new Color(33, 150, 243)); // Azul vibrante  //(new Color(173, 216, 230)); // Azul claro//(new Color(144, 238, 144)); // Verde claro o verde pasto

        //CONFIG FRAME
        setLayout(null);
        setTitle("LOGIN");
        setSize(450, 550);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btnAceptar) {
            int i = Integer.parseInt(tbId.getText());
            int c = Integer.parseInt(tbCi.getText());
            String n = tbNombre.getText();
            String ap = tbApellidoP.getText();
            String am = tbApellidoM.getText();
            String f = tbFechaN.getText();
            String co = tbCorreo.getText();
            String ca = tbCargo.getText();
            String d = tbDireccion.getText();
            String t = tbTelefono.getText();

            RegistroPersonal ra = new RegistroPersonal(i, c, n, ap, am, f, co, ca, d, t); // Ajusta el constructor de Animal según corresponda
            DBA.setRegistroPersonal(ra);
            setTitle("GUARDADO");

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
        
        
        if (e.getSource() == btnBotonP) {
            try {
                int pos = Integer.parseInt(tbPas.getText());
                RegistroPersonal a = DBA.getRegistroPersonalPos(pos);
                if (a != null) {
                    tbId.setText(String.valueOf(a.getIdPersonal()));
                    tbCi.setText(String.valueOf(a.getCi()));
                    tbNombre.setText(a.getNombre());
                    tbApellidoP.setText(a.getApellidoPaterno());
                    tbApellidoM.setText(a.getApellidoMaterno());
                    tbFechaN.setText(a.getFechaNacimiento());
                    tbCorreo.setText(a.getCorreoElectronico());
                    tbCargo.setText(a.getCargo());
                    tbDireccion.setText(a.getDireccion());
                    tbTelefono.setText(a.getTelefono());
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Registro no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error en el formato de número: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error al visualizar el registro: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == btnCancelar) {
            // Obtener el componente raíz (ventana) que contiene el botón cancelar
            Window window = SwingUtilities.getWindowAncestor((Component) e.getSource());

            // Cerrar la ventana actual
            window.dispose();
        }
    }
  }