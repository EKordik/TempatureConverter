/*
 * Emma Kordik
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tempatureconverter;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author emmakordik
 */
public class TempConverterService {
    private double tempature;
    private double convertedTemp;
    private DecimalFormat format;
    
    public TempConverterService(){
        format = new DecimalFormat("####0.0");
    }
    public String convertToFahrenheit(String tempature) throws NumberFormatException{
        this.tempature = Double.parseDouble(tempature);
        
        convertedTemp = (this.tempature * 9/5) + 32;
        
        return format.format(convertedTemp);
    }
    
    public String convertToCelsius(String tempature) throws NumberFormatException{
        this.tempature = Double.parseDouble(tempature);
        
        convertedTemp = (this.tempature-32) * 5/9;
        
        return format.format(convertedTemp);
        
    }
}
