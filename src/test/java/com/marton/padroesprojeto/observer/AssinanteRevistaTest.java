package com.marton.padroesprojeto.observer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssinanteRevistaTest {

    @Test
    void update() throws InterruptedException {

        // Vamos criar a revista de informática:
        Revista revistaInformatica = new Revista();

        // Nenhum assinante, não notifica ninguém, não lança exception se não houver ninguém:
        revistaInformatica.lancarNovaEdicao(8);
        Assertions.assertEquals(8, revistaInformatica.getEdicao());

        // Vamos criar três assinantes interessados nos lançamentos:
        Assinante assinante1 = new Assinante(revistaInformatica);
        Assinante assinante2 = new Assinante(revistaInformatica);
        Assinante assinante3 = new Assinante(revistaInformatica);

        // Agora vamos lançar uma nova edição. Todos os 3 assinantes devem ser notificados.
        revistaInformatica.lancarNovaEdicao(12);
        Assertions.assertEquals(12, assinante1.edicaoNovaRevista);
        Assertions.assertEquals(12, assinante2.edicaoNovaRevista);
        Assertions.assertEquals(12, assinante3.edicaoNovaRevista);
    }
}