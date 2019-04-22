
public class Persona {
	//atributos
	private String nombre;
	private String apellidos;
	private String mail;
	//constructor vacio
	public Persona() {
		
	}
	//constructor
	public Persona(String nombre, String apellidos, String mail) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.mail = mail;
	}
	//métodos getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
	
	
	
	

}
