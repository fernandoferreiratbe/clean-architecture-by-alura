package io.github.fernandoferreira.domain;

import java.util.Objects;

public class Email {

    private String address;

    public Email(String address) throws IllegalAccessException {
        if (this.is_invalid_email(address)) {
            throw new IllegalAccessException("Email address is invalid");
        }
        this.address = address;
    }

    private Boolean is_invalid_email(String address) {
        if (Objects.isNull(address) || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\\\.[a-zA-Z]{2,}$")) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}
