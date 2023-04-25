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
        SingletonEager singleton3 = SingletonEager.getInstancia();


        // Com posse de três instâncias, vamos verificar se são as mesmas instâncias:
        Assertions.assertTrue(singleton1 == singleton2);
        Assertions.assertTrue(singleton1 == singleton3);
        Assertions.assertTrue(singleton2 == singleton3);

    }
}