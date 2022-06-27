/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.primerprograma;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dfvar
 */
public class PrimerPrograma {
    
    
    public static void main(String[] args) {
       /*int n = Integer.parseInt(JOptionPane.showInputDialog("Número de elementos"));
       int k = Integer.parseInt(JOptionPane.showInputDialog("Elementos a agrupar"));
       int combinatios = (calcFactorial(n) / (calcFactorial(k) * calcFactorial(n-k)));
       JOptionPane.showMessageDialog(null, combinatios);
       */
       Combinaciones com = new Combinaciones(5,2);
        System.out.printf("Las combinaciones son: %d", com.calcCombinaciones());
        }
     
    
    public static int calcFactorial(int number) {
        int fact = 1;
        while( number >= 1) {
            fact *= number--;
        }
        return fact;
    }
  }

