package org.example;

import java.util.logging.Logger;

// Реализация модели калькулятора
public class CalculatorModelImpl implements CalculatorModel{


 private static Logger logger = Logger.getLogger(CalculatorModelImpl.class.getName());

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
        if (b == 0){
      logger.warning("you can't divide by zero");

            return 0;}
        else {
            return a/b;
        }

    }

}
