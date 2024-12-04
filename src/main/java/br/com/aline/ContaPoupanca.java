package br.com.aline;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.agencia = banco.getAgencia();
        banco.adicionaConta(this);
    }

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        super.sacar(valor);
        return valor.subtract(valor.multiply(new BigDecimal("0.01"))).stripTrailingZeros();
    }
}
