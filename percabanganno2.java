package com.oopjava.tugaspercabangan;

import java.util.Scanner; 

public class percabanganno2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = scanner.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = scanner.nextInt();
        
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);
        
        switch (operator) {
            case '+':
                System.out.println("Hasil: " + (bil1 + bil2));
                break;
            case '-':
                System.out.println("Hasil: " + (bil1 - bil2));
                break;
            case '*':
                System.out.println("Hasil: " + (bil1 * bil2));
                break;
            case '/':
                if (bil2 != 0) {
                    System.out.println("Hasil: " + (bil1 / bil2));
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            case '%':
                System.out.println("Hasil: " + (bil1 % bil2));
                break;
            default:
                System.out.println("Maaf tidak ditemukan");
    
    }
}
