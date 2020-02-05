package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HitungLuas();

    }

    private static void HitungLuas(){
        clearScreen();

        int menu;
        Scanner scan = new Scanner(System.in);

        System.out.println("=== HITUNG LUAS ===");
        System.out.println("1.persegi");
        System.out.println("2.persegi panjang");
        System.out.println("3.segitiga");
        System.out.println("4.lingkaran");
        System.out.println("0.tutup");

        System.out.print("pilih menu: ");
        menu = scan.nextInt();

        switch (menu){
            case 1:
                persegi();
                break;
            case 2:
                persegipanjang();
                break;
            case 3:
                segitiga();
                break;
            case 4:
                lingkaran();
            case 0:
                System.out.println("BYE");
                System.exit(0);
            default:
                System.out.println("MENU TIDAK DITEMUKAN!!!");
                display_menu();
        }




    }

    private static void display_menu(){

        try{
            System.in.read();
        }catch (Exception e){}

        HitungLuas();

    }

    public static void clearScreen(){

        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }catch (Exception E){
            System.out.println(E);
        }

}

    public static void persegi(){
        clearScreen();

        Scanner input = new Scanner(System.in);

        System.out.println("=== LUAS PERSEGI ===");

        System.out.print("masukan panjang sisi = ");
        int sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("luasnya adalah = " + luas);

        display_menu();

    }

    public static void persegipanjang(){
        clearScreen();

        Scanner input = new Scanner(System.in);

        System.out.println("=== LUAS PERSEGI PANJANG ===");

        System.out.print("masukan panjang = ");
        int panjang = input.nextInt();

        System.out.print("masukan lebar = ");
        int lebar = input.nextInt();

        int luas = panjang * lebar;

        System.out.println("luasnya adalah = " + luas);

        display_menu();
    }

    public static void segitiga(){
        clearScreen();

        Scanner scan = new Scanner(System.in);
        double alas,tinggi,luas;

        System.out.println("=== LUAS SEGITIGA ===");

        System.out.print("masukan alas = ");
        alas = scan.nextFloat();

        System.out.print("masukan tinggi = ");
        tinggi = scan.nextFloat();

        luas = 0.5 * alas * tinggi;

        System.out.println("luasnya adalah = " + luas);

        display_menu();



    }

    public static  void lingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);
        double ruas,luas;

        System.out.println("=== LUAS LINGKARAN ===");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        luas = 3.14 * (ruas * ruas);

        System.out.println("luasnya adalah = " + luas);


        System.out.println("");

        System.out.println("*phi = 3.14");


        display_menu();
    }

}
