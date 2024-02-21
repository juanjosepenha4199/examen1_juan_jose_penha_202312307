package main;
import logica.calculadora;
import logica.hombre;
import logica.mujer;

public class presentacion {
    public static void main(String[] args) {
    	
        hombre hombre = new hombre(80, 175, 30);
        mujer mujer = new mujer(60, 160, 25);
        
        calculadora calculadoraTMB = new calculadora();

        calculadoraTMB.calcularYMostrarTMB(hombre);
        calculadoraTMB.calcularYMostrarTMB(mujer);
    }
}
