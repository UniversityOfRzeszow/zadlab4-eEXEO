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
public class kolo 
{
    private double r = 0;
    
    public void koloInit(double lr)
    {
        this.r = lr;
    }
    
    public double koloLen()
    {
        return 2*this.r*Math.PI;
    }
    
    public double koloAr()
    {
        return Math.PI*this.r*this.r;
    }
    
    public void koloInfo()
    {
        System.out.println("KOŁO:");
        System.out.println("Pola koła: "+koloAr());
        System.out.println("Długość koła: "+koloLen());
    }
}
