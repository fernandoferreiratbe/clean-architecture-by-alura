package domain;

import io.github.fernandoferreira.domain.Email;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Email unit test")
public class EmailTest {

    @Test
    @DisplayName("Given empty email should determinate as invalid then throws illegal exception.")
    void givenEmptyEmail_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(""));
    }

    @Test
    @DisplayName("Given null email should determinate as invalid then throws illegal exception.")
    void givenNullEmail_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(null));
    }

    @Test
    @DisplayName("Given blank email should determinate as invalid then throws illegal exception.")
    void givenBlankEmail_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Email(" "));
    }

    @Test
    @DisplayName("Given email should determinate as valid then return a valid email object")
    void givenEmail_ShouldDeterminateAsValid_ThenReturnValidEmailObject() {
        Email email = new Email("name.surname@domain.com.br");

        Assertions.assertEquals("name.surname@domain.com.br", email.getAddress());
    }

}
