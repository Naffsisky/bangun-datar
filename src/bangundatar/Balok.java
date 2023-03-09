/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangundatar;

/**
 *
 * @author naffsisky
 */
public class Balok {
    public int panjang, lebar, tinggi, volume;
    
    public void Balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = panjang;
    }
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        int calculate_vol = this.panjang * this.lebar * this.tinggi;
        this.volume = calculate_vol;
    }
    public int getVolume(){
        return this.volume;
    }
}
