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
public class KonzolosFeladat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Harcos h = new Harcos(10, "Ugrás", "Kevin", "faj");
        h.eszkozFelvetel(new Eszkoz("Kalapács", 10));
        System.out.println(h);
        h.eldobEszkoz(new Eszkoz("Kard", 8));
        h.rendezesEsMasolasa();
        System.out.println(h);

        
    }
    
}
