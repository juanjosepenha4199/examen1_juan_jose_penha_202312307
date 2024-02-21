package logica;

public class calculadora {
	    public void calcularYMostrarTMB(Persona persona) {
	        float tmb = persona.calcularTMB();
	        System.out.println("La TMB es: " + tmb + " kcal/día");
	    }
	}

