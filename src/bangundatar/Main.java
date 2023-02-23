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
        BangunDatar rumus = new BangunDatar();
        Scanner input = new Scanner(System.in);
        // input
        System.out.println("--- MENU ---");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Elipse");
        System.out.print("Masukan pilihan: ");
        int pilihan = input.nextInt();
        if(pilihan == 1){
            System.out.print("Masukan sisi: ");
            rumus.sisi = input.nextInt();
            rumus.squareLuas();
            rumus.squareKeliling();
            System.out.println("Luas: " + rumus.squareLuas());
            System.out.println("Keliling: " + rumus.squareKeliling());
        }
        else if(pilihan == 2){
            System.out.print("Masukan panjang: ");
            rumus.panjang = input.nextInt();
            System.out.print("Masukan lebar: ");
            rumus.lebar = input.nextInt();
            rumus.rectangleLuas();
            rumus.rectangleKeliling();
            System.out.println("Luas: " + rumus.rectangleLuas());
            System.out.println("Keliling: " + rumus.rectangleKeliling());
        }
        else if(pilihan == 3){
            System.out.print("Masukan radius: ");
            rumus.radius = input.nextInt();
            rumus.circleLuas();
            rumus.circleKeliling();
            System.out.println("Luas: " + rumus.circleLuas());
            System.out.println("Keliling: " + rumus.circleKeliling());
        }
        else if(pilihan == 4){
            
        }
        else{
            System.out.println("Pilihan tidak ada!");
        }
        
    }
    
}
