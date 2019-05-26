package Dominio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestorEspecialista {
	static ArrayList<Especialista> Especialistas = new ArrayList<Especialista>();

	public static void inicializarEspecialistas(){
		Especialista v1, v2;
		/*******************************************************
		 * *v1 = new Especialista("Anastasia", "Yugo Airen", "06829164-K", 23, false, "ayugoa", "gmail", ".es", 
				"Amante de los animales y la naturaleza", "/FotosEjemplo/06829164-K.jpg");
		v2 = new Especialista("Federico", "Paris RodriguÃ©z", "06785132-L", 30, true, "fprguez", "hotmail", ".com",
				"Aficionado a la medicina animal y a cuidar y salvar animales", "/FotosEjemplo/06785132-L.jpg");
		Especialistas.add(v1);
		Especialistas.add(v2);*
		********************************************************************/
	}
	
	/**public static void anadirEspecialista(Especialista Especialista){
		if(Especialistas.add(Especialista))
			JOptionPane.showMessageDialog(null,"El Especialista con DNI: " + Especialista.getDNI() + " ha sido añadido correctamente", "El proceso de añadido ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"No se ha podido añadir el Especialista " + Especialista.getDNI(), "Error al añadir",JOptionPane.ERROR_MESSAGE);
	}**/

	public static ArrayList<Especialista> getEspecialistas() {
		return Especialistas;
	}
	
	public static Especialista buscarEspecialista(String DNI){
		Especialista v = null;
		for(int i = 0; i < Especialistas.size(); i++){
			if((Especialistas.get(i).getDNI()).equals(DNI))
				v = Especialistas.get(i);
		}
		return v;
	}
	
	/***public static void eliminarEspecialista(String DNI){
		Especialista v = null;
		v = buscarEspecialista(DNI);
		if(v != null){
			if(Especialistas.remove(v))
				JOptionPane.showMessageDialog(null,"El Especialista con DNI: " + v.getDNI() + " ha sido eliminado correctamente", "El proceso de eliminaciÃ³n ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"No se ha podido eliminar el Especialista " + v.getDNI(), "Error al eliminar",JOptionPane.ERROR_MESSAGE);
		}else
			JOptionPane.showMessageDialog(null,"No existe el Especialista con DNI: " + v.getDNI(), "Error al encontrar Especialista",JOptionPane.ERROR_MESSAGE);
	}**/
	
	/***public static void modificarEspecialista(Especialista v){
		for(int i = 0; i < Especialistas.size(); i++){
			if(Especialistas.get(i).getDNI().equals(v.getDNI()))
				if(Especialistas.set(i, v) != null)
					JOptionPane.showMessageDialog(null,"El Especialista con DNI: " + v.getDNI() + " ha sido modificado correctamente", "El proceso de modificacion ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"No se ha podido modificar el Especialista " + v.getDNI(), "Error al modificar",JOptionPane.ERROR_MESSAGE);
					
		}**/

	

}
