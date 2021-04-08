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
public class Lingkaran implements MenghitungBidang{
    private double r;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public double luas() {
        System.out.println("LUAS LINGKARAN  : " + luas(r) );
        return 0;
    }
    public double luas(double r){
        return 3.14*r*r;
    }

    @Override
    public double keliling() {
        System.out.println("KELILING LINGKARAN  : " + keliling(r) );
        return 0;
    }
    
    public double keliling(double r) {
        return 3.14*2*r;
    }
    
}
