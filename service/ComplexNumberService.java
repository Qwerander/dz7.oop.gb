package service;

import model.ComplexNumber;

public interface ComplexNumberService {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);

    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);

    ComplexNumber divide(ComplexNumber a, ComplexNumber b) throws ArithmeticException;
}
