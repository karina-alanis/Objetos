package cuadrado;

import java.lang.Math;
import java.util.Scanner;

import javax.swing.*;
public class Cuadrado{
    
    public static void main(String[] args) {
    
  JOptionPane.showMessageDialog(null,"Cuadrado");      
   
  String numero=JOptionPane.showInputDialog("dame el tamaño del lado de tu cuadrado");
  int lado=Integer.parseInt(numero);
  
  int perimetro=lado*4;
  System.out.println("en perimetro es"+perimetro);
        
  int area=lado*lado;
  System.out.println("el area es:"+area);
    }
    
    
}



