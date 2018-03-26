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
public class szescian 
{
    private double a = 0;
    
    public void szescianInit(double ai)
    {
        this.a = ai;
    }
    
    public double szescianLen()
    {
            return this.a*12;
    }
    
    public double szescianAr()
    {
        return (this.a*this.a)*6;
    }
    
    public double szescianVol()
    {
        return this.a*this.a*this.a;
    }
    
    public void szescianInfo()
    {
        System.out.println("SZEŚCIAN:");
        System.out.println("Pole szescianu: "+szescianAr());
        System.out.println("Długość krawędzi: "+szescianLen());  
        System.out.println("Objetość sześcianu: "+szescianVol()); 
    }
}
