package com.dt2.zegota.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String name;
    @Email
    private String email;
    @Size(min=6,max=10, message = "Sua senha tem quer estar entre 6 à 20 caracteres, ANIMAL! ")
    private String password;
    @CPF
    private String cpf;
    @NotNull
    private int idade;

    public User() {
    }

    public User(String name, String email, String password, String cpf, int idade) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.idade = idade;
    }

    public User(int id, String name, String email, String password, String cpf, int idade) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }
}

