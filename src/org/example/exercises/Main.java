package org.example.exercises;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("Tugas Day 21 Latihan Automation Java : ");
            System.out.println("1. IfElse Exercise (Tiket berdasarkan usia)");
            System.out.println("2. SwitchCase Exercise (Menu makanan MBG) ");
            System.out.println("3. Looping Exercise (Bilangan ganjil)");
            System.out.println("0. Keluar");
            System.out.println("Pilih latihan automation yang ingin dijalankan : \n");
            pilihan = input.nextInt();
            switch (pilihan) {
                case Constants.CONDITION:
                    new IfElseExercise().run();
                    break;
                case Constants.SWITCH_CASE:
                    new SwitchCaseExercise().run();
                    break;
                case Constants.LOOPING:
                    new LoopingExercise().run();
                    break;
                case Constants.EXIT:
                    System.out.println("Terimakasih! Belanjanya selesai dengan sangat mantap!");
                default:
                    System.out.println("Bisa silahkan dipilih lagi ya. See you!");
            }
            System.out.println();
        } while (pilihan != 0);
    }
}
