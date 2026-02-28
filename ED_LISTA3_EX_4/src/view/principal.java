package view;
import controller.metodos;
import javax.swing.*;
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
   int n = Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
   if (n<= 2000) {
	   metodos c = new metodos ();
	   System.out.println(c.converter(n));
   }
  }
}
