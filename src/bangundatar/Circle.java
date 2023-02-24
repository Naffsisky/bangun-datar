/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Circle {
    public int radius;
    public double pi;
    
    public double Luas(){
        double luas;
        pi = 3.14;
        luas = pi * this.radius * this.radius;
        return luas;
    }
    public double Keliling(){
        double keliling;
        pi = 3.14;
        keliling = 2 * pi * this.radius;
        return keliling;
    }
}
