package org.example;
// Презентер калькулятора
public class CalculatorPresenter {
    private final CalculatorModel model;
    private final CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }
    public void onAddButtonClicked(){
        int a = Integer.parseInt(view.getUserInput());
        int b = Integer.parseInt(view.getUserInput());
        int result = model.add(a, b);
        view.displayResult(result);
    }
    public void onMultiplyButtonClicked(){
        int a = Integer.parseInt(view.getUserInput());
        int b = Integer.parseInt(view.getUserInput());
        int result = model.multiply(a, b);
        view.displayResult(result);
    }
    public void onDivideButtonClicked(){
        int a = Integer.parseInt(view.getUserInput());
        int b = Integer.parseInt(view.getUserInput());
        int result = model.divide(a, b);
        view.displayResult(result);
    }
}
