package EJBBDD;

public class Conexion {
	int Numero_Conexion;
	String Hora_Inicio;
	String Hora_Final;
	
	public Conexion(int numero_Conexion, String hora_Inicio, String hora_Final) {
		
		Numero_Conexion = numero_Conexion;
		Hora_Inicio = hora_Inicio;
		Hora_Final = hora_Final;
	}

	public int getNumero_Conexion() {
		return Numero_Conexion;
	}

	public void setNumero_Conexion(int numero_Conexion) {
		Numero_Conexion = numero_Conexion;
	}

	public String getHora_Inicio() {
		return Hora_Inicio;
	}

	public void setHora_Inicio(String hora_Inicio) {
		Hora_Inicio = hora_Inicio;
	}

	public String getHora_Final() {
		return Hora_Final;
	}

	public void setHora_Final(String hora_Final) {
		Hora_Final = hora_Final;
	}

	@Override
	public String toString() {
		return "Numero_Conexion: " + Numero_Conexion + ", Hora_Inicio: " + Hora_Inicio 
				+ ", Hora_Final: " + Hora_Final;
	}
	
	
}
