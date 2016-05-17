package EJBBDD;

public class Ordenador {
	String Codigo_Ordenador;
	int Contador;
	
	public Ordenador(String codigo_Ordenador, int contador) {
		
		Codigo_Ordenador = codigo_Ordenador;
		Contador = contador;
	}

	public String getCodigo_Ordenador() {
		return Codigo_Ordenador;
	}

	public void setCodigo_Ordenador(String codigo_Ordenador) {
		Codigo_Ordenador = codigo_Ordenador;
	}

	public int getContador() {
		return Contador;
	}

	public void setContador(int contador) {
		Contador = contador;
	}

	@Override
	public String toString() {
		return "Codigo_Ordenador: " + Codigo_Ordenador + ", Contador: " + Contador;
	}
	
}
