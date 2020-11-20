package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {
    int number;


    NumberInput(int number) {
        this.number = number;
    }

    public int readNumberInput() throws InputMismatchException {
        int number;
        final Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        return number;
    }
}
