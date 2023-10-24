package org.solucion;

public class BombasNeutrones implements SistemaAtaque {
    int cantidadBombas;
    private final int puntos;
    private final int puntosExtra;

    public BombasNeutrones(int cantidadBombas){
        this.cantidadBombas = cantidadBombas;
        this.puntos = 5;
        this.puntosExtra = 10;
    }

    @Override
    public void atacarA(Nave nave) {
        nave.recibirAtaque(puntos + (puntosExtra*cantidadBombas));
        cantidadBombas--;
    }

    @Override
    public int calcularPuntaje() {
        return puntos*cantidadBombas + (puntosExtra*cantidadBombas);
    }
}
