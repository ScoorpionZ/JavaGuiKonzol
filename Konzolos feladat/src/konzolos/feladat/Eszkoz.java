/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konzolos.feladat;

/**
 *
 * @author varad
 */
public class Eszkoz {
    private String nev;
    private  int suly;

    public Eszkoz(String nev, int suly) {
        this.nev = nev;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public int getSuly() {
        return suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }
    
    
}
