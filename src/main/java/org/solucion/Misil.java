package org.solucion;

public class Misil implements SistemaAtaque{

    private int cantidadMisiles;
    private final int puntos;
    private boolean extra;
    private int puntosExtra;

    public Misil(int cantidadMisiles, int puntosExtra){
        this.cantidadMisiles = cantidadMisiles;
        this.puntos = 10;
        this.extra = true;
        this.puntosExtra = puntosExtra;
    }

    @Override
    public void atacarA(Nave nave) {
        extra = false;
        nave.recibirAtaque(puntos);
        cantidadMisiles--;
    }

    @Override
    public int calcularPuntaje() {
        int resultado = puntos * cantidadMisiles;
        return extra ? resultado + puntosExtra : resultado;
    }
}
