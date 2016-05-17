package EJBBDD;

public class Factura_Productos {
	int Cantidad;
	int Precio;
	
	public Factura_Productos(int cantidad, int precio) {
		
		Cantidad = cantidad;
		Precio = precio;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getPrecio() {
		return Precio;
	}

	public void setPrecio(int precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "Cantidad: " + Cantidad + ", Precio: " + Precio;
	}
	
}
