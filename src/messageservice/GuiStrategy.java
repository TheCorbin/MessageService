/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package messageservice;

import javax.swing.JOptionPane;

/**
 *
 * @author ryancorbin
 */
public class GuiStrategy implements MessageOutput {

    @Override
    public void output(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
}
