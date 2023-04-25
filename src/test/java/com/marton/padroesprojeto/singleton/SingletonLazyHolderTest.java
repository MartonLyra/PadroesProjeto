package com.marton.padroesprojeto.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyHolderTest {

    @Test
    void getInstancia() {

        // Vamos obter duas instâncias do Singleton:
        SingletonLazyHolder singleton1 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder singleton2 = SingletonLazyHolder.getInstancia();
        SingletonLazyHolder singleton3 = SingletonLazyHolder.getInstancia();


        // Com posse de três instâncias, vamos verificar se são as mesmas instâncias:
        Assertions.assertTrue(singleton1 == singleton2);
        Assertions.assertTrue(singleton1 == singleton3);
        Assertions.assertTrue(singleton2 == singleton3);

    }
}