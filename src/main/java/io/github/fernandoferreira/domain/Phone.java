package io.github.fernandoferreira.domain;

import lombok.Getter;

import java.util.Objects;

public record Phone(String ddd, String number) {

    public Phone {
        this.checkDddNumber(ddd);
        this.checkPhoneNumber(number);
    }

    private void checkDddNumber(String ddd) {
        if (Objects.isNull(ddd) || !ddd.matches("[0-9]{2}")) {
            throw new IllegalArgumentException("Invalid DDD number.");
        }
    }

    private void checkPhoneNumber(String phoneNumber) {
        if (Objects.isNull(phoneNumber) || !phoneNumber.matches("[0-9]{8,9}")) {
            throw new IllegalArgumentException("Invalid phone number");
        }
    }
}
