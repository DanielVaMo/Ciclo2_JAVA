/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerprograma;

/**
 *
 * @author dfvar
 */
public class Combinaciones {
    
    private int numberElements;
    private int numberGroups;
    
    public Combinaciones() {}
    public Combinaciones(int numberElements, int numberGroups) {
        this.numberElements = numberElements;
        this.numberGroups = numberGroups;
    }

    public int getNumberElements() {
        return numberElements;
    }

    public int getNumberGroups() {
        return numberGroups;
    }

    public void setNumberElements(int numberElements) {
        this.numberElements = numberElements;
    }

    public void setNumberGroups(int numberGroups) {
        this.numberGroups = numberGroups;
    }
    
    public int calcFactorial(int number) {
        int fact = 1;
        while( number >= 1) {
            fact *= number--;
        }
        return fact;
    }
    
    public int calcCombinaciones() {
        return calcFactorial(this.numberElements) /(calcFactorial(this.numberGroups) * 
                calcFactorial(this.numberElements- this.numberGroups)); 
    }
    
}

