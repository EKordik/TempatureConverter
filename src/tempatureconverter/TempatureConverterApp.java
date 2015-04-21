/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempatureconverter;

import javax.swing.UIManager;

/**
 *
 * @author emmakordik
 */
public class TempatureConverterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try {
            // Set Look & Feel
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            //Exception being ignored.
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TempConvertGUI().setVisible(true);
            }
        });
    }
    
}
