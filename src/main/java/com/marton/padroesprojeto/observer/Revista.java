package com.marton.padroesprojeto.observer;
import java.util.Observable;


/**
 * Objeto que será observado. Interessados nas alterações desse objeto devem se inscrever para receber atualizações.
 */
public class Revista extends Observable {

    // edição da regista. Sempre que for lançado nova edição, iremos notificar os assinantes.
    private int edicao;


    /**
     *  Método de exemplo para demonstrar como os assinantes são notificados mediante alteração, no caso, sempre que uma nova edição for lançada
     */
    public void lancarNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;

        // Indica que esse objeto possui alterações:
        setChanged();

        // Uma vez que o objeto teve alterações, vamos notificar todos os assinantes observers.
        notifyObservers();
        // Quando todos observers forem notificados, automaticamente será chamado o método clearChanged() para indicar que esse objeto não possui mais alterações.
    }

    public int getEdicao() {
        return this.edicao;
    }

}
