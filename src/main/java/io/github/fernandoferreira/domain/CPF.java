package io.github.fernandoferreira.domain;

import java.util.Objects;

public class CPF {

    private String cpf;

    public CPF(String cpf) {
        if (this.is_invalid_cpf(cpf)) {
            throw new IllegalArgumentException("CPF is invalid!");
        }
        this.cpf = cpf;
    }

    private Boolean is_invalid_cpf(String cpf) {
        if (Objects.isNull(cpf) || !cpf.matches("^[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}$")) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    public String getCpf() {
        return this.cpf;
    }
}
