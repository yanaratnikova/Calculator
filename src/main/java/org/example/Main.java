package org.example;


import javax.imageio.IIOException;
import java.io.IOException;
import java.util.logging.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());
        FileHandler fh = new FileHandler("log");
        logger.addHandler(fh);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fh.setFormatter(simpleFormatter);
        logger.info("Start program");

    CalculatorModel model = new CalculatorModelImpl();
    CalculatorView view = new CalculatorViewImpl();
    CalculatorPresenter presenter = new CalculatorPresenter(model, view);
    //presenter.onAddButtonClicked();
    //presenter.onMultiplyButtonClicked();
    presenter.onDivideButtonClicked();
        logger.log(Level.INFO, "Stop program");

    }
}