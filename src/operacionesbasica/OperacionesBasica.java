/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionesbasica;

import javax.swing.JOptionPane;


public class OperacionesBasica {

    
    
    public static void main(String[] args) {
        int num1;
        int num2;
        int menu;
        do{
           menu = Integer.parseInt(JOptionPane.showInputDialog("seleccion la opcion"
           + "\n1. Sumar"
           + "\n2. Restar"
           + "\n3. Multiplicacion" 
           + "\n4. Division"        
           + "\n5. Salir"));        
           
           switch(menu){
               case 1:
                   num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 1"));
                   num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 2"));
                   JOptionPane.showMessageDialog(null, "el resultado de la suma es: "+suma(num1, num2));
                   break;
               case 2:
                   num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 1"));
                   num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 2"));
                   JOptionPane.showMessageDialog(null, "el resulrado de la resta es: "+resta(num1,num2));
                   break;
               case 3:  
                   num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 1"));
                   num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 2"));
                   JOptionPane.showMessageDialog(null, "el resulrado de la multiplicacion es: "+multiplicacion(num1,num2));
                   break;
               case 4:
                   num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 1"));
                   num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para el numero 2"));
                   JOptionPane.showMessageDialog(null, "el resulrado de la division es: "+division(num1,num2));
                   break;
               case 5:
                   JOptionPane.showMessageDialog(null, "usted seleccion salir");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "usted seleccion una opcion invalida");
                   break;          
           }                
        }while(menu!=5);
    }
    
    public static int suma(int numero1, int numero2){
        int resultado;
        resultado = numero1 + numero2;
        return resultado;
        
    }
    public static int resta(int numero1, int numero2){
        int resultado;
        resultado = numero1 - numero2;
        return resultado;
    }
    public static int multiplicacion(int numero1, int numero2){
        int resultado;
        resultado = numero1 * numero2;
        return resultado;
    }    
    public static double division(int numero1, int numero2){
        double resultado;
        resultado = numero1 / numero2;
        return resultado;
    }
}

