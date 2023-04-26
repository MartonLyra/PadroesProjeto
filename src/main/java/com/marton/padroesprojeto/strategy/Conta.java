package com.marton.padroesprojeto.strategy;

public abstract class Conta {

    public int agencia;
    public int numConta;

    protected double saldoConta = 0;



    public abstract double calcSaldoTotal();

    public abstract void sacarDaConta(double valorSaque) throws SaldoInsuficienteException;

    public abstract void depositarEmConta(double valorDeposito);

    public double getSaldoConta() {
        return saldoConta;
    }


}
