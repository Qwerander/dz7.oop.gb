package controller;

import logger.CalculatorLogger;
import model.ComplexNumber;
import service.ComplexNumberService;

public class ComplexCalculatorController {
    private final ComplexNumberService service;

    public ComplexCalculatorController(ComplexNumberService service) {
        this.service = service;
    }

    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = service.add(a, b);
        CalculatorLogger.log(String.format("Складываем %s и %s результат равен %s", a, b, result));
        return result;
    }

    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = service.multiply(a, b);
        CalculatorLogger.log(String.format("Умножаем %s и %s результат равен %s", a, b, result));
        return result;
    }

    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        try {
            ComplexNumber result = service.divide(a, b);
            CalculatorLogger.log(String.format("Делим %s на %s результат равен %s", a, b, result));
            return result;
        } catch (ArithmeticException e) {
            CalculatorLogger.log(String.format("Ошибка деления %s на %s: %s", a, b, e.getMessage()));
            throw e;
        }
    }
}
