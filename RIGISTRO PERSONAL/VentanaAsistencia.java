
/**
 * Write a description of class VentanaAsistencia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPasswordField;
public class VentanaAsistencia extends JFrame implements ActionListener 
{
    private Texto titulo= new Texto("CONTROL ASISTENCIA", 135, 10, 200, 30);
    private Texto txtId= new Texto("Id Personal:", 20, 40, 180, 20);
    private Texto txtCi= new Texto("ci:", 20, 70, 180, 20);
    private Texto txtGenero= new Texto("Genero:", 20, 100, 180, 20);
    private Texto txtCargo= new Texto("Cargo:", 20, 130, 180, 20);
    private Texto txtOcurrencia= new Texto("Ocurrencia:", 20, 160, 180, 20);
    private Texto txtDetalle= new Texto("Detalle:", 20, 190, 180, 20);
    //
    private Caja tbId= new Caja(150, 40);
    private Caja tbCi= new Caja(150, 70);
    private Caja tbGenero= new Caja(150, 100);
    private Caja tbCargo= new Caja(150, 130);
    private Caja tbOcurrencia= new Caja(150, 160);
    private Caja tbDetalle= new Caja(150, 190);
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
    public VentanaAsistencia()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtId);
        add(txtCi);
        add(txtGenero);
        add(txtCargo);
        add(txtOcurrencia);
        add(txtDetalle);
        //
        add(tbId);
        add(tbCi);
        add(tbGenero);
        add(tbCargo);
        add(tbOcurrencia);
        add(tbDetalle);
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
        setSize(450, 460);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == btnAceptar) {
            int i = Integer.parseInt(tbId.getText());
            int c = Integer.parseInt(tbCi.getText());
            char g = tbGenero.getText().charAt(0);
            String ca = tbCargo.getText();
            String o = tbOcurrencia.getText();
            String d = tbDetalle.getText();

            ControlAsistencia ra = new ControlAsistencia(i, c, g, ca, o, d ); // Ajusta el constructor de Animal según corresponda
            DBA.setControlAsistencia(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbId.setText("");
            tbCi.setText("");
            tbGenero.setText("");
            tbCargo.setText("");
            tbOcurrencia.setText("");
            tbDetalle.setText("");
        }
        
        
        if (e.getSource() == btnBotonP) {
            try {
                int pos = Integer.parseInt(tbPas.getText());
                ControlAsistencia c = DBA.getControlAsistenciaPos(pos);
                if (c != null) {
                    tbId.setText(String.valueOf(c.getidPersonal()));
                    tbCi.setText(String.valueOf(c.getci()));
                    tbGenero.setText(String.valueOf(c.getgenero()));
                    tbCargo.setText(c.getcargo());
                    tbOcurrencia.setText(c.getocurrencia());
                    tbDetalle.setText(c.getdetalle());
                    
                    
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