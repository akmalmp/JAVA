package com.Akmmp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MainMenu();

    }

    //Main Menu
    public static void MainMenu(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int menu;

        System.out.println("\n-=-=-= HITUNG PROJECT =-=-=-\n");
        System.out.println("1.Hitung luas\n");
        System.out.println("2.Hitung Keliling\n");
        System.out.println("3.Hitung volume\n");
        System.out.println("0.tutup\n");

        System.out.print("\nPilih Menu = ");
        menu = scan.nextInt();

        switch (menu){
            case 1:
                HitungLuas();
            case 2:
                HitungKeliling();
            case 3:
                HitungVolume();
            case 0:
                clearScreen();
                System.out.println("\n\n\nBYE\n\n");
                System.exit(0);
            default:
                clearScreen();
                System.out.println("\n\nmenu tidak ditemukan\n");
                kembaliMenu();
        }
    }


    private static void kembaliMenu(){
        try{
            System.in.read();
        }catch(Exception e){}

        MainMenu();
    }





    // Menu HitungLuas
    public static void HitungLuas(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        System.out.println("\n===== PROGRAM HITUNG LUAS =====\n");

        System.out.println("1.segi empat\n");
        System.out.println("2.segitiga\n");
        System.out.println("3.lingkaran\n");
        System.out.println("4.trapesium\n");
        System.out.println("0.kembali\n");

        System.out.print("\npilih menu = ");
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
                kembaliMenu();;
            default:
                clearScreen();
                System.out.println("\n\nmenu tidak ditemukan\n");
                displaymenu();
        }

    }


    private static void pilihsegiempat(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int menu;

        System.out.println("\nPROGRAM SEGI EMPAT\n");
        System.out.println("1.persegi\n");
        System.out.println("2.persegi panjang\n");
        System.out.println("0.kembali\n");

        System.out.print("\nPilih menu = ");
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
                System.out.println("\n\nMenu tidak ditemukan\n");
                kembaliSegiEmpat();
        }


    }


    private static void pilihLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int menu;

        System.out.println("\nPROGRAM LINGKARAN\n");
        System.out.println("1.seperempat lingkaran\n");
        System.out.println("2.setengah lingkaran\n");
        System.out.println("3.sepertiga lingkaran\n");
        System.out.println("4.lingkaran\n");
        System.out.println("0.kembali\n");

        System.out.print("\npilim menu = ");
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
                System.out.println("\n\nmenu tidak ditemukan\n");
                kembaliLingkaran();
        }


    }


    private static void kembaliSegiEmpat(){
        try{
            System.in.read();
        }catch(Exception e){}

        pilihsegiempat();
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

        System.out.println("\n=== LUAS PERSEGI ===\n");

        System.out.print("masukan panjang sisi = ");
        sisi = scan.nextInt();

        luas = sisi * sisi;

        System.out.println("\nluasnya = " + luas + "\n");

        kembaliSegiEmpat();
    }


    private static void persegipanjang(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        int panjang, lebar, luas;

        System.out.println("\n=== LUAS PERSEGI PANJANG ===\n");

        System.out.print("masukan panjang = ");
        panjang = scan.nextInt();

        System.out.print("\nmasukan lebar = ");
        lebar = scan.nextInt();

        luas = panjang * lebar;

        System.out.println("\nluasnya = " + luas + "\n");

        kembaliSegiEmpat();
    }


    private static void segitiga(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double alas, tinggi, luas;

        System.out.println("\n=== LUAS SEGITIGA ===\n");

        System.out.print("masukan alas = ");
        alas = scan.nextFloat();

        System.out.print("\nmasukan tinggi = ");
        tinggi = scan.nextFloat();

        luas = 0.5 * (alas * tinggi);

        System.out.println("\nluasnya = " + luas + "\n");

        displaymenu();
    }


    private static void lingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double jari, luas;

        System.out.println("\n=== LUAS LINGKARAN ===\n");

        System.out.print("masukan jari = ");
        jari = scan.nextFloat();

        System.out.println("\n*phi = 3.14\n");
        luas = 3.14 * (jari * jari);

        System.out.println("\nluasnya = " + luas + "\n");

        displaymenu();
    }


    private static void trapesium(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double alas,sisi1,sisi2 , tinggi, luas;

        System.out.println("\n=== LUAS TRAPESIUM ===\n");

        System.out.print("masukan sisi 1 = ");
        sisi1 = scan.nextFloat();

        System.out.print("\nmasukan sisi 2 = ");
        sisi2 = scan.nextFloat();

        System.out.print("\nmasukan tingi = ");
        tinggi = scan.nextFloat();

        luas = 0.5 * (sisi1 + sisi2) * tinggi;

        System.out.println("\nluasnya = " + luas + "\n");

        displaymenu();
    }


    private static void sepertigaLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double ruas, luas, diameter;

        System.out.println("\n=== Luas LINGKARAN ===\n");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        System.out.println("\n*phi = 3.14\n");

        diameter = ruas*ruas;

        luas = 0.75 * 3.14 * diameter;

        System.out.println("\nluasnya = " + luas + "\n");

        kembaliLingkaran();
    }


    private static void setengahLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double ruas, luas, diameter;

        System.out.println("\n=== Luas LINGKARAN ===\n");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        System.out.println("\n*phi = 3.14\n");

        diameter = ruas*ruas;

        luas = 0.50 * 3.14 * diameter;

        System.out.println("\nluasnya = " + luas + "\n");

        kembaliLingkaran();
    }


    private static void seperempatLingkaran(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        double ruas, luas, diameter;

        System.out.println("\n=== Luas LINGKARAN ===\n");

        System.out.print("masukan ruas = ");
        ruas = scan.nextDouble();

        System.out.println("\n*phi = 3.14\n");

        diameter = ruas*ruas;

        luas = 0.25 * 3.14 * diameter;

        System.out.println("\nluasnya = " + luas + "\n");

        kembaliLingkaran();
    }




    //Menu HitungVolume
    private static void HitungVolume(){
        clearScreen();

        Scanner scan = new Scanner(System.in);

        System.out.println("==== HITUNG VOLUME ===");
    }




    //Menu HitungKeliling
    private static void HitungKeliling(){
       clearScreen();

       Scanner scan = new  Scanner(System.in);
       int menu;

        System.out.println("\n=== PROGRAM HITUNG KELILING ===\n");
        System.out.println("1.persegi\n");
        System.out.println("2.persegi panjang\n");
        System.out.println("3.segitiga\n");
        //System.out.println("4.lingkaran\n");
        System.out.println("0.kembali\n");
        System.out.print("\nmasukan menu = ");
        menu = scan.nextInt();

        switch(menu){
            case 1:
                persegikeliling();
            case 2:
                persegipanjangkeliling();
            case 3:
                segitigakeliling();
//          case 4:
//                lingkarankeliling();
            case 0:
                clearScreen();
                kembaliMenu();
            default:
                clearScreen();
                System.out.println("\n\nmenu tidak ditemukan!!!\n");
                kembaliHitungKeliling();
        }

    }

    private static void kembaliHitungKeliling(){
        try{
            System.in.read();
        }catch(Exception e){}

        HitungKeliling();
    }

    private static void persegikeliling(){
        clearScreen();

        Scanner scan = new Scanner(System.in);
        int sisi, input, keliling;
        sisi = 4;

        System.out.println("\n=== KELILING PERSEGI ===\n");
        System.out.print("masukan panjang sisi = ");
        input = scan.nextInt();

        keliling = sisi * input;

        System.out.println("\nkelilingnya adalah = " + keliling);

        kembaliHitungKeliling();
    }

    private static void persegipanjangkeliling(){
        clearScreen();

        Scanner scan = new Scanner(System.in);
        int sisi, panjang, lebar, keliling;
        sisi = 2;

        System.out.println("\n=== KELILING PERSEGI PANJANG ===\n");
        System.out.print("masukan panjang = ");
        panjang = scan.nextInt();

        System.out.print("\nmasukan lebar = ");
        lebar = scan.nextInt();

        keliling = sisi * (panjang + lebar);

        System.out.println("\nkelilingnya adalah = " + keliling);

        kembaliHitungKeliling();
    }

    private static void segitigakeliling(){
        clearScreen();

        Scanner scan = new Scanner(System.in);
        int sisi, keliling;

        System.out.println("\n=== KELILING SEGITIGA ===\n");
        System.out.print("masukan sisi = ");
        sisi = scan.nextInt();

        keliling = sisi + sisi + sisi;

        System.out.println("\nkelilingnya adalah = " + keliling);

        kembaliHitungKeliling();
    }



}
