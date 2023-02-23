/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */

public class BangunDatar {
    
    public int sisi, panjang, lebar, radius, diameter;

    public int squareLuas(){
        int luas;
        luas = this.sisi * this.sisi;
        return luas;
    }
    public int squareKeliling(){
        int keliling;
        keliling = this.sisi * 4;
        return keliling;
    }
    public int rectangleLuas(){
        int luas;
        luas = this.panjang * this.lebar;
        return luas;
    } 
    public int rectangleKeliling(){
        int keliling;
        keliling = 2 * (this.panjang * this.lebar);
        return keliling;
    }
    public double circleLuas(){
        double luas;
        double pi;
        pi = 3.14;
        luas = pi * this.radius * this.radius;
        return luas;
    }
    public double circleKeliling(){
        double keliling;
        double pi;
        pi = 3.14;
        keliling = 2 * pi * this.radius;
        return keliling;
    }
    public double elipsLuas(){
        double luas;
        luas = 1;
        return luas;
    }
}