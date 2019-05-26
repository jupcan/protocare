package Dominio;

public class Paciente {
	private String id, nombre,antecedentes, vacunas, tratamiento, pathFoto;
	private boolean intervencion,cronica,alergias;//SEXO
	private int edad;
	
	public Paciente(String id, String nombre, int edad, String antecedentes, String vacunas,String tratamiento,
			boolean intervencion, boolean cronica, boolean alergias, String pathFoto){
		this.id = id;
		this.nombre = nombre;
		this.antecedentes = antecedentes;
		this.edad = edad;
		this.vacunas = vacunas;
		this.tratamiento = tratamiento;
		this.intervencion = intervencion;
		this.cronica = cronica;
		this.alergias=alergias;
		this.pathFoto = pathFoto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPathFoto() {
		return pathFoto;
	}

	public void setPathFoto(String pathFoto) {
		this.pathFoto = pathFoto;
	}


	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}

	public String getVacunas() {
		return vacunas;
	}

	public void setVacunas(String vacunas) {
		this.vacunas = vacunas;
	}

	public String getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}

	public boolean isIntervencion() {
		return intervencion;
	}

	public boolean isCronica() {
		return cronica;
	}


	public boolean isAlergias() {
		return alergias;
	}


}
