package org.example.exercises;

import org.example.exercises.helpers.Constants;
import org.example.exercises.helpers.Converter;

import java.util.Scanner;

public class IfElseExercise {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Ticketing berdasarkan usia");
        System.out.println("Masukkan umur pelanggan");

        int umur = input.nextInt();
        int priceTicket;

        if (umur <= Constants.AGE_TODDLER) {
            System.out.println("Gratis untuk Balita (harus dengan dampingan orang dewasa!)");
        } else if (umur >= Constants.AGE_CHILD_MAX) {
            if (umur <= Constants.AGE_ADULT_MAX) {
                priceTicket = Constants.PRICE_ADULT;
                System.out.println("Tiket Dewasa: " + Converter.toCurrency(priceTicket));
            } else {
                priceTicket = Constants.PRICE_SENIOR;
                System.out.println("Diskon khusus Lansia! Tiket: " + Converter.toCurrency(priceTicket));
            }
        } else {
            priceTicket = Constants.PRICE_CHILD;
            System.out.println("Tiket Anak: " + Converter.toCurrency(priceTicket));
        }

        System.out.println("Terimakasih sudah membeli tiket disini! Semoga kunjungan anda menyenangkan!\n");
    }
}