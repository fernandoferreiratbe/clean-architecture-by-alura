package io.github.fernandoferreira.domain;

import java.util.Objects;

public class Email {

    private String address;

    public Email(String address) throws IllegalArgumentException {
        if (this.is_invalid_email(address)) {
            throw new IllegalArgumentException("Email address is invalid");
        }
        this.address = address;
    }

    private Boolean is_invalid_email(String address) {
        if (Objects.isNull(address) || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    public String getAddress() {
        return this.address;
    }
}
