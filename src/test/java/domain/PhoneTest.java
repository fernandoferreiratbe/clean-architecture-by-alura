package domain;

import io.github.fernandoferreira.domain.Phone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Phone Number")
public class PhoneTest {

    @Test
    @DisplayName("Given empty ddd number should determinate as invalid then throws illegal exception.")
    void givenEmptyDdd_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phone("", ""));
    }

    @Test
    @DisplayName("Given null ddd should determinate as invalid then throws illegal exception.")
    void givenNullDdd_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phone(null, ""));
    }

    @Test
    @DisplayName("Given blank ddd should determinate as invalid then throws illegal exception.")
    void givenBlankEmail_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        var illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Phone(" ", ""));

        Assertions.assertEquals("Invalid DDD number.", illegalArgumentException.getMessage());
    }

    @Test
    @DisplayName("Given empty phone number should determinate as invalid then throws illegal exception.")
    void givenEmptyPhoneNumber_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phone("12", ""));
    }

    @Test
    @DisplayName("Given null phone should determinate as invalid then throws illegal exception.")
    void givenNullPhoneNumber_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Phone("12", null));
    }

    @Test
    @DisplayName("Given blank phone number should determinate as invalid then throws illegal exception.")
    void givenBlankPhoneNumber_ShouldDeterminateAsInvalid_ThenThrowsIllegalException() {
        var illegalArgumentException = Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Phone("12", " "));

        Assertions.assertEquals("Invalid phone number", illegalArgumentException.getMessage());
    }

    @Test
    @DisplayName("Given a valid ddd and phone number should create a new phone number successfully.")
    void givenValidDddAndPhoneNumber_ShouldPassAllValidations_ThenCreateNewPhoneObject() {
        var phone = new Phone("12", "998887777");

        Assertions.assertEquals("12", phone.ddd());
        Assertions.assertEquals("998887777", phone.number());
    }
}
