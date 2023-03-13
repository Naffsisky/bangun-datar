/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Limas {
    public int alas, tinggi;
    public double volume;
    
    public void Limas(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public void setAlas(int alas){
        this.alas = alas;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void hitungVolume(){
        double hitung = (1*(this.alas*this.alas)*this.tinggi)/3;
        this.volume = hitung;
    }
    public double totalVolume(){
        return this.volume;
    }
}
