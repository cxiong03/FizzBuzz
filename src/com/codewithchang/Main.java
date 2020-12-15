package com.codewithchang;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

//        for (int i = 1; i <=n; i++)
            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (number % 3 == 0)  {
            System.out.println("Fizz");
        }
            else if (number % 5 == 0) {
                System.out.println("Buzz");
            }
            else System.out.println(number);
    }
}
