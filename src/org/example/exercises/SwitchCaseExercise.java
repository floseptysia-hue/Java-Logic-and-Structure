package org.example.exercises;

import java.util.Scanner;

public class SwitchCaseExercise {
    public void run() {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu makan");
        System.out.println(Constants.MENU_SATE_PADANG + ". Sate Padang");
        System.out.println(Constants.MENU_INDOMIE_KUAH + ". Indomie kuah");
        System.out.println(Constants.MENU_NASI_PADANG + ". Nasi Padang");
        System.out.println("Pilih menu makan (1-3): ");

        int menu = input.nextInt();
        int price;
        String namaMenu = "Tidak diketahui";

        switch (menu) {
            case Constants.MENU_SATE_PADANG:
                namaMenu = "Sate Padang";
                price = Constants.PRICE_MENU_SATE_PADANG;
                break;

            case Constants.MENU_INDOMIE_KUAH:
                namaMenu = "Indomie Kuah";
                price = Constants.PRICE_MENU_INDOMIE_KUAH;
                break;

            case Constants.MENU_NASI_PADANG:
                namaMenu = "Nasi Padang";
                price = Constants.PRICE_MENU_NASI_PADANG;
                break;

            default:
                System.out.println("Tidak tersedia hari ini, mungkin besok");
                return;
        }

        System.out.println("Kamu memilih:" + namaMenu);
        System.out.println("Total harga: Rp" + price);
        System.out.println();
    }
}