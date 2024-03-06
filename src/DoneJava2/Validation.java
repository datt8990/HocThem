/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoneJava2;

import java.awt.Color;
import java.awt.TextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author admin
 */
public class Validation {

    public static boolean isEmpty(JTextField jtextField, String msg) {
        String txtValue = jtextField.getText().trim();
        if (txtValue.length() == 0) {
            JOptionPane.showMessageDialog(null, msg);
            jtextField.setBackground(Color.red);
            return true;

        }
        jtextField.setBackground(Color.white);
        return false;

    }
}
