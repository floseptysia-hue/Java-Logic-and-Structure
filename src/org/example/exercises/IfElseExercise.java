package org.example.exercises;

import java.util.Scanner;

public class IfElseExercise {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ticketing berdasarkan usia");
        System.out.println("Masukkan umur pelanggan");
        int umur = input.nextInt();

        int hargaTiket;

        if (umur < Constants.AGE_TODDLER) {
            System.out.println("Gratis untuk Balita (harus dengan dampingan orang dewasa!)");
        } else if (umur <= Constants.AGE_CHILD_MAX) {
            hargaTiket = Constants.PRICE_CHILD;
            System.out.println("Tiket Anak: Rp" + hargaTiket);
        } else if (umur <= Constants.AGE_ADULT_MAX) {
            hargaTiket = Constants.PRICE_ADULT;
            System.out.println("Tiket Dewasa: Rp" + hargaTiket);
        } else {
            hargaTiket = Constants.PRICE_SENIOR;
            System.out.println("Diskon khusus Lansia! Tiket: Rp" + hargaTiket);
        }
        System.out.println("Terimakasih sudah membeli tiket disini! Semoga kunjungan anda menyenangkan!\n");


    }
}