package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HitungLuas();

    }

    public static void HitungLuas(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        System.out.println("===== PROGRAM HITUNG LUAS =====");

        System.out.println("1.segi empat");
        System.out.println("2.segitiga");
        System.out.println("3.lingkaran");
        System.out.println("4.trapesium");
        System.out.println("0.tutup");

        System.out.print("pilih menu = ");
        int menu = scan.nextInt();

        switch (menu){
            case 1:
                pilihsegiempat();
            case 2:
                segitiga();
            case 3:
                pilihLingkaran();
            case 4:
                trapesium();
            case 0:
                clearScreen();
                System.out.println("BYE BITCH");
                System.exit(0);
            default:
                clearScreen();
                System.out.println("menu tidak ditemukan");
                displaymenu();
        }

    }

    private static void kembaliSegiEmpat(){
        try{
            System.in.read();
        }catch(Exception e){}

        pilihsegiempat();
    }



    private static void pilihsegiempat(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int menu;

        System.out.println("PROGRAM SEGI EMPAT");
        System.out.println("1.persegi");
        System.out.println("2.persegi panjang");
        System.out.println("0.kembali");

        System.out.print("Pilih menu = ");
        menu = scan.nextInt();

        switch (menu) {
            case 1:
                persegi();
            case 2:
                persegipanjang();
            case 0:
                clearScreen();
                displaymenu();
            default:
                clearScreen();
                System.out.println("Menu tidak ditemukan");
                kembaliSegiEmpat();
        }


    }

    private static void pilihLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int menu;

        System.out.println("PROGRAM LINGKARAN");
        System.out.println("1.seperempat lingkaran");
        System.out.println("2.setengah lingkaran");
        System.out.println("3.sepertiga lingkaran");
        System.out.println("4.lingkaran");
        System.out.println("0.kembali");

        System.out.print("pilim menu = ");
        menu = scan.nextInt();

        switch(menu){
            case 1:
                seperempatLingkaran();
            case 2:
                setengahLingkaran();
            case 3:
                sepertigaLingkaran();
            case 4:
                lingkaran();
            case 0:
                clearScreen();
                displaymenu();
            default:
                clearScreen();
                System.out.println("menu tidak ditemukan");
                kembaliLingkaran();
        }


    }

    private static void kembaliLingkaran(){
        try{
            System.in.read();
        }catch(Exception e){}

        pilihLingkaran();
    }



    private static void displaymenu(){
        try{
            System.in.read();
        }catch(Exception e){}

        HitungLuas();
    }

    private static void clearScreen(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception E){
            System.out.println(E);
        }
    }

    private static void persegi(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int sisi,luas;

        System.out.println("=== LUAS PERSEGI ===");

        System.out.print("masukan panjang sisi = ");
        sisi = scan.nextInt();

        luas = sisi * sisi;

        System.out.println("luasnya = " + luas);

        kembaliSegiEmpat();
    }

    private static void persegipanjang(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("=== LUAS PERSEGI PANJANG ===");

        System.out.print("masukan panjang = ");
        panjang = scan.nextInt();

        System.out.print("masukan lebar = ");
        lebar = scan.nextInt();

        luas = panjang * lebar;

        System.out.println("luasnya = " + luas);

        kembaliSegiEmpat();
    }





    private static void segitiga(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double alas, tinggi, luas;

        System.out.println("=== LUAS SEGITIGA ===");

        System.out.print("masukan alas = ");
        alas = scan.nextFloat();

        System.out.print("masukan tinggi = ");
        tinggi = scan.nextFloat();

        luas = 0.5 * (alas * tinggi);

        System.out.println("luasnya = " + luas);

        displaymenu();
    }



    private static void lingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double jari, luas;

        System.out.println("=== LUAS LINGKARAN ===");

        System.out.print("masukan jari = ");
        jari = scan.nextFloat();

        System.out.println("*phi = 3.14");
        luas = 3.14 * (jari * jari);

        System.out.println("luasnya = " + luas);

        displaymenu();
    }

    private static void trapesium(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double alas,sisi1,sisi2 , tinggi, luas;

        System.out.println("=== LUAS TRAPESIUM ===");

        System.out.print("masukan sisi 1 = ");
        sisi1 = scan.nextFloat();

        System.out.print("masukan sisi 2 = ");
        sisi2 = scan.nextFloat();

        System.out.print("masukan tingi = ");
        tinggi = scan.nextFloat();

        luas = 0.5 * (sisi1 + sisi2) * tinggi;

        System.out.println("luasnya = " + luas);

        displaymenu();
    }

       private static void sepertigaLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double ruas, luas, diameter;

        System.out.println("=== Luas LINGKARAN ===");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        System.out.println("*phi = 3.14");

        diameter = ruas*ruas;

        luas = 0.75 * 3.14 * diameter;

        System.out.println("luasnya = " + luas);

        kembaliLingkaran();
    }

    private static void setengahLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double ruas, luas, diameter;

        System.out.println("=== Luas LINGKARAN ===");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        System.out.println("*phi = 3.14");

        diameter = ruas*ruas;

        luas = 0.50 * 3.14 * diameter;

        System.out.println("luasnya = " + luas);

        kembaliLingkaran();
    }


    private static void seperempatLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double ruas, luas, diameter;

        System.out.println("=== Luas LINGKARAN ===");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        System.out.println("*phi = 3.14");

        diameter = ruas*ruas;

        luas = 0.25 * 3.14 * diameter;

        System.out.println("luasnya = " + luas);

        kembaliLingkaran();
    }





}









