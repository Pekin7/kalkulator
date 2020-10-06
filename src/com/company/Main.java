package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    // kalkulator jak dla maupy
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        char calculations;

        // Pobieranie pierwszej liczby od uzytkownika
        System.out.println("Podaj pierwsza liczbe: ");
        Scanner userInterface = new Scanner(System.in);
        try
        {
            firstNumber = userInterface.nextInt();
            secondNumber = userInterface.nextInt();
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Bledne dane!");
        }
        firstNumber = userInterface.nextInt();
        System.out.println("Podaj druga liczbe: ");
        secondNumber = userInterface.nextInt();

        System.out.println("Jakie dzialanie chcesz wykonac? [+] - dodawanie [-] - odejmowanie [*] - mnozenie [/] - dzielenie");

        calculations = userInterface.next().charAt(0);
        switch (calculations) {
            case '+': {
                System.out.println(firstNumber + secondNumber);
                break;
            }
            case '-': {
                System.out.println(firstNumber - secondNumber);
                break;
            }
            case '*': {
                System.out.println(firstNumber * secondNumber);
                break;
            }
            case '/': {
                if (secondNumber !=0)
                {
                    System.out.println(firstNumber / secondNumber);
                }
                else
                {
                    System.out.println("Pamietaj cholero nie dziel przez zero!");
                }
                break;
            }


        }
    }
}
