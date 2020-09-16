package com.tutorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

//        int panjang, lebar;
//        panjang = 6;
//        lebar = 4;

        int a = 10;
        int b = 10;
        int hasil = tambah(a,b);
        System.out.println(hasil);

        Scanner userIput = new Scanner(System.in);

        System.out.print("panjang = ");
        int inputPanjang = userIput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userIput.nextInt();

        // dari method gambar
        gambar(inputPanjang, inputLebar);

        // dari method luas dan keliling
        System.out.println("Luas = " + luas(inputPanjang, inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang,inputLebar));


        System.out.println("\n");
        tampilkanKelilingDanLuas(inputPanjang,inputLebar);
    }

    private static void tampilkanKelilingDanLuas(int panjang, int lebar){
        System.out.println("Luas = " + luas(panjang, lebar));
        System.out.println("keliling = " + keliling(panjang,lebar));

    }

    // method keliling
    private static int keliling(int panjang, int lebar){
        int hasil;
        hasil = (panjang + lebar) * 2;
        return hasil;
    }

    // method luas
    private static int luas(int panjang, int lebar){
        int hasil;
        hasil =  panjang * lebar;
        return hasil;

    }

    // method gambar
    private  static void gambar(int panjang, int lebar){
        for (int i = 0; i < lebar; i++){
            for (int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    private static int tambah(int a, int b){
        int hasil = a + b;

        return hasil;

    }

}
