package org.solucion;

public class EscudoIonico implements SistemaDefensa{
    @Override
    public void recibirDisparo(int danio) {}

    @Override
    public int calcularPuntaje(int puntajeAtaque) {
        return puntajeAtaque;
    }
}
