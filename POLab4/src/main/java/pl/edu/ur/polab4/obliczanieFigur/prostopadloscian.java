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
public class prostopadloscian 
{
    private double a = 0;
    private double b = 0;
    private double c = 0;
    
    public void prostopadloscianInit(double ai, double bi, double ci)
    {
        this.a = ai;
        this.b = bi;
        this.c = ci;
    }
    
    public double prostopadloscianLen()
    {
        return 4*this.a+4*this.b+4*this.c;
    }
    
    public double prostopadloscianAr()
    {
        return 2*(this.a*this.b)+2*(this.b*this.c)+2*(this.a*this.c);
    }
    
    public double prostopadloscianVol()
    {
        return this.a*this.b*this.c;
    }
    
    public void prostopadloscianInfo()
    {
        System.out.println("PROSTOPADŁOŚCIAN:");
        System.out.println("Pole prostopadloscianu: "+prostopadloscianAr());
        System.out.println("Dlugosc krawedzi prostopadloscianu: "+prostopadloscianLen());
        System.out.println("Objetosc prostopadloscianu: "+prostopadloscianVol());
    }
}
