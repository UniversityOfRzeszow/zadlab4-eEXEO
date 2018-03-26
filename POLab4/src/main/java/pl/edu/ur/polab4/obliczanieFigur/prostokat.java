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
public class prostokat 
{
    private double a = 0;
    private double b = 0;
    
    public void prostokatInit(double ai, double bi)
    {
        this.a = ai;
        this.b = bi;
    }
    
    public double prostokatLen()
    {
        return this.a+this.a+this.b+this.b;
    }
    
    public double prostokatAr()
    {
        return this.a*this.b;
    }
    
    public void prostokatInfo()
    {
        System.out.println("PROSTOKĄT:");
        System.out.println("Pole prostokwatu: "+prostokatAr());
        System.out.println("Długość krawędzi: "+prostokatLen());
    }
}
