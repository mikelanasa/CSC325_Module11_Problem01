/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapterdesignpattern;

/**
 *
 * @author mikel
 */
public class AmericanToEuropeanAdapter implements EuropeanPowerPlug {
    // Member variable holds American power plug
    private AmericanPowerPlug plug;
    
    // Constructor
    public AmericanToEuropeanAdapter(AmericanPowerPlug plug){
        this.plug = plug; 
    }
    
    // Override method from EuropeanPowerPlug
    @Override
    public void supplyPower() {
            plug.sendPower();
    } 
} // ends class
