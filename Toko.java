package com.company.inheritance;

public class Toko extends BayarSewa{
    int hitungSewaToko(){
        int total;
        total = this.jumlahsewa * 10000 * this.jumlahhari;
        return total;
    }

    public void printToko(String pembayaran){
        System.out.println(" " +pembayaran);
        System.out.println(" Nama Pedagang = " + this.nama);
        System.out.println(" Jumlah Sewa Toko = " + this.jumlahsewa);
        System.out.println(" Jumlah Hari = " +this.jumlahhari);
        System.out.println(" Total Pembayaran = " +this.hitungSewaToko());
    }
}
