/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.bidang;

/**
 *
 * @author ekapr
 */
public class PersegiPanjang implements MenghitungBidang {
   private double  panjang;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
   private double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double luas() {
        System.out.println("LUAS PERSEGI    : " + luas(panjang, lebar));
        return 0;
    }
    
    public double luas(double panjang, double lebar){
        return panjang*lebar;
    }

    @Override
    public double keliling() {
        System.out.println("KELILING PERSEGI    : " + keliling(panjang, lebar));
        return 0;
    }
    
    public double keliling(double panjang, double lebar){
        return 2*(panjang + lebar);
    }
    
   
}
