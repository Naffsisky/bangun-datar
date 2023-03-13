/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Square {
    public int sisi;
    
    public int Luas(){
        int luas;
        luas = this.sisi * this.sisi;
        return luas;
    }
    public int Keliling(){
        int keliling;
        keliling = this.sisi * 4;
        return keliling;
    }
}
