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


        // Com posse de duas instâncias, vamos verificar se são as mesmas instâncias:
        Assertions.assertTrue(singleton1 == singleton2);


    }
}