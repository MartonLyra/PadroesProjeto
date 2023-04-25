package com.marton.padroesprojeto.singleton;


/**
 * Singleton "apressado".
 *
 * Singleton é o padrão de projeto onde apenas uma instância daquela classe será instanciada.
 *
 * No modo SingletonEager, será instanciada quando a classe for usada pela primeira vez, seja através de um método estático ou através do método getInstancia().
 */
public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
