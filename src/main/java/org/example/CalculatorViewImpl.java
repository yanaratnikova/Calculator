package org.example;

import java.util.Scanner;

// Реализация представления калькулятора
public class CalculatorViewImpl implements CalculatorView{
    @Override
    public void displayResult(int result) {
        System.out.println("Result: "+ result);

    }

    @Override
    public String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        return scanner.nextLine();
    }
}
