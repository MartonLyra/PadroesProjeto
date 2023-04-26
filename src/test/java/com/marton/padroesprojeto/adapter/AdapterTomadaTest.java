package com.marton.padroesprojeto.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdapterTomadaTest {

    @Test
    void ligarNaTomadaDeDoisPinos() {

        // Nosso sistema precisa muito desse framework externo e não é interessante tentar conectar na tomada de dois pinos no nosso sistema já que nós usamos tomada de 3 pinos:
        TomadaDeDoisPinos tomadaDeDoisPinos = new TomadaDeDoisPinos();

        // Para isso, vamos usar um Adapter:
        AdapterTomada adapterTomada = new AdapterTomada(tomadaDeDoisPinos);

        // Agora nosso adapter consegue conectar tanto na tomada de 2 pinos quanto na tomada de 3 pinos:
        adapterTomada.ligarNaTomadaDeDoisPinos();
        adapterTomada.ligarNaTomadaDeTresPinos();

        // Saída:
        //   Ligado na Tomada de Dois Pinos
        //   Ligado na Tomada de Tres Pinos
    }
}