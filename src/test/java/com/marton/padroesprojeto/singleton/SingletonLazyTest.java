package com.marton.padroesprojeto.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyTest {

    @Test
    void getInstancia() {

        // Vamos obter duas instâncias do Singleton:
        SingletonLazy singleton1 = SingletonLazy.getInstancia();
        SingletonLazy singleton2 = SingletonLazy.getInstancia();
        SingletonLazy singleton3 = SingletonLazy.getInstancia();


        // Com posse de três instâncias, vamos verificar se são as mesmas instâncias:
        assertTrue(singleton1 == singleton2);
        assertTrue(singleton1 == singleton3);
        assertTrue(singleton2 == singleton3);


    }
}