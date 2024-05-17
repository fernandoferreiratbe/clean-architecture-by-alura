package io.github.fernandoferreira.domain;

import lombok.Getter;

import java.util.Objects;

public record CPF(String cpf) {

    public CPF {
        if (this.is_invalid_cpf(cpf)) {
            throw new IllegalArgumentException("CPF is invalid!");
        }
    }

    private Boolean is_invalid_cpf(String cpf) {
        if (Objects.isNull(cpf) || !cpf.matches("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$")) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

}
