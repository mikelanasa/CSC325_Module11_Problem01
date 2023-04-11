/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.powersocketadapterdesignpattern;

/**
 * Class to hold the main method
 * @author mikel
 */
public class DriverClass {

    public static void main(String[] args) {
        // Demonstrate classes and methods
        AmericanPowerPlug plug1 = new AmericanAppliance();
        
        EuropeanPowerSocket socket1 = new EuropeanPowerSocket();
        
        EuropeanPowerPlug plug2 = new AmericanToEuropeanAdapter(plug1);
        
        socket1.plugInAppliance(plug2);
    } // ends main
} // ends class
