package myapp;

import myapp.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = Calculator.inputStringArray();
        String[] strs = Calculator.splitStringArray(input);
        int Answer = Calculator.calculator(strs);

        System.out.println(Answer);

    }
}