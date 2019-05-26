package Dominio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;


public class GestorUsuario {
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public static void inicializarUsuarios(){
		Usuario user1, user2;
		user1 = new Usuario("00000000-A", "root", "Benito", "03/01/2016", "09:13:27");
		user2 = new Usuario("11111111-B", "alumno", "Manolo", "04/01/2016", "15:03:18");
		usuarios.add(user1);
		usuarios.add(user2);
	}

	public static Usuario autenticar(String usuario, String password){
		Usuario user = buscarUsuario(usuario);
		if(user == null)
			JOptionPane.showMessageDialog(null,"El usuario proporcionado no existe", "Error. Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
		else{
			if(!user.getPassword().equals(password)){
				user = null;
				JOptionPane.showMessageDialog(null,"La contraseña proporcionada no es correcta", "Contraseña incorrecta",JOptionPane.ERROR_MESSAGE);
			}
		}
		return user;
	}

	private static Usuario buscarUsuario(String usuario){
		Usuario user = null;
		for (int i = 0; i < usuarios.size(); i++){
			if(usuarios.get(i).getUsuario().equals(usuario))
				user = usuarios.get(i);
		}	
		return user;
	}
	
	public static void actualizarInicioSesion(String usuario){
		Usuario u = buscarUsuario(usuario);
		Date fechaActual = new Date();
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        String fechaUltimoAcceso, horaUltimoAcceso;
        fechaUltimoAcceso = formatoFecha.format(fechaActual);
        horaUltimoAcceso = formatoHora.format(fechaActual);
        u.setFechaUltimoAcceso(fechaUltimoAcceso);
        u.setHoraUltimoAcceso(horaUltimoAcceso);
	}
	
}
