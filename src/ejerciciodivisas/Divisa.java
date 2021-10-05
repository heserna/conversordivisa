package ejerciciodivisas;

public class Divisa {
	
	public String nombre;
	public double valor;
	
	public Divisa(String n, double v) {
		this.nombre = n;
		this.valor = v;
	}
	
	public void cambiar_valor(String n, double v) {
		// Pre: n debe ser nombre de una divisa existente
		//post: se cambiará el valor de cambio de la divisa de nombre n a un nuevo valor v.
		if(this.nombre == n)this.valor=v;
	}
	
	public boolean mismadivisa(Divisa d) {
		// Pre : La divisa d debe estar creada , las divisas se crean todas en singular .
		// Post: devuelve verdadero si el nombre de la divisa es el mismo aunque uno este en mayusculas.
		return this.nombre.equalsIgnoreCase(d.nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	

}
