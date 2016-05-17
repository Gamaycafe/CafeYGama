package EJBBDD;

public class Empleados {
	String Codigo_Empleado;
	String DNI;
	String Nombre;
	String Apellido;
	String Direccion;
	String Telefono;
	String Tipo_de_Contacto;
	String Antig�edad;
	int Sueldo;
	String Cargo;
	int Numero_SS;
	
	public Empleados(String codigo_Empleado, String dNI, String nombre, String apellido, String direccion,
			String telefono, String tipo_de_Contacto, String antig�edad, int sueldo, String cargo, int numero_SS) {
		
		Codigo_Empleado = codigo_Empleado;
		DNI = dNI;
		Nombre = nombre;
		Apellido = apellido;
		Direccion = direccion;
		Telefono = telefono;
		Tipo_de_Contacto = tipo_de_Contacto;
		Antig�edad = antig�edad;
		Sueldo = sueldo;
		Cargo = cargo;
		Numero_SS = numero_SS;
	}

	public String getCodigo_Empleado() {
		return Codigo_Empleado;
	}

	public void setCodigo_Empleado(String codigo_Empleado) {
		Codigo_Empleado = codigo_Empleado;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public String getTelefono() {
		return Telefono;
	}

	public void setTelefono(String telefono) {
		Telefono = telefono;
	}

	public String getTipo_de_Contacto() {
		return Tipo_de_Contacto;
	}

	public void setTipo_de_Contacto(String tipo_de_Contacto) {
		Tipo_de_Contacto = tipo_de_Contacto;
	}

	public String getAntig�edad() {
		return Antig�edad;
	}

	public void setAntig�edad(String antig�edad) {
		Antig�edad = antig�edad;
	}

	public int getSueldo() {
		return Sueldo;
	}

	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}

	public String getCargo() {
		return Cargo;
	}

	public void setCargo(String cargo) {
		Cargo = cargo;
	}

	public int getNumero_SS() {
		return Numero_SS;
	}

	public void setNumero_SS(int numero_SS) {
		Numero_SS = numero_SS;
	}

	@Override
	public String toString() {
		return "Codigo_Empleado: " + Codigo_Empleado + ", DNI: " + DNI + ", Nombre: " + Nombre + ", Apellido: "
				+ Apellido + ", Direccion: " + Direccion + ", Telefono: " + Telefono + ", Tipo_de_Contacto: "
				+ Tipo_de_Contacto + ", Antig�edad: " + Antig�edad + ", Sueldo: " + Sueldo + ", Cargo: " + Cargo
				+ ", Numero_SS: " + Numero_SS;
	}
	
}
