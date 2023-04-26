package com.marton.padroesprojeto.observerObservable;

import java.util.Observable;
import java.util.Observer;

/**
 *  Os Observer são os assinantes observadores interessados nas alterações do objeto Observable.
 */
public class Assinante implements Observer {

    // Objeto que queremos observar para sermos notificado sempre que houver alteração:
    Observable revistaInformatica;

    int edicaoNovaRevista;

    public Assinante(Observable revistaInformatica) {
        this.revistaInformatica = revistaInformatica;

        // Aqui definimos que queremos escutar os eventos de alterações:
        revistaInformatica.addObserver(this); // Requer implementar Interface Observer
    }

    @Override
    public void update(Observable revistaInfSubject, Object arg1) {

        // Opa! O objeto sendo observado teve alterações!
        if (revistaInfSubject instanceof Revista) {
            Revista revistaInformatica = (Revista) revistaInfSubject;
            edicaoNovaRevista = revistaInformatica.getEdicao();
            System.out.println("Atenção, já chegou a mais uma edição da Revista Informatica. " +
                    "Esta é a sua edição número: " + edicaoNovaRevista);
        }
    }

}
