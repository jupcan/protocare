package Dominio;

public class Especialista {
	private String nombre, DNI, correoE, descripcionEsp, pathFoto, horario;
	private int edad;

	
	public Especialista(String DNI,String nombre, int edad, String horario,
			String correoE, String descripcionEsp, String pathFoto){
		this.nombre = nombre;
		this.DNI = DNI;
		this.edad = edad;
		this.horario = horario;
		this.correoE = correoE;
		this.descripcionEsp = descripcionEsp;
		this.pathFoto = pathFoto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public String getCorreoE() {
		return correoE;
	}


	public void setCorreoE(String correoE) {
		this.correoE = correoE;
	}


	public String getDescripcionEsp() {
		return descripcionEsp;
	}


	public void setDescripcionEsp(String descripcionEsp) {
		this.descripcionEsp = descripcionEsp;
	}


	public String getPathFoto() {
		return pathFoto;
	}


	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
}
