import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		List<Persona> listaPersonas = new ArrayList<>();
		String variableString = "";
		
		while (!variableString.equals("5")) {
			Interfaz.mostrarInterfaz();
			System.out.println("Elige una opción:");
			variableString = new Scanner(System.in).next();
			
			if (variableString.equals("1")) {
				Interfaz.crearPersona(listaPersonas);
			}
			
			if (variableString.equals("2")) {
				Interfaz.listarPersonas(listaPersonas);
			}
		}
	}
	
}
