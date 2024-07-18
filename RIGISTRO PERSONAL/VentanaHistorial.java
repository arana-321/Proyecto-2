
/**
 * Write a description of class VentanaHistorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPasswordField;
public class VentanaHistorial extends JFrame implements ActionListener
{
    private Texto titulo= new Texto("REGISTRO HISTORIAL", 115, 10, 200, 30);
    private Texto txtId= new Texto("Id Personal:", 20, 40, 180, 20);
    private Texto txtCi= new Texto("ci:", 20, 70, 180, 20);
    private Texto txtEdad= new Texto("Edad:", 20, 100, 180, 20);
    private Texto txtDireccion= new Texto("Direccion:", 20, 130, 180, 20);
    private Texto txtEstudios= new Texto("Estudios:", 20, 160, 180, 20);
    private Texto txtAnhos= new Texto("Años Experiencia:", 20, 190, 180, 20);
    //
    private Caja tbId= new Caja(150, 40);
    private Caja tbCi= new Caja(150, 70);
    private Caja tbEdad= new Caja(150, 100);
    private Caja tbDireccion= new Caja(150, 130);
    private Caja tbEstudios= new Caja(150, 160);
    private Caja tbAnhos= new Caja(150, 190);
    //
    private Boton btnAceptar= new Boton("REGISTRAR", 20, 260);
    private Boton btnCancelar= new Boton("CANCELAR", 190, 260);
    //
    //private Texto txtPosicion = new Texto("Posición:", 20, 430, 100, 20);
    //private Caja tbPosicion = new Caja(160, 435);
    private JTextField tbPas= new CajaPas(190, 325);
    //private Boton btnVisualizar = new Boton("BUSCAR REGISTRO", 20, 430);
    private JButton btnBotonP= new BotonP("BUSCAR REGISTRO",20, 325);
    //
    public VentanaHistorial()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtId);
        add(txtCi);
        add(txtEdad);
        add(txtDireccion);
        add(txtEstudios);
        add(txtAnhos);
        //
        add(tbId);
        add(tbCi);
        add(tbEdad);
        add(tbDireccion);
        add(tbEstudios);
        add(tbAnhos);
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
        setSize(400, 500);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btnAceptar) {
            int i = Integer.parseInt(tbId.getText());
            int c = Integer.parseInt(tbCi.getText());
            String g = tbEdad.getText();
            String d = tbDireccion.getText();
            String o = tbEstudios.getText();
            String a = tbAnhos.getText();

            HistorialRegistros ra = new HistorialRegistros(i, c, g, d, o, a ); // Ajusta el constructor de Animal según corresponda
            DBA.setHistorialRegistros(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbId.setText("");
            tbCi.setText("");
            tbEdad.setText("");
            tbDireccion.setText("");
            tbEstudios.setText("");
            tbAnhos.setText("");
        }
        
        
        if (e.getSource() == btnBotonP) {
            try {
                int pos = Integer.parseInt(tbPas.getText());
                HistorialRegistros h = DBA.getHistorialRegistrosPos(pos);
                if (h != null) {
                    tbId.setText(String.valueOf(h.getidPersonal()));
                    tbCi.setText(String.valueOf(h.getci()));
                    tbEdad.setText(h.getedad());
                    tbDireccion.setText(h.getdireccion());
                    tbEstudios.setText(h.getestudios());
                    tbAnhos.setText(h.getanhosExp());
                    
                    
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
