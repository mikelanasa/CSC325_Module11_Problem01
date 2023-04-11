/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.powersocketadapterdesignpattern;

/**
 * Class to hold the American appliance
 * @author mikel
 */
public class AmericanAppliance implements AmericanPowerPlug{
    // Override method from AmericanPowerPlug
    @Override
    public void sendPower() {
        System.out.println("This is an American appliance.\nNot designed for European sockets.");
    }
} // ends class
