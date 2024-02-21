package logica;

public class mujer extends Persona {
	public mujer(float peso, float altura, int edad) {
		super(peso, altura, edad);

	}
	public float calcularTMB() {
		return 447.593f + (9.247f * peso) + (3.098f * altura) - (4.33f * edad);
	}
}
