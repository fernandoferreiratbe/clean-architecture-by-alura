package io.github.fernandoferreira.domain;

public class StudentFactory {

    private Student student;

    public StudentFactory withNameAndCpf(String name, String cpf, String email) {
        this.student = new Student(new CPF(cpf), name, new Email(email));
        return this;
    }

    public StudentFactory withPhoneNumber(String ddd, String number) {
        this.student.addPhone(ddd, number);
        return this;
    }

    public Student create() {
        return this.student;
    }
}
