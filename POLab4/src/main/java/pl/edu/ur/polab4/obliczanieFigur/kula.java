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
public class kula 
{
    private double r = 0;
    
    public void kulaInit(double lr)
    {
        this.r = lr;
    }
    
    public double kulaAr()
    {
        return 4*Math.PI*this.r*this.r;
    }
    
    public double kulaVol()
    {
        return Math.PI*this.r*this.r*this.r*(4/3);
    }
    
    public void kulaInfo()
    {
        System.out.println("KULA:");
        System.out.println("Pola kuli: "+kulaAr());
        System.out.println("Objęcość kuli: "+kulaVol());
    }
}
