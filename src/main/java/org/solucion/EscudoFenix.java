package org.solucion;

public class EscudoFenix implements SistemaDefensa {
    SistemaDefensa backup;
    int puntos;
    boolean backupActivado;

    public EscudoFenix(SistemaDefensa Escudo){
        this.backup = Escudo;
        this.backupActivado = false;
        this.puntos = 50;
    }

    private void recibirDisparoPrincipal(int danio){
        puntos -= danio;
        if(puntos <= 0){
            backupActivado = true;
        }
    }

    public void recibirDisparo(int danio) {
        if(backupActivado) {
            backup.recibirDisparo(danio);
            return;
        }

        recibirDisparoPrincipal(danio);
    }

    public int calcularPuntaje(int puntajeAtaque){
        return backupActivado ? backup.calcularPuntaje(puntajeAtaque) : puntos;
    }
}
