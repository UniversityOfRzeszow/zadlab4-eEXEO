/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;
import java.util.Scanner;


public class student 
{
    
    Scanner imp = new Scanner(System.in);
    private String imie = "";
    private String nazwisko = "";
    private int nr_indeks = 0;
    private int rokst = 0;
    private String specn = "";
    
    public void setStudent(String im, String na, int nr, int rst, String spec)
    {
        this.imie = im;
        this.nazwisko = na;
        this.nr_indeks = nr;
        this.rokst = rst;
        this.specn = spec;
    }
    
    public void setStudent(String im, String na)
    {
        this.imie = im;
        this.nazwisko = na;
    }
    
    public void setStudent(String im, String na, int nr)
    {
        this.imie = im;
        this.nazwisko = na;
        this.nr_indeks = nr;
    }
    
    public void setStudent(String im, String na, String spec)
    {
        this.imie = im;
        this.nazwisko = na;
        this.specn = spec;
    }
    
    public void setDef()
    {
        this.imie = "";
        this.nazwisko = "";
        this.nr_indeks = 0;
        this.rokst = 0;
        this.specn = "";
    }
    
    public void setDane()
    {
        System.out.println("Podaj imie:");
        this.imie = imp.nextLine();
        System.out.println("Podaj nazwisko:");
        nazwisko = imp.nextLine();
        System.out.println("Podaj numer indeksu:");
        this.nr_indeks = imp.nextInt();
        System.out.println("Podaj specjalność:");
        this.specn = imp.nextLine();
        System.out.println("Podaj rok studiów:");
        this.rokst = imp.nextInt();
    }
    
    public void showDane()
    {
        System.out.println("imie: "+this.imie);
        System.out.println("nazwisko: "+this.nazwisko);
        System.out.println("nr. indeksu: "+this.nr_indeks);
        System.out.println("rok studiów: "+this.rokst);
        System.out.println("spcjalność: "+this.specn);
    }
    
}