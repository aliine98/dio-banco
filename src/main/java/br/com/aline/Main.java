package br.com.aline;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Banco b = new Banco();
        b.setNome("Banco 1");
        Cliente cliente = new Cliente("Aline", "111.111.111-11");
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente);
        b.adicionaConta(contaPoupanca);
        contaPoupanca.depositar(BigDecimal.valueOf(100.0));
        contaPoupanca.extrato();
        System.out.println(contaPoupanca.sacar(BigDecimal.valueOf(50.0)));
        Conta contaCorrente = new ContaCorrente(cliente);
        b.adicionaConta(contaCorrente);
        System.out.println("Contas no banco: " + b.getContas());
        contaPoupanca.transferir(BigDecimal.valueOf(30.0),contaCorrente);
        contaPoupanca.extrato();
        contaCorrente.extrato();
    }
}