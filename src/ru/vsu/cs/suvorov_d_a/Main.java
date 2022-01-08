package ru.vsu.cs.suvorov_d_a;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int N = readNumber();
        System.out.println(EnumerationOfCombinations.recursion(N));
    }

    private static int readNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the natural number 'N': ");
        int value = scanner.nextInt();

        if(value<=0) {
            System.out.println("Error. Natural number can be only more than 0");
            System.exit(0);
        }
        return value;
    }
}