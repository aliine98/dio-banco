package br.com.aline;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
