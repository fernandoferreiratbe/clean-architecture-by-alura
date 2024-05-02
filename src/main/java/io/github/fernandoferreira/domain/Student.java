package io.github.fernandoferreira.domain;

import lombok.Setter;

import java.util.List;

public class Student {

    private CPF cpf;
    private String name;
    private Email email;
    private List<Phone> phones;

    public Student(CPF cpf, String name, Email email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }

    public void addPhone(String ddd, String number) {
        this.phones.add(new Phone(ddd, number));
    }

    public CPF getCpf() {
        return this.cpf;
    }

    public String getName() {
        return this.name;
    }

    public Email getEmail() {
        return this.email;
    }
}
