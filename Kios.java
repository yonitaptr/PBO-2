package com.company.inheritance;

public class Kios extends BayarSewa{
    int hitungSewaKios(){
        int total;
        total = this.jumlahsewa * 5000 * this.jumlahhari;
        return total;
    }

    public void printKios(String pembayaran){
        System.out.println(" " +pembayaran);
        System.out.println(" Nama Pedagang = " + this.nama);
        System.out.println(" Jumlah Sewa Kios = " + this.jumlahsewa);
        System.out.println(" Jumlah Hari = " +this.jumlahhari);
        System.out.println(" Total Pembayaran = " +this.hitungSewaKios());
    }
}
