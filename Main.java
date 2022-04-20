package com.company.inheritance;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        utama();
    }

    public static void utama(){
        Scanner input = new Scanner(System.in);
        System.out.print("\n===========================================================");
        System.out.print("\n|             Pembayaran Sewa Toko dan Kios               |");
        System.out.print("\n===========================================================\n");

        System.out.print("Pilihan Pembayaran\n");
        System.out.print("1. Pembayaran Sewa Toko\n");
        System.out.print("2. Pembayaran Sewa Kios\n");
        System.out.print("Masukkan Pilihan Anda : ");
        int pilihan = input.nextInt();
        System.out.print("\n===========================================================\n");

        if(pilihan==1){
            System.out.print("Masukan Nama: ");
            String nama = input.next();
            System.out.print("Masukan Jumlah Sewa: ");
            int jumlahsewa = input.nextInt();
            System.out.print("Masukan Jumlah Hari: ");
            int jumlahhari = input.nextInt();

            Toko toko = new Toko();
            toko.isi (pilihan, nama, jumlahsewa, jumlahhari);
            System.out.print("\n===========================================================\n");
            toko.printToko("Berikut Merupakan Rincian Pembayaran Sewa Toko");

        }else if(pilihan == 2){
            System.out.print("Masukan Nama: ");
            String nama = input.next();
            System.out.print("Masukan Jumlah Sewa: ");
            int jumlahsewa = input.nextInt();
            System.out.print("Masukan Jumlah Hari: ");
            int jumlahhari = input.nextInt();

            Kios kios = new Kios();
            kios.isi(pilihan, nama, jumlahsewa, jumlahhari);
            System.out.print("\n===========================================================\n");
            kios.printKios("Berikut Merupakan Rincian Pembayaran Sewa Kios");
        }else{
            Main.utama();
        }

        System.out.print("\n--------------------------------------------------------");
        System.out.print("\nKetik 1, untuk mengulang program ");
        System.out.print("\nKetik 0, untuk keluar program");
        System.out.print("\nMasukan Pilihan: ");
        int pil = input.nextInt();

        if (pil==1){
            Main.utama();
        }else {
            System.exit(0);
        }
    }
}
