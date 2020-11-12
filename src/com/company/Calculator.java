package com.company;

public class Calculator {
    int firstNumber;
    int secondNumber;
    char calculation;

    Calculator(int firstNumber, int secondNumber, char calculation) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.calculation = calculation;
    }

    public int calculate() throws Exception {
        switch (calculation) {
            case '+': {
                return firstNumber + secondNumber;
            }
            case '-': {
                return firstNumber - secondNumber;
            }
            case '*': {
                return firstNumber * secondNumber;
            }
            case '/': {
                if (firstNumber != 0 && secondNumber != 0) {
                    return firstNumber / secondNumber;

                } else {
                    throw new Exception("Pamietaj cholero nie dziel przez zero!");
                }
            }
            default:
                throw new Exception("Nieznane dzialanie");
        }

    }
}
