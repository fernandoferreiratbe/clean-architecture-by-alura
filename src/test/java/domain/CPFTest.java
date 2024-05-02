package domain;

import io.github.fernandoferreira.domain.CPF;
import io.github.fernandoferreira.domain.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("CPF unit test")
public class CPFTest {

    @Test
    @DisplayName("Given empty cpf should determinate as invalid then throws illegal exception.")
    void givenEmptyCpf_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF(""));
    }

    @Test
    @DisplayName("Given null cpf should determinate as invalid then throws illegal exception.")
    void givenNullCpf_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF(null));
    }

    @Test
    @DisplayName("Given blank cpf should determinate as invalid then throws illegal exception.")
    void givenBlankCpf_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new CPF(" "));
    }

    @Test
    @DisplayName("Given cpf should determinate as valid then return a valid cpf object")
    void givenCpf_ShouldDeterminateAsValid_ThenReturnValidCpfObject() {
        CPF cpf = new CPF("111.222.333-44");

        Assertions.assertEquals("111.222.333-44", cpf.getCpf());
    }

}
