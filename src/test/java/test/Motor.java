package test;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cmabiarRegistro(int registro) {
		this.registro=registro;
	}
	void asignarTipo(String tipo) {
		if (tipo=="gasolina"||tipo=="electrico") {
			this.tipo=tipo;
		}
	}
}
