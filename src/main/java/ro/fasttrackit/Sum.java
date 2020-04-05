package ro.fasttrackit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {
    public int sum(final int n) {

        if (n < 0) throw new IllegalArgumentException("n should be positive");

        //   return n <= 1 ? n : sum(n - 1)+n;

        if (n <= 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }

    }

    public int factorial(int n) {

        if (n < 0) throw new IllegalArgumentException("n should be more then 0 or positive");

        //   return n <= 1 ? 1 : n*factorial(n-1);

        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }


    }

    public int sumArray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] subArray = Arrays.copyOfRange(arr, 0, arr.length - 1);
            return sumArray(subArray) + arr[arr.length - 1];
        }


    }

    public int sumArrayMiddle(int[] arr) {

        if (arr.length == 0) {
            return 0;
        } else if (arr.length == 1) {
            return arr[0];
        } else {
            int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
            int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
            return sumArrayMiddle(left) + sumArrayMiddle(right);
        }

    }

    //==================================================HOMEWORK========================================================
    public int sumOfFirstIntegerNumbers(int n) {

        if (n < 0) throw new IllegalArgumentException("n is invalid");
        if (n < 1) {
            return n;
        } else {
            return sumOfFirstIntegerNumbers(n - 1) + n;
        }


    }

    public int sumEven(int n) {
        if (n < 0) throw new IllegalArgumentException("n is invalid");
        if (n < 1) {
            return n;
        } else {
            int sum = 0;
            int i = 0;
            int matches = 0;

            while (matches < n) {
                i++;
                if (i % 2 == 0) {
                    sum += i;
                    matches++;
                }
            }
            return sum;
        }

    }


    public String palindrom(String name) {
        String palindrom = "";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        if (name.equals(reverse)) {
            palindrom = "Palindrom";
        } else {
            palindrom = "Not Palindrom";
        }

        return palindrom;
    }

    public Boolean otherPalindrom(String str) {
        if (str.length() < 2) return true;
        return str.toLowerCase().charAt(0) == str.charAt(str.length() - 1) && otherPalindrom(str.substring(1, str.length() - 1));
    }


    public int sumOfDigits(int n) {
        if (n <= 0) throw new IllegalArgumentException("n is invalid");
        if (n == 1) {
            return n;
        } else {

            return n % 10 + sumOfDigits(n / 10);

        }


    }

}





