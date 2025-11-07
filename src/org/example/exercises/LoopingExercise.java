package org.example.exercises;

import java.util.Scanner;

public class LoopingExercise {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Looping Bilangan Ganjil ===");
        System.out.print("Tampilkan bilangan ganjil sampai: ");

        int maximum = input.nextInt();

        System.out.println("\nMenggunakan for loop:");

        boolean first = true;

        for (int i = 1; i <= maximum; i++) {
            if (i % 2 != 0) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(i);
                first = false;
            }
        }

        System.out.println("\n Menggunakan while loop:");

        int j = 1;
        boolean checkComma = true;

        while (j <= maximum) {
            if (j % 2 != 0) {
                if (!checkComma) {
                    System.out.print(", ");
                }
                System.out.print(j);
                checkComma = false;
            }
            j++;
        }

        System.out.println("\n");
    }
}