package Ud6;

import javax.swing.JOptionPane;

public class Ud4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto=JOptionPane.showInputDialog("Introduce un numero");
        int numero=Integer.parseInt(texto);
        System.out.println("El factorial de "+numero+ " es " +factorial(numero));
    }
   public static int factorial (int numero){
        int res=numero;
        //Se inicia con el numero anterior al que introducimos
        for(int cont=(numero-1);cont>0;cont--){
            //Acumulamos el resultado
            res=res*cont;
        }
        return res;
    }
}
		


