/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author tomas
 */
public class stozek 
{
    private double r = 0;
    private double l = 0;
    private double h = 0;
    
    public void stozekInit(double ri,double li,double hi)
    {
        this.r = ri;
        this.l = li;
        this.h = hi;
    }
    
    public double stozekAr()
    {
        return Math.PI*this.r*(this.r+this.l);
    }
    
    public double stozekVol()
    {
        return (1/3)*this.r*this.r*Math.PI*this.h;
    }
    
    public void stozekInfo()
    {
        System.out.println("STOŻEK:");
        System.out.println("Pole stożka: "+stozekAr());
        System.out.println("Objetosc stożka: "+stozekVol());
    }
}
