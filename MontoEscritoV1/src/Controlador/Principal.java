package Controlador;

import javax.swing.JOptionPane;
import Modelo.Numero;
import Modelo.Persistencia;

public class Principal {

	//Atributos que vienen del Modelo 
	static Persistencia data; 
	static Numero numero; 
	
	/*
	 * Metodo main(), punto de entrada a la ejecución de la aplicación
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numero = new Numero();
		data = new Persistencia();

		solicitarNumero();
		calcularMonto();
		imprimirMonto();
	}
	
	/*
	 *Responsabilidad del metodo solicitarNumero(): 
	 *Realiza ingreso del nùmero por teclado, y ejecuta la valida del rango
	 *Si es el correcto, asigna el valor al objeto numero, que es la instancia de la clase Numero en MODELO
	*/
	
	public static void solicitarNumero()
	{
		int n=0;
		
		n = obtenerEntero("Ingrese un Valor");
		
		if (!validarNumero(n))
			mostrarAlerta("Número Fuera de Rango");
		else
			numero.setValor(n);
	}
	
	//metodo auxiliar que valida si el número ingresado está en el rango indicado 
	public static boolean validarNumero(int n)
	{
		if (n >= 0 && n<= 99)
			return true;
		else
			return false;
	}
	
	/*
	 *Responsabilidad del metodo calcularMonto(): 
	 *Realiza la conversión del atributo "valor" del objeto numero, y asigna al atributo "monto" el string correspondiente
	 *al monto escrito resultante.
	*/
	
	public static void calcularMonto()
	{
		String cadena = "";
		int unidad=0, decena=0;
		decena = numero.getValor() / 10;
		unidad = numero.getValor() % 10;
		
		if(decena == 0)
		{
			cadena = data.unidades[unidad];
		}
		else if (decena == 1)
		{
			cadena = data.onceal19[unidad];
		}
		else if (decena == 2)
		{
			if (unidad == 0)
				cadena = data.decenas[decena-2];
			else
				cadena = data.veinti + data.unidades[unidad];
		}
		else if (decena > 2)
		{
			if (unidad == 0)
				cadena = data.decenas[decena-2];
			else
				cadena = data.decenas[decena-2] + " y " +data.unidades[unidad];
		}
		numero.setMonto(cadena + " " + data.moneda);
	}
	
	/*
	 *Responsabilidad del metodo imprimirMonto(): 
	 *Imprime el monto escrito resultante por pantalla.
	*/	
	public static void imprimirMonto()
	{
		String mensaje = "El monto escrito de: "+numero.getValor()+" es:\n"+numero.getMonto();
		JOptionPane.showMessageDialog(null, mensaje, data.nombreApp, JOptionPane.INFORMATION_MESSAGE);
	}
	
	
	//metodo auxilar que muestra una alerta por pantalla
	public static void mostrarAlerta(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje, data.nombreApp, JOptionPane.ERROR_MESSAGE);
	}

	
	//metodo auxilar que pide por dialogo en pantalla un número entero
	public static int obtenerEntero(String mensaje)
	{
		String cad = JOptionPane.showInputDialog(null, mensaje);
		if (cad != null)
			return Integer.parseInt(cad);
		else
			return-1;
	}
}
