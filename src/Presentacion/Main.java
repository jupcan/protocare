package Presentacion;


import Dominio.GestorPaciente;
import Dominio.GestorUsuario;
import Dominio.GestorEspecialista;

public class Main {
	public static void main(String[] args) {
		initialize();
		Login.main(null);
	}
	
	private static void initialize(){
		GestorUsuario.inicializarUsuarios();
		GestorPaciente.inicializarPacientes();
		GestorEspecialista.inicializarEspecialistas();

	}
}
