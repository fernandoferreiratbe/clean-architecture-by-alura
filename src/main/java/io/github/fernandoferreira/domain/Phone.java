package io.github.fernandoferreira.domain;

public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return this.ddd;
    }

    public String getNumber() {
        return this.number;
    }
}
