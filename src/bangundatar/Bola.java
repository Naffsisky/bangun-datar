/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Bola {
    public int r;
    public double volume, phi;
    
    public void Bola(int r){
        this.r = r;
    }
    public void setJarijari(int r){
        this.r = r;
    }
    public void setPhi(double phi){
        this.phi = phi;
    }
    public void hitungVolume(){
        double hitung = 4 * (phi * this.r * this.r * this.r) / 3;
        this.volume = hitung;
    }
    public double totalVolume(){
        return this.volume;
    }
}
