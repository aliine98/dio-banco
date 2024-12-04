package br.com.aline;

public class ContaCorrente extends Conta {
    public ContaCorrente (Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.agencia = banco.getAgencia();
        banco.adicionaConta(this);
    }
}
