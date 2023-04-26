package com.marton.padroesprojeto.observerListener;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.sql.SQLOutput;

/*
 *   O 'AssinanteListener' é o interessado nas alterações, é o ouvinte que recebe notificações quando houver alterações em uma das propriedades monitoradas.
 */
public class AssinanteListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.print("Alteração! Variação de '" + evt.getPropertyName() + "'");
        System.out.println("\t('" + evt.getOldValue() +
                "' -> '" + evt.getNewValue() + "')");
        System.out.println("Objeto que disparou alteração: '" + evt.getSource() + "'\n");
    }

}
