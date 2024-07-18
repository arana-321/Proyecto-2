
/**
 * Write a description of class VentanaRestringidos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.JPasswordField;
public class VentanaRestringidos extends JFrame implements ActionListener 
{
    private Texto titulo= new Texto("RESTRINGIDOS", 150, 10, 200, 30);
    private Texto txtId= new Texto("Id Personal:", 20, 40, 180, 20);
    private Texto txtCi= new Texto("ci:", 20, 70, 180, 20);
    private Texto txtRestringio= new Texto("Restringio:", 20, 100, 180, 20);
    private Texto txtMotivo= new Texto("Motivo Restriccion:", 20, 130, 180, 20);
    private Texto txtInicio= new Texto("Inicio:", 20, 160, 180, 20);
    private Texto txtFinal= new Texto("Final:", 20, 190, 180, 20);
    //
    private Caja tbId= new Caja(150, 40);
    private Caja tbCi= new Caja(150, 70);
    private Caja tbRestringio= new Caja(150, 100);
    private Caja tbMotivo= new Caja(150, 130);
    private Caja tbInicio= new Caja(150, 160);
    private Caja tbFinal= new Caja(150, 190);
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
    public VentanaRestringidos()
    {
        //AÑADIR OBJETOS
        add(titulo);
        add(txtId);
        add(txtCi);
        add(txtRestringio);
        add(txtMotivo);
        add(txtInicio);
        add(txtFinal);
        //
        add(tbId);
        add(tbCi);
        add(tbRestringio);
        add(tbMotivo);
        add(tbInicio);
        add(tbFinal);
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
            String r = tbRestringio.getText();
            String m = tbMotivo.getText();
            String in = tbInicio.getText();
            String f = tbFinal.getText();

            Restringidos ra = new Restringidos(i, c, r, m, in, f ); // Ajusta el constructor de Animal según corresponda
            DBA.setRestringidos(ra);
            setTitle("GUARDADO");

            // Limpiar los campos después del registro
            tbId.setText("");
            tbCi.setText("");
            tbRestringio.setText("");
            tbMotivo.setText("");
            tbInicio.setText("");
            tbFinal.setText("");
        }
        
        
        if (e.getSource() == btnBotonP) {
            try {
                int pos = Integer.parseInt(tbPas.getText());
                Restringidos r = DBA.getRestringidosPos(pos);
                if (r != null) {
                    tbId.setText(String.valueOf(r.getidPersonal()));
                    tbCi.setText(String.valueOf(r.getci()));
                    tbRestringio.setText(r.getrestringio());
                    tbMotivo.setText(r.getmotivoRestriccion());
                    tbInicio.setText(r.getinicio());
                    tbFinal.setText(r.getfinalR());
                    
                    
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
