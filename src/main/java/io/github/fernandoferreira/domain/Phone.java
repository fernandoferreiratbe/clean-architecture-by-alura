package io.github.fernandoferreira.domain;

import java.util.Objects;

public class Phone {

    private String ddd;
    private String number;

    public Phone(String ddd, String number) {
        this.checkDddNumber(ddd);
        this.checkPhoneNumber(number);
        this.ddd = ddd;
        this.number = number;
    }

    public String getDdd() {
        return this.ddd;
    }

    public String getNumber() {
        return this.number;
    }

    private void checkDddNumber(String ddd) {
        if (Objects.isNull(ddd) || !ddd.matches("[0-9]{2}")) {
            throw new IllegalArgumentException("Invalid DDD number.");
        }
    }

    private void checkPhoneNumber(String phoneNumber) {
        if (Objects.isNull(phoneNumber) || !phoneNumber.matches("[0-9]{9}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }
}
