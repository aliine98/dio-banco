package br.com.aline;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Banco b = new Banco("1");
        b.setNome("Banco 1");
        Banco b2 = new Banco("2");
        b2.setNome("Banco 2");

        Cliente cliente = new Cliente("Aline", "111.111.111-11");
        Cliente cliente2 = new Cliente("Pessoa", "222.222.222-22");

        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente, b);
        Conta contaCorrente = new ContaCorrente(cliente, b);
        ContaCorrente contaCorrente2 = new ContaCorrente(cliente2, b2);

        contaPoupanca.depositar(BigDecimal.valueOf(100.0));
        contaPoupanca.extrato();
        System.out.println(contaPoupanca.sacar(BigDecimal.valueOf(50.0)));
        System.out.println("Contas no banco: " + b.getContas());
        contaPoupanca.transferir(BigDecimal.valueOf(30.0),contaCorrente);
        contaPoupanca.extrato();
        contaCorrente.extrato();
        contaCorrente.transferir(BigDecimal.valueOf(20.0), contaCorrente2);
        contaCorrente2.extrato();
    }
}