package org.solucion;

import java.util.ArrayList;

public class Flota {
    ArrayList<Nave> naves;

    Flota(Nave nave){
        this.naves = new ArrayList<Nave>();
        agregarNave(nave);
    }

    public void agregarNave(Nave nave){
        this.naves.add(nave);
    }

    public int calcularPuntajeTotal(){
        int puntaje = 0;
        for(Nave nave : this.naves){
            puntaje += nave.calcularPuntaje();
        }
        return puntaje;
    }
}
