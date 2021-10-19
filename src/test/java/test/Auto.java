package test;

public class Auto {
	String modelo;
	int precio;
	Asiento asientos[];
	String marca;
	Motor motor;
	int registro;
	int cantidadCreados;
	
    public int cantidadAsientos() {
		int cont = 0;
		for (int i = 0; i<asientos.length; i++) {
			if (asientos[i] != null) {
			cont ++;
			}
		}
		return cont;
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