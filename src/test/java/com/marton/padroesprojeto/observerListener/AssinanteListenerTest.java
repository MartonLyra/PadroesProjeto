package com.marton.padroesprojeto.observerListener;

import org.junit.jupiter.api.Test;

class AssinanteListenerTest {

    @Test
    void propertyChange() {

        // RevistaSubject é o objeto que iremos escutar:
        RevistaSubject revistaSubject = new RevistaSubject();

        // AssinanteListener é o objeto que receberá as notificações quando RevistaSubject for alterado:
        AssinanteListener assinanteListener = new AssinanteListener();

        // Aqui pedimos à RevistaSubject adicionar o AssinanteListener como ouvindo para suas alterações:
        // Observe que esse método adiciona todas as propriedades que a revistaSubject disponibiliza gatilhos de alteraões:
        revistaSubject.addObserver(assinanteListener);

        // tudo configurado, vamos alterar a edição da revista:
        revistaSubject.setNumeroEdicaoRevista("Ed. 2");
        //   Alteração! Variação de 'numeroEdicao'	('Ed. 1' -> 'Ed. 2')
        //   Objeto que disparou alteração: 'O objeto sendo escutado'

        // Agora vamos alterar o título da revista:
        revistaSubject.setTituloRevista("Implementando Padrões de Projeto em Java");
        //   Alteração! Variação de 'titulo'	('Interfaces em 8 linguas' -> 'Implementando Padrões de Projeto em Java')
        //   Objeto que disparou alteração: 'O objeto sendo escutado'

    }
}