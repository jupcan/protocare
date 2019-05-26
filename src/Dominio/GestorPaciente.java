package Dominio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GestorPaciente {

	static ArrayList<Paciente> Pacientes = new ArrayList<Paciente>();

	public static void inicializarPacientes(){
		Paciente Paciente1, Paciente2;
		
		/*******************************
		  Paciente1 = new Paciente("045PA", "ComoTu", "Pastor Alemán", false, null, 2, "Macho", true, false, 
				"Juguetón, cariñoso y fiel", "/FotosEjemplo/045PA.jpg");
		Paciente2 = new Paciente("039DC", "Nala", "Beagle", true, "6552-K", 3, "Hembra", true, false, 
				"Cariñosa y juguetona. Le encanta pasear", "/FotosEjemplo/039DC.jpg");
		Pacientes.add(Paciente1);
		Pacientes.add(Paciente2); 
		**********************************************/
	}

	public static void anadirPaciente(Paciente Paciente){
		if(Pacientes.add(Paciente))
			JOptionPane.showMessageDialog(null,"El Paciente con ID: " + Paciente.getId() + " ha sido añadido correctamente", "El proceso de añadido ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"No se ha podido añadir el Paciente " + Paciente.getId(), "Error al añadir",JOptionPane.ERROR_MESSAGE);
	}

	public static ArrayList<Paciente> getPacientes() {
		return Pacientes;
	}

	public static Paciente buscarPaciente(String ID){
		Paciente p = null;
		for(int i = 0; i < Pacientes.size(); i++){
			if((Pacientes.get(i).getId()).equals(ID))
				p = Pacientes.get(i);
		}
		return p;
	}

	public static void eliminarPaciente(String ID){
		Paciente p = null;
		p = buscarPaciente(ID);
		if(p != null){
			if(Pacientes.remove(p))
				JOptionPane.showMessageDialog(null,"El Paciente con ID: " + p.getId() + " ha sido eliminado correctamente", "El proceso de eliminaciÃ³n ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"No se ha podido eliminar el Paciente " + p.getId(), "Error al eliminar",JOptionPane.ERROR_MESSAGE);
		}else
			JOptionPane.showMessageDialog(null,"No existe el Paciente con ID: " + p.getId(), "Error al encontrar Paciente",JOptionPane.ERROR_MESSAGE);
	}

	public static void modificarPaciente(Paciente p){
		for(int i = 0; i < Pacientes.size(); i++){
			if(Pacientes.get(i).getId().equals(p.getId()))
				if(Pacientes.set(i, p) != null)
					JOptionPane.showMessageDialog(null,"El Paciente con ID: " + p.getId() + " ha sido modificado correctamente", "El proceso de modificacion ha terminado correctamente",JOptionPane.INFORMATION_MESSAGE);
				else
					JOptionPane.showMessageDialog(null,"No se ha podido modificar el Paciente " + p.getId(), "Error al modificar",JOptionPane.ERROR_MESSAGE);
					
		}

	}
}
