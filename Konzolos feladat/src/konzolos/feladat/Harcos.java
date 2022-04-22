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
public class Harcos extends Karakter{
    private int ero;
    private String ugyesseg;
    
    public Harcos(int ero, String ugyesseg, String nev) {
        this(ero, ugyesseg, nev, "ember");
    }

    public Harcos(int ero, String ugyesseg, String nev, String faj) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }

    public int getEro() {
        return ero;
    }

    public String getUgyesseg() {
        return ugyesseg;
    }

    @Override
    public String toString() {
        return super.toString()+ "ero=" + ero + ", ugyesseg=" + ugyesseg;
    }
    @Override
    public int compareTo(Eszkoz t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    
}
