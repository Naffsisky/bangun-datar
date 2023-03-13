/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Rectangle {
    public int panjang, lebar;
    
    public int Luas(){
        int luas;
        luas = this.panjang * this.lebar;
        return luas;
    } 
    public int Keliling(){
        int keliling;
        keliling = 2 * (this.panjang * this.lebar);
        return keliling;
    }
}
