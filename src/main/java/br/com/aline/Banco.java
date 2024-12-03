package br.com.aline;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Banco {
    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void adicionaConta(Conta conta) {
        this.contas.add(conta);
    }
}
