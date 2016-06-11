package co.edu.usbcali.scm.Impl;

import co.edu.usbcali.scm.Icalculadora;

public class Calculadora implements Icalculadora{

	private int result=0;
	
	public void sumar(int numero1, int numero2) {
		result = (numero1 + numero2);
		
	}

	public void restar(int numero1, int numero2) {
		result = (numero1 - numero2);
		
	}

	public int getresultado() {
		return result;
		
	}
	
	public void Imprimir() {
	   
		System.out.print(""+ result);		
	}

}
