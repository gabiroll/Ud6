package Ud6;

import javax.swing.JOptionPane;

public class ud7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String texto=JOptionPane.showInputDialog("Escribe una cantidad en euros");
	     double cantidad=Double.parseDouble(texto);
	     
	     String moneda=JOptionPane.showInputDialog("Escribe la moneda a pasar");
	     conversor(cantidad, moneda);
	    }
	   public static void conversor (double cantidad, String moneda){
	        double res=0;
	 
	        //Este booleano lo utilizo en caso de que alguien, no introduzca un nombre de moneda correcto
	        boolean correcto = true;
	 
	        //Segun la moneda, calculamos la cantidad
	        switch (moneda){
	        case "libras":
	            res=cantidad*0.86;
	            break;
	        case "dolares":
	            res=cantidad*1.29;
	            break;
	        case "yenes":
	            res=cantidad*129.852;
	            break;
	        default:
	            System.out.println("No has introducido una moneda correcta");
	            correcto=false;
	        }
	 
	        //Solo si es correcto muestra el mensaje
	        if (correcto){
	            System.out.println(cantidad+ " euros en " +moneda+ " son " +res);
	        }
	 
	   }
}

