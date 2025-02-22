package com.oopjava.tugaspercabangan;

import java.util.Scanner; 

public class percabanganno1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan desimal: ");
        String bilangan = scanner.next();
        
        int titikIndex = bilangan.indexOf('.');
        int angkaDepan = Integer.parseInt(bilangan.substring(0, titikIndex));
        int angkaBelakang = Integer.parseInt(bilangan.substring(titikIndex + 1));
        
        if (angkaDepan % 3 == 0 && angkaBelakang % 3 == 0) {
            System.out.println("Kedua angka merupakan kelipatan 3, yeay");
        } else {
            System.out.println("Salah satu atau kedua angka ini bukan kelipatan 3 guys");
        }
    }
}
