package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    // kalkulator jak dla maupy
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char calculation;

// Pobieranie pierwszej liczby od uzytkownika

final NumberInput numberInput = new NumberInput(firstNumber, secondNumber);
        try {
            int result = numberInput.readNumberInput();
            System.out.println(result);
            System.out.println("Podaj pierwsza liczbe");
            firstNumber = readNumberInput();
            System.out.println("Podaj druga liczbe");
            secondNumber = readNumberInput();

        } catch (InputMismatchException exception) {
            System.out.println("Bledne dane!");
            return;
        }

        final CalculateType calculateType = new CalculateType(calculation);

        System.out.println("Jakie dzialanie chcesz wykonac? [+] - dodawanie [-] - odejmowanie [*] - mnozenie [/] - dzielenie");
        calculation = readCalculateType();
        final Calculator calculator = new Calculator(firstNumber, secondNumber, calculation);
        try {
            int result = calculator.calculate();
            System.out.println(result);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

        main(null);
    }



}


