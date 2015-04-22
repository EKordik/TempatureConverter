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
    
    /**
     * Constructor for the TempConverterService. Initializes the Decimal Format
     * class
     */
    public TempConverterService(){
        format = new DecimalFormat("####0.0");
    }
    
    /**
     * Converts a tempature from Celsius to Fahrenheit. 
     * @param tempature - A string representing the tempature to be converted. 
     * Can contain decimal places.
     * @return - Returns a String that is the tempature formatted with one decimal
     * place
     * @throws NumberFormatException - If the String passed in is null, empty, or
     * not a number this exception is thrown.
     */
    public final String convertToFahrenheit(final String tempature) throws NumberFormatException{
        this.tempature = Double.parseDouble(tempature);
        
        convertedTemp = (this.tempature * 9/5) + 32;
        
        return format.format(convertedTemp);
    }
    
    /**
     * Converts a temature from Fahrenheit to Celsius.
     * @param tempature - The Fahrenheit number to be converted. Should be a String
     * that is some sort of number, decimals are accepted.
     * @return - Returns a String that is the Celsius tempature and is formatt 
     * with one decimal place.
     * @throws NumberFormatException -If the String passed in is null, empty, or
     * not a number this exception is thrown.
     */
    
    public final String convertToCelsius(final String tempature) throws NumberFormatException{
        this.tempature = Double.parseDouble(tempature);
        
        convertedTemp = (this.tempature-32) * 5/9;
        
        return format.format(convertedTemp);
        
    }
}
