package io.github.fernandoferreira;

public class Main {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf("100");
        Integer num2 = Integer.valueOf("100");
        System.out.println(num1.hashCode());
        System.out.print((num1.equals(num2))+":");
        System.out.println(num1.equals(num2));
    }
}