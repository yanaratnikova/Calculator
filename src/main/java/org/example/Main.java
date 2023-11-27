package org.example;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModelImpl();
        CalculatorView view = new CalculatorViewImpl();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);
       // presenter.onAddButtonClicked();
        //presenter.onMultiplyButtonClicked();
        presenter.onDivideButtonClicked();
    }
}