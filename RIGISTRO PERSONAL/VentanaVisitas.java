
/**
 * Write a description of class VentanaVisitas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPasswordField;
public class VentanaVisitas extends JFrame implements ActionListener 
{
    private Texto titulo= new Texto("CONTROL VISITAS", 140, 10, 200, 30);
    private Texto txtId= new Texto("Id Visita:", 20, 40, 180, 20);
    private Texto txtNombre= new Texto("Nombre:", 20, 70, 180, 20);
    private Texto txtApellidoP= new Texto("Apellido Paterno:", 20, 100, 180, 20);
    private Texto txtApellidoM= new Texto("Apellido Materno:", 20, 130, 180, 20);
    private Texto txtCi= new Texto("Ci:", 20, 160, 180, 20);
    private Texto txtCargo= new Texto("Cargo:", 20, 190, 180, 20);
    private Texto txtHoraI= new Texto("Hora ingreso:", 20, 220, 180, 20);
    private Texto txtHoraS= new Texto("hora Salida:", 20, 250, 180, 20);
    //
    private Caja tbId= new Caja(150, 40);
    private Caja tbNombre= new Caja(150, 70);
    private Caja tbApellidoP= new Caja(150, 100);
    private Caja tbApellidoM= new Caja(150, 130);
    private Caja tbCi= new Caja(150, 160);
    private Caja tbCargo= new Caja(150, 190);
    private Caja tbHoraI= new Caja(150, 220);
    private Caja tbHoraS= new Caja(150, 250);
    //
    private Boton btnAceptar= new Boton("REGISTRAR", 20, 320);
    private Boton btnCancelar= new Boton("CANCELAR", 190, 320);
    //
    //private Texto txtPosicion = new Texto("Posición:", 20, 430, 100, 20);
    //private Caja tbPosicion = new Caja(160, 435);
    private JTextField tbPas= new CajaPas(190, 380);
    //private Boton btnVisualizar = new Boton("BUSCAR REGISTRO", 20, 430);
    private JButton btnBotonP= new BotonP("BUSCAR REGISTRO",20, 380);
    public VentanaVisitas()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtId);
        add(txtNombre);
        add(txtApellidoP);
        add(txtApellidoM);
        add(txtCi);
        add(txtCargo);
        add(txtHoraI);
        add(txtHoraS);
        //
        add(tbId);
        add(tbNombre);
        add(tbApellidoP);
        add(tbApellidoM);
        add(tbCi);
        add(tbCargo);
        add(tbHoraI);
        add(tbHoraS);
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
            String n = tbNombre.getText();
            String ap = tbApellidoP.getText();
            String am = tbApellidoM.getText();
            int c = Integer.parseInt(tbCi.getText());
            String ca = tbCargo.getText();
            String h = tbHoraI.getText();
            String s = tbHoraS.getText();

            ControlVisitas ra = new ControlVisitas(i, n, ap, am, c, ca, h, s); // Ajusta el constructor de Animal según corresponda
            DBA.setControlVisitas(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbId.setText("");
            tbNombre.setText("");
            tbApellidoP.setText("");
            tbApellidoM.setText("");
            tbCi.setText("");
            tbCargo.setText("");
            tbHoraI.setText("");
            tbHoraS.setText("");
        }
        
        
        if (e.getSource() == btnBotonP) {
            try {
                int pos = Integer.parseInt(tbPas.getText());
                ControlVisitas v = DBA.getControlVisitasPos(pos);
                if (v != null) {
                    tbId.setText(String.valueOf(v.getidVisita()));
                    tbNombre.setText(v.getNombre());
                    tbApellidoP.setText(v.getApellidoPaterno());
                    tbApellidoM.setText(v.getApellidoMaterno());
                    tbCi.setText(String.valueOf(v.getCi()));
                    tbCargo.setText(v.getcargo());
                    tbHoraI.setText(v.gethoraIngreso());
                    tbHoraS.setText(v.gethoraSalida());
                    
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
