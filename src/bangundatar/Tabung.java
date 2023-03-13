/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Tabung {
    public int radius, tinggi; 
    public double volume, phi;
    
    public void Tabung(int radius, int tinggi, double phi){
        this.radius = radius;
        this.tinggi = tinggi;
        this.phi = phi;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void setPhi(double phi){
        this.phi = phi;
    }
    public void hitungVolume(){
        double hitung = this.phi * this.radius * this.radius * this.tinggi;
        this.volume = hitung;
    }
    public double totalVolume(){
        return this.volume;
    }
}
