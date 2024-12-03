package br.com.aline;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public abstract class Conta {
    private static int contador;
    private static String agencia = "1";
    private int numero;
    private BigDecimal saldo = BigDecimal.valueOf(0.0);
    protected Cliente cliente;

    protected Conta() {
        contador++;
        this.numero = contador;
    }

    public BigDecimal sacar(BigDecimal valor) {
        if(this.saldo.compareTo(valor) < 0) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this.saldo = this.saldo.subtract(valor);
        return valor;
    }

    public void depositar(BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
    }

    public void extrato() {
        System.out.println(this);
    }

    public void transferir(BigDecimal valor, Conta destino) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                ", numero=" + numero +
                ", agencia='" + agencia + '\'' +
                ", titular='" + cliente.getNome() + '\'' +
                '}';
    }
}
