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
public class kwadrat 
{
    private double a = 0;
    
    public void kwadratInit(double ai)
    {
        this.a = ai;
    }
    
    public double kwadratLen()
    {
        return this.a*4;
    }
    
    public double kwadratAr()
    {
        return this.a*this.a;
    }
    
    public void kwadratInfo()
    {
        System.out.println("KWADRAT:");
        System.out.println("Pole kwadratu: "+kwadratAr());
        System.out.println("Długość krawędzi: "+kwadratLen());
    }
}
