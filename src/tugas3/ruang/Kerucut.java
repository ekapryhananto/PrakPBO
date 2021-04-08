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
public class Kerucut implements MenghitungRuang{
    private double r, t;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public Kerucut(double r, double t) {
        this.r = r;
        this.t = t;
    }

    @Override
    public double volume() {
        System.out.println("VOLUME KERUCUT          :" + volume(r, t));
        return 0;
    }
    
    public double volume(double r, double t){
        return (1*3.14*r*r*t)/3;
    }

    @Override
    public double luas() {
        System.out.println("LUAS PERMUKAAN KERUCUT  :" + luas(r, t));
        return 0;
    }
    
    public double luas(double r, double t){
         float s;
        s = (float) Math.sqrt(Math.pow(r,2) + Math.pow(t,2));
        return 3.14*r*(r+s);
    }
        
    }
