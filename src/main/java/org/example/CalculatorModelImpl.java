package org.example;
// Реализация модели калькулятора
public class CalculatorModelImpl implements CalculatorModel{
    @Override
    public int add(int a, int b) {
        int result = a + b;
        // Логирование операции сложения
        return result;
    }

    @Override
    public int multiply(int a, int b) {
        int result = a * b;
        return result;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0){return 0;}
        else {
            return a/b;
        }

    }
}
