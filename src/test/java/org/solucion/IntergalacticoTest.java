
package org.solucion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntergalacticoTest {

    @Test
    public void test01CorbetaDisparaDosMisilesElPuntajeEsCorrecto(){
        Nave corbeta = new Nave(new Misil(3,0), new EscudoSimple(20));
        Nave corbeta2 = new Nave(new Misil(3,0), new EscudoSimple(20));
        corbeta.atacarA(corbeta2);
        corbeta.atacarA(corbeta2);

        // Misiles + Escudo
        int puntajeEsperado = 10 + 20;

        assertEquals(puntajeEsperado, corbeta.calcularPuntaje());
    }

    @Test
    public void test02DestructorRecibe6AtaquesDeMisiles(){
        SistemaDefensa backup = new EscudoSimple(30);
        SistemaDefensa escudoFenix = new EscudoFenix(backup);
        Nave destructor = new Nave(new Misil(5,20), escudoFenix);
        Nave corbetaEnemiga = new Nave(new Misil(3,0), new EscudoSimple(20));
        Nave destructorEnemigo = new Nave(new Misil(5,0), new EscudoSimple(20));

        // Corbata ataca 3 veces al destructor
        corbetaEnemiga.atacarA(destructor);
        corbetaEnemiga.atacarA(destructor);
        corbetaEnemiga.atacarA(destructor);

        // Destructor enemigo ataca 3 veces al destructor
        destructorEnemigo.atacarA(destructor);
        destructorEnemigo.atacarA(destructor);
        destructorEnemigo.atacarA(destructor);

        // Test extra (quiero ver si funcionan los puntos extra)
        int puntosMisiles = 10 * 2;
        int puntosEscudo = 20;
        assertEquals(puntosMisiles + puntosEscudo,destructorEnemigo.calcularPuntaje());

        puntosMisiles = 5 * 10 + 20; // 70
        assertEquals(puntosMisiles + puntosEscudo,destructor.calcularPuntaje());
    }

    @Test
    public void puedoCalcularElPuntajeTotalDeUnaFlota(){
        Nave corbeta = new Nave(new Misil(3,0), new EscudoSimple(20));
        Nave destructor = new Nave(new Misil(5,20), new EscudoSimple(20));
        Nave acorazado = new Nave(new BombasNeutrones(10),new EscudoIonico());

        Flota flota = new Flota(corbeta);
        flota.agregarNave(destructor);
        flota.agregarNave(acorazado);

        int esperado = (3 * 10) + 20;
        esperado += (5 * 10 + 20) + 20;
        esperado += (10 * 5 + 100) * 2;

        assertEquals(esperado, flota.calcularPuntajeTotal());
    }
}

