package com.Pertemuan7;

public class Main {
    public static void main(String[] args) {
        //membuat objek bangun datar
        BangunDatar mBangunDatar=new BangunDatar();

        //membuat objek Persegi dan mengisi nilai
        Persegi mPersegi=new Persegi();
        mPersegi.sisi=7;

        //membuat objek PersegiPanjang dan mengisi nilai
        PersegiPanjang mPersegiPanjang = new PersegiPanjang();
        mPersegiPanjang.panjang=5;
        mPersegiPanjang.lebar=6;

        //membuat objek lingkaran dan mengisi nilai properti
        Lingkaran mLingkaran = new Lingkaran();
        mLingkaran.r=13;

        //membuat objek Segitiga dan mengisi nilai
        Segitiga mSegitiga=new Segitiga();
        mSegitiga.alas=6;
        mSegitiga.tinggi=7;

        //memanggil method luas dan keliling
        mBangunDatar.luas();
        mBangunDatar.keliling();

        System.out.println(" ");
        mLingkaran.luas();
        mLingkaran.keliling();

        System.out.println(" ");
        mPersegi.luas();
        mPersegi.keliling();

        System.out.println(" ");
        mPersegiPanjang.luas();
        mPersegiPanjang.keliling();

        System.out.println(" ");
        mSegitiga.luas();

    }
}
