/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Elipse {
    public int a, b;
    public double pi;
    
    public double Luas(){
        double luas;
        pi = 3.14;
        luas = pi * this.a * this.b;
        return luas;
    }
    public double Keliling(){
        double keliling;
        pi = 3.14;
        keliling = 2 * pi * (Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)) / 2));
        return keliling;
    }
}
