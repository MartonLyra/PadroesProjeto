package com.marton.padroesprojeto.singleton;


/**
 * Singleton "preguiçoso".
 *
 * Singleton é o padrão de projeto onde apenas uma instância daquela classe será instanciada.
 *
 * No modo SingletonLazy, o objeto apenas será instanciado quando da sua primeira solicitação de uso.
 * E, a cada nova solicitação do objeto, é verificado se precisa instanciar, ou não, a primeira instância.
 *
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {

        // A cada solicitação do objeto é verificado se precisa instanciar, ou não, a primeira instância.
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }

}
