package org.example;

import java.util.Scanner;

class Calc implements Calculations {

    Scanner input = new Scanner(System.in);
    int x;
    int y;

    public Calc() {
        System.out.println("Enter the first INTEGER: ");
        x = input.nextInt();

        System.out.println("Enter the second INTEGER: ");
        y = input.nextInt();
    }

    @Override
    public void add() {
        System.out.println("Total sum: " + (x + y));
    }

    @Override
    public void subtract() {
        System.out.println("Total subtract: " + (x - y));

    }

    @Override
    public void multiply() {
        System.out.println("Total multiplication: " + (x * y));

    }

    @Override
    public void division() {
        System.out.printf("Total division with 3 decimals: %.3f%n%n", ((double)x / y) );

    }
}
public class Main {
    public static void main(String[] args) {

        var addResult = new Calc();

        addResult.add();
        addResult.subtract();
        addResult.multiply();
        addResult.division();
    }
}