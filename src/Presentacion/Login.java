package Presentacion;

public class Login {
	public static void main(String [] args){
	
	}
	
	private boolean verificarDNI(String DNI) {
		boolean check = true;
		// Eliminamos el guion y dividimos el DNI en las variables con la informacion que nos hace falta
		DNI = DNI.replaceAll("[-]", ""); //$NON-NLS-1$ //$NON-NLS-2$
		char letraDNI = DNI.charAt(8);
		String numerosDNI = DNI.substring(0, 8);
		int digitos;
		//Comprobamos la longitud del DNI introducido
		if (DNI.length() != 9)
			check = false;
		// Comprobamos si el ultimo caracter es una letra
		if (!Character.isLetter(letraDNI))
			check = false;
		try {
			digitos = Integer.parseInt(numerosDNI);
		} catch (NumberFormatException e) {
			check = false;
		}
		return check;
	}
}
