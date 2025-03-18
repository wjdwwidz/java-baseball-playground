import java.util.Scanner;

public class Calculator {

    public static String inputStringArray() {
        Scanner sc = new Scanner(System.in);
        sc.close();
        return sc.nextLine();
    }

    public static String[] splitStringArray(String str) {
        String[] strs = new String[str.length()];
        return strs;
    }

    public static int calculator (String[] strs) {
        for (int i = 0; i < strs.length; i+= 3) {
            int first = Integer.parseInt(strs[i]);
            int second = Integer.parseInt(strs[i+1]);
            String operator = strs[i+2];

            switch (operator) {
                case "+":
                    return add(first, second);
               case "-":
                    return subtract(first, second);
               case "/":
                    return divide(first, second);
               case "multiply":
                    return multiply (first, second);
            }
        }
    };


    int add(int first, int second){
        return first + second;
    }

    int subtract (int first, int second){
        return first - second;
    }

    int multiply (int first, int second){
        return first * second;
    }

    int divide (int first, int second){
        return first / second;
    }

}
