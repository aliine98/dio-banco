package br.com.aline;

import java.math.BigDecimal;
import java.math.MathContext;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public BigDecimal sacar(BigDecimal valor) {
        super.sacar(valor);
        return valor.subtract(valor.multiply(new BigDecimal("0.01"))).stripTrailingZeros();
    }
}
