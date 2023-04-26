package com.marton.padroesprojeto.adapter;


/*
 *  Nosso sistema sabe ligar na tomada de 3 pinos.
 *  Mas, temos um framework antigo que só sabe ligar na tomada de 2 pinos.
 *  Com isso, foi criado esse Adapter para nosso sistema ligar na tomada de 2 pinos.
 *  Se, futuramente, o framework atualizar, não precisamos alterar todo o sistema, alteramos apenas o adapter.
 */
public class AdapterTomada extends TomadaDeTresPinos {

    private TomadaDeDoisPinos tomadaDeDoisPinos;

    public AdapterTomada(TomadaDeDoisPinos tomadaDeDoisPinos) {
        this.tomadaDeDoisPinos = tomadaDeDoisPinos;
    }

    public void ligarNaTomadaDeDoisPinos() {
        tomadaDeDoisPinos.ligarNaTomadaDeDoisPinos();
    }

}
