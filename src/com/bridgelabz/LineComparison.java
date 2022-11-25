package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    static double length1;
    static double length2;

    public static void calculatingLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x1:-");
        int x1 = sc.nextInt();
        System.out.println("Enter the value of x2:-");
        int x2 = sc.nextInt();
        System.out.println("Enter the value of y1:-");
        int y1 = sc.nextInt();
        System.out.println("Enter the value of y2:-");
        int y2 = sc.nextInt();
        length1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("Length of the line 1 is: " + length1);

        System.out.println("Enter the value of a1:-");
        int a1 = sc.nextInt();
        System.out.println("Enter the value of a2:-");
        int a2 = sc.nextInt();
        System.out.println("Enter the value of b1:-");
        int b1 = sc.nextInt();
        System.out.println("Enter the value of b2:-");
        int b2 = sc.nextInt();
        length2 = Math.sqrt((a2 - a1) * (a2 - a1) + (b2 - b1) * (b2 - b1));
        System.out.println("Length of the line 2 is: " + length2);
    }

    private static void checkingEqualLines() {
        Double a = length1;
        Double b = length2;
        if (a.equals(b)){
            System.out.println("Lines are equal");
        }
        else {
            System.out.println("Lines are not equal");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Main Branch");
        calculatingLength();
        checkingEqualLines();
    }
}
