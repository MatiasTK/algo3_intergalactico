package org.solucion;

public class Nave{
    SistemaAtaque Ataque;
    SistemaDefensa Escudo;

    public Nave(SistemaAtaque Misil, SistemaDefensa Escudo){
        this.Ataque = Misil;
        this.Escudo = Escudo;
    }

    public void atacarA(Nave nave){
        this.Ataque.atacarA(nave);
    }

    public void recibirAtaque(int danio){
        this.Escudo.recibirDisparo(danio);
    }

    public int calcularPuntaje(){
        return this.Ataque.calcularPuntaje() + this.Escudo.calcularPuntaje(Ataque.calcularPuntaje());
    }
}
