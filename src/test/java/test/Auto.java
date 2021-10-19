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
	String verificarIntegridad(){
		String veri;
		if (this.registro != asientos[0].registro || motor.registro!=asientos[0].registro || this.registro!=motor.registro) {
			veri ="Las piezas no son originale";
		}
		else {
			veri="Auto original";
		}
		return veri;
	}
	 
}