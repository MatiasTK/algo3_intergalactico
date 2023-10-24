package org.solucion;

public class EscudoSimple implements SistemaDefensa{
    private int puntaje;

    public EscudoSimple(int puntos){
        puntaje = puntos;
    }

    @Override
    public void recibirDisparo(int danio) {
        puntaje -= danio;
    }

    @Override
    public int calcularPuntaje(int puntajeAtaque) {
        return puntaje;
    }
}
