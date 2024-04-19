
package sommagrafica;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

/**
 *
 * @author UTENTE 1
 */
public class GestoreAzioni implements ActionListener {

    private JTextField jTextFieldNUMERO1;
    private JTextField jTextFieldNUMERO2;
    private JTextField jTextFieldRISULTATO;
    
    public GestoreAzioni(){}

    public GestoreAzioni(JTextField jTextFieldNUMERO1, JTextField jTextFieldNUMERO2, JTextField jTextFieldRISULTATO) {
        this.jTextFieldNUMERO1 = jTextFieldNUMERO1;
        this.jTextFieldNUMERO2 = jTextFieldNUMERO2;
        this.jTextFieldRISULTATO = jTextFieldRISULTATO;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        float somma;
        String premiBottone = e.getActionCommand();
        try{
            if(premiBottone.equals("Somma")){
                somma = Float.parseFloat(this.jTextFieldNUMERO1.getText()) + Float.parseFloat(this.jTextFieldNUMERO2.getText());
                this.jTextFieldRISULTATO.setText(String.valueOf(somma));
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ERRORE!!! IMPOSSIBILE EFFETTUARE LA SOMMA (Errore x041)", "INSERIRE SOLO  NUMERI INTERI O DECIMALI NEI CAMPI", JOptionPane.ERROR_MESSAGE);
            this.jTextFieldNUMERO1.setText("");
            this.jTextFieldNUMERO2.setText("");
            this.jTextFieldRISULTATO.setText("");
        }
        if(premiBottone.equals("Cancella")){
            this.jTextFieldNUMERO1.setText("");
            this.jTextFieldNUMERO2.setText("");
            this.jTextFieldRISULTATO.setText("");
        }
        if(premiBottone.equals("Esci")){
            System.extit(0);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
