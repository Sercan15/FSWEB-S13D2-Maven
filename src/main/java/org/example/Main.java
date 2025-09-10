package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }
    public static boolean isPalindrome(int number) {
        number = Math.abs(number);

        int original = number;
        int reversed = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            number /= 10;
        }
        return original == reversed;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        }

        StringBuilder sb = new StringBuilder();
        String numStr = String.valueOf(number);

        for (int i = 0; i < numStr.length(); i++) {
            char digit = numStr.charAt(i);
            switch (digit) {
                case '0': sb.append("Zero "); break;
                case '1': sb.append("One "); break;
                case '2': sb.append("Two "); break;
                case '3': sb.append("Three "); break;
                case '4': sb.append("Four "); break;
                case '5': sb.append("Five "); break;
                case '6': sb.append("Six "); break;
                case '7': sb.append("Seven "); break;
                case '8': sb.append("Eight "); break;
                case '9': sb.append("Nine "); break;
            }
        }
        return sb.toString().trim();
    }


}
