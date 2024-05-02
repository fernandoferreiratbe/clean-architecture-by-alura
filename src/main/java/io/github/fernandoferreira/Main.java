package io.github.fernandoferreira;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Integer num1 = 40;
//        Integer num2 = 40;
//        Integer num3 = 180;
//        Integer num4 = 180;
//
//        if (num1 == num2)
//            System.out.print("A");
//        else
//            System.out.print("B");
//
//        if (num3 == num4)
//            System.out.print("C");
//        else
//            System.out.print("D");
//    }

        public static void main(String[] args) {
            Integer num1 = new Integer(100);
            Integer num2 = new Integer(100);
            System.out.println(num1.hashCode());
            System.out.print((num1 == num2)+":");
            System.out.println(num1.equals(num2));
        }

}