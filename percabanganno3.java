package com.oopjava.tugaspercabangan;

import java.util.Scanner; 

public class percabanganno3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Pertama masukkan jam mulai: ");
        int jamMulai = scanner.nextInt();
        
        System.out.print("Lalu masukkan menit mulai: ");
        int menitMulai = scanner.nextInt();
        
        System.out.print("Sekarang masukkan jam selesai: ");
        int jamSelesai = scanner.nextInt();
        
        System.out.print("Terakhir masukkan menit selesai: ");
        int menitSelesai = scanner.nextInt();
        
        int totalMenitMulai = (jamMulai * 60) + menitMulai;
        int totalMenitSelesai = (jamSelesai * 60) + menitSelesai;
        int selisihMenit = totalMenitSelesai - totalMenitMulai;
        
        int lamaJam = selisihMenit / 60;
        int lamaMenit = selisihMenit % 60;
        
        System.out.println("Jadi, lama waktu: " + lamaJam + " jam " + lamaMenit + " menit guys");
    }
}
