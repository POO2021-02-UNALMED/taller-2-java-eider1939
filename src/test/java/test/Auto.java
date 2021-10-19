package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
    int cantidadAsientos() {
		int cantAsientos=0;
		for (int i=0;i<asientos.length;i++) {
			cantAsientos++;
		}
		return cantAsientos;
	}
	String verificarIntegridad() {
		boolean original=true;
		if(motor.registro!=registro) {
			original=false;
		}
		else {
			for(int i=0;i<asientos.length;i++) {
				if(asientos[i] instanceof Asiento) {
					if (asientos[i].registro!=registro) {
						original=false;
					}
				}
			}
		}
		
		if(original==false) {
			return "Las piezas no son originales";
			
		}
		else {
			return "Auto original";
		}
	}
	 
}