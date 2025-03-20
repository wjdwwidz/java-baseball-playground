package myapp.calculator;

import java.util.Scanner;

public class Calculator {

    //array 로 입력 받기
    public static String inputStringArray() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

    //공백 기준 split
    public static String[] splitStringArray(String str) {
        String[] strs = str.split(" ");
        return strs;
    }

    //연산 함수 생성
    public static int calculator (String[] strs) {
        int first =  Integer.parseInt(strs[0]);
        for (int i = 1; i < strs.length; i+= 2) {
            int second = Integer.parseInt(strs[i+1]);
            String operator = strs[i];

            switch (operator) {
                case "+":
                    first = add(first, second);
                    break;
               case "-":
                    first = subtract(first, second);
                    break;
               case "/":
                    first = divide(first, second);
                    break;
               case "*":
                    first = multiply (first, second);
                    break;
            }
        }
        return first;
    };


    public static int add(int first, int second){
        return first + second;
    }

    public static int subtract (int first, int second){
        return first - second;
    }

    public static int multiply (int first, int second){
        return first * second;
    }

    public static int divide (int first, int second){
        return (first / second);
    }

}
