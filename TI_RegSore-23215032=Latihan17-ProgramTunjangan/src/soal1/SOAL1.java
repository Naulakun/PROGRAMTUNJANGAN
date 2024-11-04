/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author 
 * NAMA         : AYIP NANDANG MAULANA
 * NIM          : 23215032
 * KELAS        : PBO 1 REG.SORE
 * DESKRIPSI    : PROGRAM TUNJANGAN YOUNGLEX 
 */
import java.util.Scanner;

public class SOAL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input gaji pokok
        System.out.print("Masukkan gaji pokok: Rp ");
        double gajiPokok = input.nextDouble();

        // Input status pernikahan
        System.out.print("Apakah Anda sudah menikah? (ya/tidak): ");
        String status = input.next();

        // Variabel untuk tunjangan dan total gaji
        double tunjangan = 0;
        double totalGaji = gajiPokok;

        // Cek status pernikahan
        if (status.equalsIgnoreCase("ya")) {
            tunjangan = 0.35 * gajiPokok;
            totalGaji += tunjangan;
        }

        // Output tunjangan dan total gaji
        System.out.printf("Tunjangan: Rp %.2f\n", tunjangan);
        System.out.printf("Total Gaji: Rp %.2f\n" ,totalGaji);

        input.close();
    }
}
