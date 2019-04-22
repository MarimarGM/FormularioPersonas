import java.util.List;
import java.util.Scanner;

public class Interfaz {
	
	public Interfaz() {
		
	}
	//método
	public static void mostrarInterfaz() {
		System.out.println("----------------------------------------");
		System.out.println("1. Nuevo usuario.");
		System.out.println("2. Mostrar usuarios.");
		System.out.println("3. Borrar usuario.");
		System.out.println("4. Actualizar usuario.");
		System.out.println("5. Salir.");
		System.out.println("----------------------------------------");
	}
	
	public static List<Persona> crearPersona(List<Persona> listaPersonas) {
		System.out.println("Introduzca el nombre de la persona:");
		String nombre = new Scanner(System.in).next();
		System.out.println("Apellidos de la persona");
		String apellidos = new Scanner(System.in).next();
		System.out.println("Email de la persona");
		String mail = new Scanner(System.in).next();
		
		Persona p = new Persona(nombre, apellidos, mail);
		listaPersonas.add(p);
		return listaPersonas;
	}
	
	public static void listarPersonas(List<Persona> listaPersonas) {
		int i = 1;
		for(Persona p : listaPersonas) {
			System.out.println("Persona: " + i);
			System.out.println("Nombre: " + p.getNombre());
			System.out.println("Apellidos: " + p.getApellidos());
			System.out.println("Mail: " + p.getMail());
			i++;
		}
	}
	
	public void asdf() {
		
	}
}
