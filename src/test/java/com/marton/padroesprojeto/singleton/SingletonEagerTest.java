package com.marton.padroesprojeto.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerTest {

    @Test
    void getInstancia() {

        // Vamos obter duas instâncias do Singleton:
        SingletonEager singleton1 = SingletonEager.getInstancia();
        SingletonEager singleton2 = SingletonEager.getInstancia();


        // Com posse de duas instâncias, vamos verificar se são as mesmas instâncias:
        Assertions.assertTrue(singleton1 == singleton2);

    }
}