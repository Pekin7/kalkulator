package com.company;

import java.util.Scanner;

public class CalculateType {
    char calculation;

    CalculateType(char calculation) {
        this.calculation = calculation;
    }

    public char readCalculateType() {
        char calculation;
        final Scanner scanner = new Scanner(System.in);
        calculation = scanner.next().charAt(0);
        return calculation;
    }
}