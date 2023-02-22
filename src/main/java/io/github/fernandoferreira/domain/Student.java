package io.github.fernandoferreira.domain;

import java.util.List;

public class Student {

    private CPF cpf;
    private String name;
    private Email email;
    private List<Phone> phones;

    public void addPhone(String ddd, String number) {
        this.phones.add(new Phone(ddd, number));
    }

}
