/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3.ruang;

/**
 *
 * @author ekapr
 */
public class Balok implements MenghitungRuang{
    private double p, l, t;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public Balok(double p, double l, double t) {
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    public double volume() {
        System.out.println("VOLUME BALOK            : " + volume(p, l, t));
        return 0;
    }
    
    public double volume(double p, double l, double t){
        return p*l*t;
    }

    @Override
    public double luas() {
        System.out.println("LUAS PERMUKAAN BALOK    : " + luas(p, l, t));
        return 0;
    }
    
    public double luas(double p, double l, double t){
        return 2*(p*l + p*t + l*t);
    }
    
    
}
