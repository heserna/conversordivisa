package ejerciciodivisas;
import java.util.*;

public class Conversor {
public Divisa dref;
protected Map<String , Divisa>  ColeccionDivisas;

public Conversor(Divisa d) {
	this.dref=d;
	this.ColeccionDivisas= new HashMap<>();
	this.ColeccionDivisas.put( d.getNombre(),d);
}

public Conversor(Divisa d, Map<String, Divisa> m) {
	this.dref=d;
	this.ColeccionDivisas= m;
	
}

public void Ampliarcoleccion(Divisa d) {
	this.ColeccionDivisas.put( d.getNombre(),d);
}

public double Convertir(Divisa d1, Divisa d2, double cantidad) {
	if (d1.mismadivisa(d2)) return cantidad;
	else return (cantidad*d1.getValor())/d2.getValor();
}

public boolean ExisteDivisa( Divisa d) {
	return this.ColeccionDivisas.containsKey(d.getNombre());
}


	
}

