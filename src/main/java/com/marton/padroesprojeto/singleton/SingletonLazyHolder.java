package com.marton.padroesprojeto.singleton;


/**
 * Singleton "Lazy Holder".
 *
 * Singleton é o padrão de projeto onde apenas uma instância daquela classe será instanciada.
 *
 * No modo SingletonLazyHolder, teremos uma classe interna que guardará a instância.
 * Com isso, temos o benefício da classe ser Thread Safe.
 *
 * Semelhante ao SingletonLazy, somente será gerado a instância no momento de sua primeira utilização, sem precisar checar, a cada solicitação, se a instância já existe.
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 *
 */
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }

}
