/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declaration
        Square square = new Square();
        Rectangle rec = new Rectangle();
        Circle circ = new Circle();
        Elipse el = new Elipse();
        Kubus getVolume = new Kubus();
        Balok kotak = new Balok();
        Scanner input = new Scanner(System.in);
        
        // input
        System.out.println("--- MENU ---");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Elipse");
        System.out.println("5. Kubus");
        System.out.println("6. Balok");
        System.out.print("Masukan pilihan: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1 -> {
                System.out.print("Masukan sisi: ");
                square.sisi = input.nextInt();
                square.Luas();
                square.Keliling();
                System.out.println("Luas: " + square.Luas());
                System.out.println("Keliling: " + square.Keliling());
            }
            case 2 -> {
                System.out.print("Masukan panjang: ");
                rec.panjang = input.nextInt();
                System.out.print("Masukan lebar: ");
                rec.lebar = input.nextInt();
                rec.Luas();
                rec.Keliling();
                System.out.println("Luas: " + rec.Luas());
                System.out.println("Keliling: " + rec.Keliling());
            }
            case 3 -> {
                System.out.print("Masukan radius: ");
                circ.radius = input.nextInt();
                circ.Luas();
                circ.Keliling();
                System.out.println("Luas: " + circ.Luas());
                System.out.println("Keliling: " + circ.Keliling());
            }
            case 4 -> {
                System.out.print("Masukan sumbu a: ");
                el.a = input.nextInt();
                System.out.print("Masukan sumbu b: ");
                el.b = input.nextInt();
                el.Luas();
                el.Keliling();
                System.out.println("Luas: " + el.Luas());
                System.out.println("Keliling: " + el.Keliling());
            }
            case 5 -> {
                System.out.print("Masukan sisi: ");
                getVolume.volume = input.nextInt();
                getVolume.ComputeAndSetVolume();
                System.out.println("Volume: " + getVolume.ComputeAndSetVolume());
            }
            case 6 -> {
                System.out.print("Masukan panjang: ");
                kotak.panjang = input.nextInt();
                System.out.print("Masukan lebar: ");
                kotak.lebar = input.nextInt();
                System.out.print("Masukan tinggi: ");
                kotak.tinggi = input.nextInt();
                kotak.ComputeAndSetVolume();
                System.out.println("Volume: " + kotak.getVolume());
            }
            default -> System.out.println("Pilihan tidak ada!");
        }
        
    }
    
}
