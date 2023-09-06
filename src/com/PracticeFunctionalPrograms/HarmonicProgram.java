package com.PracticeFunctionalPrograms;

import java.util.Scanner;

public class HarmonicProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Harmonic series of  " + num + " numbers");
        for (int i = 1; i <= num; i++) {
            System.out.print("1/" + i+" ");
            if (i != num) {
                System.out.print(" + ");
            }

        }
//        System.out.println();
    }
}
