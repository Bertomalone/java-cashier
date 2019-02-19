/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginAndRegisters;

import LoginAndRegister.view.ADMIN_JFrame;
import LoginAndRegister.view.LoginForm;
import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author bertomalone
 */
public class Main {
    
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                ADMIN_JFrame mUtama=new ADMIN_JFrame();
                mUtama.setExtendedState(JFrame.MAXIMIZED_BOTH);
                
                mUtama.setVisible(true);
            }
        });
        
    }
}
