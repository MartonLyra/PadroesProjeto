package com.marton.padroesprojeto.observerListener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;



/*
 *   Esse é o objeto assunto de interesse de outros objetos. É ele quem emite as notificações de alteração através do objeto 'PropertyChangeSupport'
 */
public class RevistaSubject {

    String tituloRevista ="Interfaces em 8 linguas";

    String numeroEdicaoRevista ="Ed. 1";


    // Contem um objeto 'PropertyChangeSupport' ao invés de extender uma classe support
    PropertyChangeSupport pcs = new  PropertyChangeSupport(this);

    public void addObserver(PropertyChangeListener l) {

        // Quando for adicionar um ouvinte, devemos adicionar todas as propriedades que nossa classe emite alteração:
        pcs.addPropertyChangeListener("numeroEdicao", l);
        pcs.addPropertyChangeListener("titulo", l);
    }

    public void setNumeroEdicaoRevista(String val) {
        String old = numeroEdicaoRevista;
        numeroEdicaoRevista = val;

        // Aqui disparamos os ouvintes de que houve alteração na propriedade:
        pcs.firePropertyChange("numeroEdicao", old, val);
    }

    public void setTituloRevista(String val) {
        String old = this.tituloRevista;
        this.tituloRevista = val;

        // Aqui disparamos os ouvintes de que houve alteração na propriedade:
        pcs.firePropertyChange("titulo", old, val);
    }


    public String toString() {
        return "O objeto sendo escutado";
    }

}
