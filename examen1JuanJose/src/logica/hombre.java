package logica;

public class hombre extends Persona {
	public hombre(float peso, float altura, int edad) {
		super(peso, altura, edad);

	}
	public float calcularTMB() {
		return (88.362f + (13.397f * peso) + (4.799f * altura) - (5.677f * edad));
	}
}


