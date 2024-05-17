package io.github.fernandoferreira.domain;

import java.util.Objects;

public record Email(String address) {

    public Email {
        if (this.is_invalid_email(address)) {
            throw new IllegalArgumentException("Email address is invalid");
        }
    }

    private Boolean is_invalid_email(String address) {
        if (Objects.isNull(address) || !address.matches("^[a-zA-Z0-9._]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }
}
