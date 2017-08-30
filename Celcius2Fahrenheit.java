import static javax.swing.JOptionPane.*;
public class Celcius2Fahrenheit{
   public static void main (String[]args){
      float celcius=Float.parseFloat(showInputDialog("Ingresa los grados Celicius "));
      float f=(float)(celcius*1.8)+32;
      showMessageDialog(null,celcius+" grados celcius son: "+f+" grados fahrenheit");
   
   
   }//main

}//Fin