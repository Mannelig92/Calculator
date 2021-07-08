package ru.netology;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(4, 5);
        int b = calc.devide.apply(4, 2);
        int c = calc.abs.apply(-4);
        calc.println.accept(c);
    }
}
