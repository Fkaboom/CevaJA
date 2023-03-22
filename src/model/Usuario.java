package model;

import java.time.LocalDate;

public class Usuario extends Pessoa{
    public Usuario(String nome, LocalDate dataNascimento, Endereco endereco, String documento) {
        super(nome, dataNascimento, endereco, documento);
    }
    private String username;
    private String senha;


}
