package org.example.exercises;

import java.util.Scanner;

public class LoopingExercise {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Looping Bilangan Ganjil ===");
        System.out.print("Tampilkan bilangan ganjil sampai: ");
        int maximum = input.nextInt();

        System.out.println("\nMenggunakan for loop:");
        for (int i = 1; i <= maximum; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nMenggunakan while loop:");
        int j = 1;
        while (j <= maximum) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println("\n");
    }
}
