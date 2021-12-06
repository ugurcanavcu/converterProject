/**
 * a view class that represent a JPanel
 */

package view;

import javax.swing.JPanel;


public class Panel extends JPanel{
    FeetConversionArea feetArea;
    MeterConversionArea meterArea;
    CentimeterConversionArea cemArea;
    
    /**
     * a constructor that initilized all the areas with defualt values and adds the areas to the panel
     */
    public Panel(){
        feetArea = new FeetConversionArea("0 ft", 18, 20);
        meterArea = new MeterConversionArea("0 m", 18, 20);
        cemArea = new CentimeterConversionArea("0", 18, 20);
        this.add(feetArea);
        this.add(meterArea);
        this.add(cemArea);
    }
    
    /**
     * notifys all the observer classes to update the thier states
     * @param convertedVals area of converted values that are to be updated to the matching area [0] is the feet and [1] is the meter
     */
    public void notify(Double[] convertedVals){
         feetArea.updateText(convertedVals[0]);
         meterArea.updateText(convertedVals[1]);
    }

    /**
     * acceses and return the current input from the centimeter area
     * @return the curernt input from the centimeter area
     */
    public String getInput(){
        return  cemArea.areaContent();
    }
    
}
