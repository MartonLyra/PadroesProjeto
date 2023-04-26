package com.marton.padroesprojeto.strategy;

public class SaldoInsuficienteException extends Exception {

    public SaldoInsuficienteException() {
        super();
    }

    public SaldoInsuficienteException(String mensagemErro) {
        super(mensagemErro);
    }

}
